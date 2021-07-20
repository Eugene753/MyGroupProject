package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class QualificationsSkillsPage extends CommonMethods {

    @FindBy (id = "addSkill")
    public WebElement addSkillBtn;

    @FindBy (id = "skill_years_of_exp")
    public WebElement skillYearsField;

    @FindBy (id ="skill_comments")
    public WebElement skillCommentsField;

    @FindBy (id = "skill_code")
    public WebElement skillDD;

    @FindBy (id = "btnSkillSave")
    public WebElement skillSaveBtn;

    @FindBy(xpath = "//*[@id=\"frmDelSkill\"]/table")
    public List<WebElement> skillsTable;

    public QualificationsSkillsPage(){
        PageFactory.initElements(driver,this);
    }
}
