package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageManager {

    public static WebDriver driver;

    /**
     *
     * Open browser method
     */
    public static void setUp(){
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch(ConfigReader.getPropertyValue("browser")){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser input");
        }

        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }

    /**
     *
     * Sending text to Webelement
     * @param element
     * @param text
     */
    public static void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }

    /**
     * Wait method
     * @return
     */
    public static WebDriverWait getWait(){
        WebDriverWait wait=new WebDriverWait(driver,Constants.EXPLICIT_WAIT);
        return wait;
    }

    /**
     *
     * Waiting for element to be clickabl
     * @param element
     */
    public static void waitForClickability(WebElement element){
       getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     *
     * Waiting element to  be visible
     * @param element
     */
    public static void waitForVisibility(WebElement element){
       getWait().until(ExpectedConditions.visibilityOf(element));
    }

    /**
     *
     * Clicking on Webelement
     * @param element
     */
    public static void click(WebElement element){
        waitForClickability(element);
        element.click();
    }

    /**
     *
     * Creating Javascript executor object
     * @return
     */
    public static JavascriptExecutor getJSexecutor(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        return js;
    }

    /**
     *
     * Java Script click on Webelement
     * @param element
     */
    public static void jsClick(WebElement element){
        getJSexecutor().executeScript("arguments[0].click()",element);
    }

    /**
     *
     * Creating action class object
     * @return
     */
    public static Actions action(){
        Actions action=new Actions(driver);
        return action;
    }

    /**
     * Action class performing moving to element
     * @param element
     */
    public static void moveToElement(WebElement element){
        action().moveToElement(element).perform();
    }

    /**
     *
     * Fixing time when screenshot was taken
     * @param pattern
     * @return
     */
    public static String getTimeStamp(String pattern){
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    /**
     *
     * Looping through table of employees in employee section list
     * @param elements
     * @param name
     */
    public static void clickTableEmployeeName(List<WebElement> elements,String name) {

        List<WebElement> listEmployee;
        boolean flag=true;
        String employeeName="";

        while (flag){
            listEmployee=elements;

            for(int i=0;i<listEmployee.size();i++){
                employeeName=listEmployee.get(i).getText();
                if(employeeName.contains(name)){
                    WebElement element=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[3]/a"));
                    jsClick(element);
                    flag=false;
                    break;
                }
            }
            if(!employeeName.contains(name)){
                click(employeeListPage.nextButton);
            }
        }
    }

    /**
     *
     * Taking screenshot
     * @param fileName
     * @return
     */
    public static byte[] takeScreenshot(String fileName){
        TakesScreenshot ts=(TakesScreenshot) driver;

        byte[] picBytes=ts.getScreenshotAs(OutputType.BYTES);

        File sourceFile=ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile,new File(Constants.SCREENSHOT_FILEPATH + fileName+ " " +getTimeStamp("yyyy-MM-dd-HH-mm-ss")+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return picBytes;
    }

    /**
     *
     * Creating object of Select class
     * @param element
     * @return
     */
    public static Select getSelect(WebElement element){
        Select select=new Select(element);
        return select;
    }

    /**
     *
     * Handeling calendar dates
     * @param listMonth
     * @param date
     */
     public static void loopingMonth(List<WebElement> listMonth,String date){

        for(WebElement list:listMonth){
            String monthDate=list.getText();
            if(monthDate.equals(date)){
                list.click();
                break;
            }
        }

    }

    /**
     *
     * Clicking on calendar and handeling month, year, date
     * @param element
     * @param elementMonth
     * @param textMonth
     * @param elementYear
     * @param textYear
     * @param listMonth
     * @param date
     */
    public void handleCalendar(WebElement element,WebElement elementMonth,String textMonth,WebElement elementYear,String  textYear,List<WebElement> listMonth,String date) {
        click(element);
        getSelect(elementMonth).selectByVisibleText(textMonth);
        getSelect(elementYear).selectByVisibleText(textYear);
        loopingMonth(listMonth,date);
    }

    /**
     *
     * Closing browser
     */
    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

}
