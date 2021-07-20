package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class MembershipsPage extends CommonMethods {

    @FindBy(id = "btnAdd")
    public WebElement addButton;

    @FindBy(id = "membership_name")
    public WebElement membershipNameField;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    @FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td[2]")
    public List<WebElement> listOfMemberships;

    public MembershipsPage(){
        PageFactory.initElements(driver,this);
    }
}
