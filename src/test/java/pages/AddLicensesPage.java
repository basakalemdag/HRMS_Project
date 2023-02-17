package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddLicensesPage extends CommonMethods {

    @FindBy(xpath = "//a[text()='26542602']")
    public  WebElement EmpNameButton;

    @FindBy(xpath = "//div[@id='pdMainContainer']")
    public static WebElement PersonalDetailsDisplayed;

    @FindBy(xpath = "//ul[@id='sidenav']/li[10]")
    public static WebElement qualificationsField;

    @FindBy(xpath = "//input[@id='addLicense']")
    public static WebElement AddLicenseButton;

    @FindBy(xpath = "//select[@id='license_code']")
    public static WebElement LicenseTypeField;

    @FindBy(xpath = "//input[@id='license_license_no']")
    public static WebElement LicenseNumField;

    @FindBy(xpath = "//input[@id='license_date']")
    public static WebElement IssuedDateField;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public static List<WebElement> IssuedDayList;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public static WebElement IssuedDateMonth;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public static WebElement IssuedDateYear;

    @FindBy(xpath = "//input[@id='license_renewal_date']")
    public static WebElement ExpiryDateField;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public static List<WebElement> ExpiryDayList;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public  static WebElement ExpiryDateMonth;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public static WebElement ExpiryDateYear;

    @FindBy(id = "btnLicenseSave")
    public static WebElement LicenseSaveButton;

    public AddLicensesPage(){
        PageFactory.initElements(driver, this);
    }
}
