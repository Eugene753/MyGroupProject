package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class QualificationsLicensePage extends CommonMethods {

    @FindBy (id = "addLicense")
    public WebElement qualificationsLicenseButton;

    @FindBy (id = "license_code")
    public WebElement licenseTypeDD;

    @FindBy (id = "license_license_no")
    public WebElement licenseNumber;

    @FindBy (id = "license_date")
    public WebElement issuedDate;

    @FindBy (className = "ui-datepicker-month")
    public WebElement issuedMonth;

    @FindBy (className = "ui-datepicker-year")
    public WebElement issuedYear;

    @FindBy (xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> issuedDayTable;

    @FindBy(className = "ui-datepicker-next ui-corner-all")
    public WebElement issuedNextButton;

    @FindBy (id = "license_renewal_date")
    public WebElement expiryDate;

    @FindBy (className = "ui-datepicker-month")
    public WebElement expiryMonth;

    @FindBy (className = "ui-datepicker-year")
    public WebElement expiryYear;

    @FindBy (xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> expiryDayTable;

    @FindBy (id = "btnLicenseSave")
    public WebElement qualificationsLicenseSaveButton;

    @FindBy (xpath = "//p[@id='actionLicense']/following-sibling::table")
    public List<WebElement> addedLicenseList;

    public QualificationsLicensePage(){
        PageFactory.initElements(driver,this);
    }
}
