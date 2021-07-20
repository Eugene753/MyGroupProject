package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class LicensesPage extends CommonMethods {

    @FindBy (xpath = "//input[@id='btnAdd']")
    public WebElement addLicensesButton;

    @FindBy (id = "license_name")
    public WebElement nameLicensesField;

    @FindBy (id = "btnSave")
    public WebElement saveLicensesButton;

    @FindBy (xpath = "//table[@id='recordsListTable']/tbody/tr")
    public List<WebElement> licensesNameList;

    public LicensesPage(){
        PageFactory.initElements(driver,this);
    }





}
