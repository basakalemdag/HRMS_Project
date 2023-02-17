package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class WorkExperiencePage extends CommonMethods {


    @FindBy(xpath = "(//a[text()='Qualifications'])[2]")
    public WebElement qualificationBtn;
    @FindBy (id="addWorkExperience")
    public WebElement WorkExperienceField;

    @FindBy (id="experience_employer")
    public WebElement CompanyField;

    @FindBy (id="experience_jobtitle")
    public WebElement JobTitleField;

    @FindBy (id="experience_from_date")
    public  WebElement FromFieldInput;

    @FindBy (id="experience_to_date")
    public WebElement ToDateInputField;

    @FindBy (xpath = "//table[@class='table hover']/tbody/tr/td")

    public List<WebElement> tableConfirm;

    @FindBy (id = "btnWorkExpSave")
    public WebElement saveBtn;


    public WorkExperiencePage(){
        PageFactory.initElements(driver,this);
    }


}
