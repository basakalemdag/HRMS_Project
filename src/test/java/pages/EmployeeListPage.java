package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class EmployeeListPage extends CommonMethods {
    @FindBy(xpath = "//a[contains(text(), 'Employee List')]")
    public WebElement employeeList;

    @FindBy(id="empsearch_id")
    public WebElement empSearchIdField;

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement empSearchNameField;

    @FindBy(id="searchBtn")
    public WebElement searchButton;


    @FindBy(xpath = "//a[text()='Batch14 MS']")
    public WebElement idDisplayed;

    @FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td")
    public List<WebElement> tableElement;

    public EmployeeListPage(){
        PageFactory.initElements(driver,this);
    }
}

