package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddEmployeeDependantsPage extends CommonMethods {
    @FindBy(id = "welcome")
    public WebElement welcomeMessage;

    @FindBy(xpath = "//table[@id='resultTable']/tbody/tr[1+1]/td[1+1]")
       public WebElement enlistedEmployee;

    @FindBy(xpath = "//*[text()='Personal Details']")
    public WebElement personalDetailsPageDisplayed;
    @FindBy(xpath = "//*[text()='Dependents']")
    public WebElement clickDependent;

    @FindBy(xpath = "//*[text()='Assigned Dependents']")
    public WebElement dependentpageDisplayed;

    @FindBy(xpath = "//*[@id='btnAddDependent']")
    public WebElement addBtn;
    @FindBy(xpath = "//*[@name='dependent[name]']")
    public WebElement dependentsName;

    @FindBy(xpath = "//*[@name='dependent[relationshipType]']")
    public WebElement dependentsRelation;

    @FindBy(xpath="//*[@class='ui-datepicker-trigger']")
    public WebElement birthCalender;
   ///option[text()='Child']
    @FindBy(xpath="//*[@class='ui-datepicker-month']")
    public WebElement monthOfBirth;

    @FindBy(xpath="//*[@class='ui-datepicker-year']")
    public WebElement YearOfBirth;

    @FindBy(xpath="//*[@class='ui-state-default']")
    public List<WebElement> dayOfBirth;

    @FindBy(xpath="//*[@name='btnSaveDependent']")
    public WebElement saveBtn;

    @FindBy(xpath = "//table[@id='dependent_list']/tbody/tr/td")
    public List<WebElement> dependentTable;


    public AddEmployeeDependantsPage(){
        //call selenium page factory
        PageFactory.initElements(driver, this);
    }
}
