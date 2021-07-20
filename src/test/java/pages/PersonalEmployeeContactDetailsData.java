package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class PersonalEmployeeContactDetailsData extends CommonMethods {

    @FindBy(id = "btnSave")
    public WebElement edit_saveButton;

    @FindBy(xpath = "//input[@id='contact_street1']")
    public WebElement AddressStreet1;

    @FindBy(id = "contact_street2")
    public WebElement AddressStreet2;

    @FindBy(id = "contact_city")
    public WebElement cityBox;

    @FindBy(id = "contact_province")
    public WebElement state_province;

    @FindBy(id = "contact_emp_zipcode")
    public WebElement zip_postalCode;

    @FindBy(id = "contact_country")
    public WebElement countryDD;

    @FindBy(id = "contact_emp_hm_telephone")
    public WebElement homeTelephoneBox;

    @FindBy(id = "contact_emp_mobile")
    public WebElement mobileBox;

    @FindBy(id = "contact_emp_work_telephone")
    public WebElement workTelephoneBox;

    @FindBy(id = "contact_emp_work_email")
    public WebElement workEmailBox;

    @FindBy(id = "contact_emp_oth_email")
    public WebElement otherEmailBox;

    @FindBy(id = "contact_state")
    public WebElement stateDD;

    public PersonalEmployeeContactDetailsData(){
        PageFactory.initElements(driver,this);
    }


}
