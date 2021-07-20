package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.PageManager;

public class PersonalEmployeeData extends CommonMethods {

    @FindBy(linkText = "Personal Details")
    public WebElement personalDetailsButton;

    @FindBy(linkText = "Contact Details")
    public WebElement contactDetailsButton;

    @FindBy(linkText = "Emergency Contacts")
    public WebElement emergencyContactsButton;

    @FindBy(linkText = "Dependents")
    public WebElement dependendsButton;

    @FindBy(linkText = "Immigration")
    public WebElement imigrationButton;

    @FindBy(linkText = "Job")
    public WebElement jobButton;

    @FindBy(linkText = "Salary")
    public WebElement salaryButton;

    @FindBy(linkText = "Tax Exemptions")
    public WebElement taxExemptionbutton;

    @FindBy(linkText = "Report-to")
    public WebElement report_toButton;

    @FindBy(linkText = "Qualifications")
    public WebElement qualificationButton;

    @FindBy(linkText = "Memberships")
    public WebElement membershipButton;



    public PersonalEmployeeData(){
        PageFactory.initElements(driver,this);
    }

}
