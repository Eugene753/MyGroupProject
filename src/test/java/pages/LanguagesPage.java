package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class LanguagesPage extends CommonMethods {

    @FindBy (id = "btnAdd")
    public WebElement addBtn;

    @FindBy(id = "language_name")
    public  WebElement languageNameField;

    @FindBy(id = "btnSave")
    public WebElement saveBtn;

    @FindBy (xpath = "//table[@id='recordsListTable']/tbody/tr")
    public List<WebElement> LanguagesList;

    public LanguagesPage(){
        PageFactory.initElements(driver, this );
    }
}
