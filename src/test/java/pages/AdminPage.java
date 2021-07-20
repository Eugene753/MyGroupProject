package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AdminPage extends CommonMethods {

    @FindBy(id = "menu_admin_Qualifications")
    public WebElement qualificationsButton;

    @FindBy(id = "menu_admin_viewSkills")
    public WebElement skillsButton;

    @FindBy(id = "menu_admin_viewEducation")
    public WebElement educationButton;

    @FindBy(id = "menu_admin_viewLicenses")
    public WebElement licenseButton;

    @FindBy(id = "menu_admin_viewLanguages")
    public WebElement languageButton;

    @FindBy(id = "menu_admin_membership")
    public WebElement membershipButton;

    public AdminPage(){
        PageFactory.initElements(driver,this);
    }

}
