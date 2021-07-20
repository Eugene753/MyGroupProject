package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class SkillsPage extends CommonMethods {

    @FindBy (id = "btnAdd")
    public WebElement addBtn;

    @FindBy (id = "skill_name")
    public WebElement skillNameField;

    @FindBy (id = "skill_description")
    public WebElement skillDescriptionField;

    @FindBy (id = "btnSave")
    public WebElement saveBtn;

    @FindBy (xpath = "//table[@id='recordsListTable']/tbody/tr")
    public List<WebElement> skillsNameList;

    public SkillsPage()
    { PageFactory.initElements(driver,this);}
}
