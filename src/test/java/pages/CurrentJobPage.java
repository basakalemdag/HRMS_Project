package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class CurrentJobPage extends CommonMethods {

@FindBy(xpath = "//select[@id='job_job_title']")
public WebElement jobTitleDropdown;

@FindBy(xpath = "//select[@id='job_emp_status']")
public WebElement empStatus;

@FindBy(xpath = "//select[@id='job_eeo_category']")
public WebElement jobCategory;

@FindBy(id="job_joined_date")
public WebElement joinedDate;

@FindBy(xpath = "//select[@id='job_sub_unit']")
public WebElement subUnit;

@FindBy(xpath = "//select[@id='job_location']")
public WebElement location;

@FindBy(id="job_contract_start_date")
public WebElement contractStartDate;

@FindBy(id="job_contract_end_date")
public WebElement contractEndDate;

@FindBy(id="job_contract_file")
public WebElement chooseFile;

@FindBy(id="btnSave")
public WebElement saveButton;

@FindBy(id="btnTerminateEmployement")
public WebElement terminateButton;

@FindBy(xpath = "//select[@id='terminate_reason']")
public WebElement terminateReason;

@FindBy(id="terminate_date")
public WebElement terminateDate;

@FindBy(partialLinkText = "Terminated on")
public WebElement terminatedText;

@FindBy(id="terminate_note")
public WebElement terminateComment;

@FindBy(id="dialogConfirm")
public WebElement confirmButton;

@FindBy(xpath = "//select[@class='ui-datepicker-month']")
public WebElement monthWebElement;

@FindBy(xpath = "//select[@class='ui-datepicker-year']")
public WebElement yearWebElement;

@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
public List<WebElement> dayList;


public CurrentJobPage(){ PageFactory.initElements(driver, this); }

}
