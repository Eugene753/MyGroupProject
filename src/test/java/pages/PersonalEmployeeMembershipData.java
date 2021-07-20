package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class PersonalEmployeeMembershipData extends CommonMethods {

    @FindBy(id = "btnAddMembershipDetail")
    public WebElement addMembershipButton;

    @FindBy(id = "membership_membership")
    public WebElement membershipDropDown;

    @FindBy(id = "membership_subscriptionPaidBy")
    public WebElement subscriptionPaidByDropDown;

    @FindBy(id = "membership_subscriptionAmount")
    public WebElement subscriptionAmountField;

    @FindBy(id = "membership_currency")
    public WebElement currencyDropDown;

    @FindBy(xpath = "//input[@id='membership_subscriptionCommenceDate']")
    public WebElement subscriptionCommenceDateField;

    @FindBy(className = "ui-datepicker-month")
    public WebElement commenceDateSelectionOfMonthDropDown;

    @FindBy(className = "ui-datepicker-year")
    public WebElement commenceDateSelectionOfYearDropDown;

    @FindBy(xpath ="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> datesListDropDown;

    @FindBy(xpath = "//input[@id='membership_subscriptionRenewalDate']")
    public WebElement subscriptionsRenewalDateField;

    @FindBy(id = "btnSaveMembership")
    public WebElement saveMembershipButton;

    @FindBy(xpath = "//table[@class='table hover']/tbody/tr/td[2]")
    public List<WebElement> membershipsList;

    public PersonalEmployeeMembershipData(){
        PageFactory.initElements(driver,this);
    }

}
