package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddMembershipPage extends CommonMethods {

    @FindBy (id = "btnAddMembershipDetail")
    public WebElement AddMembershipBtn;

    @FindBy (id = "membership_membership")
    public WebElement MembershipDropdown;

    @FindBy (id = "membership_subscriptionPaidBy")
    public WebElement MembershipPaidBy;

    @FindBy (id = "membership_subscriptionAmount")
    public WebElement MembershipAmount;

    @FindBy (id = "membership_currency")
    public WebElement MembershipCurrency;

    @FindBy (id = "membership_subscriptionCommenceDate")
    public WebElement MembershipStartDate;

    @FindBy (xpath = "//select[@class='ui-datepicker-month']")
    public WebElement MembershipMonthDD;

    @FindBy (xpath = "//select[@class='ui-datepicker-year']")
    public WebElement MembershipYearDD;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> dayList;

    @FindBy (id = "membership_subscriptionRenewalDate")
    public WebElement MembershipRenewalDate;

    @FindBy (id = "btnSaveMembership")
    public WebElement MembershipSaveBtn;

    @FindBy (xpath = "//table[@class='table hover']/tbody/tr/td")
    public List<WebElement> MembershipAddedResult;

    public AddMembershipPage(){
        PageFactory.initElements(driver,this);
    }
}
