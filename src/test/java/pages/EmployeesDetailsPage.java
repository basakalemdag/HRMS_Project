package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class EmployeesDetailsPage extends CommonMethods {
    @FindBy(xpath = "//h1[text()='Personal Details']")
    public WebElement detailsDisplayed;

    @FindBy(xpath = "//a[text()='Contact Details']")
    public WebElement contactDetailBtn;

    @FindBy(xpath = "//a[text()='Dependents']")
    public WebElement dependentsBtn;

    @FindBy(xpath = "(//a[text()='Job'])[2]")
    public WebElement jobBtn;



//*****************************************************************************************//
    @FindBy(xpath = "(//a[text()='Qualifications'])[2]")
    public WebElement qualificationBtn;

    //Added by Khan Afsar (questions: Please contact)
    // Locator for Skills button and related fields under qualification page
    @FindBy(xpath = "//input[@id='addSkill']")                  // Locator for Skill Button
    public WebElement skillAddBtn;

    @FindBy(xpath = "//select[@id='skill_code']")              // Locator for dropDown
    public WebElement skillDropDown;
    @FindBy(xpath = "//input[@id='skill_years_of_exp']")      // Locator for yearOfExperience field
    public WebElement yearsOfExperience;
    @FindBy(xpath = "//textarea[@id='skill_comments']")       // Locator for Comments
    public WebElement comments;
    @FindBy(xpath = "//input[@id='btnSkillSave']")
    public WebElement saveBtn;

    //**************************************************************************************//




    @FindBy(xpath = "(//a[text()='Memberships'])[2]")
    public WebElement membershipBtn;
    public EmployeesDetailsPage(){
        PageFactory.initElements(driver,this);
    }
}
