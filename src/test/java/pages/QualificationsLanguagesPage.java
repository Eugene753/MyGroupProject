package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class QualificationsLanguagesPage extends CommonMethods {
    @FindBy(id = "addLanguage")
    public WebElement addLanguageBtn;

    @FindBy (id = "language_lang_type")
    public WebElement FluencyDD;

    @FindBy (id = "language_code")
    public WebElement languageDD;

    @FindBy (id = "language_competency")
    public WebElement competencyDD;

    @FindBy (id ="language_comments")
    public WebElement languageCommentsField;

    @FindBy (id = "btnLanguageSave")
    public WebElement languageSaveBtn;

    @FindBy(xpath = "//*[@id=\"frmDelLanguage\"]/table")
    public List<WebElement> languagesTable;

    public QualificationsLanguagesPage(){
        PageFactory.initElements(driver,this);
    }
}
