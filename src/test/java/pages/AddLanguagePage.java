package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddLanguagePage extends CommonMethods {
    @FindBy (id = "addLanguage")
    public WebElement AddLanguageBtn;
    @FindBy (id = "language_code")
    public WebElement AddingLanguageDD;
    @FindBy (id = "language_lang_type")
    public WebElement FluencyDD;
    @FindBy (id = "language_competency")
    public WebElement CompetencyDD;
    @FindBy (id = "language_comments")
    public WebElement LanguageComments;
    @FindBy (id = "btnLanguageSave")
    public WebElement LanguageSaveBtn;
    @FindBy (id = "lang_data_table")
    public List<WebElement> AddedLanguageTable;

    public AddLanguagePage(){
        PageFactory.initElements(driver,this);
    }

}
