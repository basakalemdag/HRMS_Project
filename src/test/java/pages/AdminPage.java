package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AdminPage extends CommonMethods {
    @FindBy(xpath = "//a[@id ='menu_admin_viewAdminModule']")
    public WebElement adminTag;

    @FindBy(xpath = "//a[text()='Qualifications']")
    public WebElement qualificaitons;

    @FindBy(xpath = "//input[@id ='btnAdd']")
    public WebElement addButton;


    @FindBy(xpath = "//a[text()='Skills']")
    public WebElement skills;

    @FindBy(xpath = "//input[@name='skill[name]']")
    public WebElement name;

    @FindBy(xpath = "//textarea[@id='skill_description']")
    public WebElement description;

    @FindBy(xpath = "//input[@id='btnSave']")
    public WebElement saveButton;

    public AdminPage(){
        PageFactory.initElements(driver, this);
    }
}
