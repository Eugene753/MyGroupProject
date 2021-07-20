package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddEmployeeECAndDependentsPage extends CommonMethods {
    // locators for adding EC
    @FindBy (id="btnAddContact")
    public WebElement ECAddBtn;

    @FindBy (id="emgcontacts_name")
    public WebElement ECName;

    @FindBy (id="emgcontacts_relationship")
    public WebElement relationship;

    @FindBy (id="emgcontacts_homePhone")
    public WebElement homeTelephone;

    @FindBy (id="emgcontacts_mobilePhone")
    public WebElement mobile;

    @FindBy (id="emgcontacts_workPhone")
    public WebElement workTelephone;

    @FindBy (id ="btnSaveEContact")
    public WebElement ECSaveBtn;

// Locators for adding dependents
    @FindBy(id="btnAddDependent")
    public WebElement addDepentBtn;

    @FindBy(id="dependent_name")
    public WebElement dependentName;

    @FindBy (xpath="//*[@id=\"dependent_relationshipType\"]")
    public WebElement dependentRelationship;

    @FindBy (id="dependent_dateOfBirth")
    public WebElement dependentBoxDOfB;

    @FindBy(className = "ui-datepicker-month")
    public WebElement monthDD;

    @FindBy(className = "ui-datepicker-year")
    public WebElement yearDD;

    @FindBy(id = "btnSaveDependent")
    public WebElement saveBtn;

    @FindBy(xpath = "//table[@class ='ui-datepicker-calendar']/tbody/tr/td")
    public List< WebElement> monthDate;

    public AddEmployeeECAndDependentsPage(){
        PageFactory.initElements(driver,this);
    }
}
