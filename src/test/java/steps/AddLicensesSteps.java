package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.AddLicensesPage;
import pages.EmployeeListPage;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

import java.util.List;

public class AddLicensesSteps extends CommonMethods {

    @When("user enters valid ID")
    public void user_enters_valid_id() {
        Log.startTestCase("Test case is starting now");
        sendText(employeeList.empSearchIdField, ConfigReader.getPropertyValue("id"));
    }


    @Then("user sees employee's name is displayed")
    public void user_sees_employee_s_name_is_displayed() {
        System.out.println("The Employee's name is displayed");
        if (employeeList.idDisplayed.isDisplayed()) {
            System.out.println("Employee information is displayed");
        }
    }
    @When("user clicks on the employee's name")
    public void user_clicks_on_the_employee_s_name() {
    selectByIDFromTable(employeeList.tableElement,ConfigReader.getPropertyValue("id"));
    }
    @When("user sees the personal details of the employee")
    public void user_sees_the_personal_details_of_the_employee() {
        System.out.println("The Employee's personal details are displayed");
        if(personalDetails.detailsDisplayed.isDisplayed()){
            System.out.println("It is displayed");
        }
    }
    @When("user clicks on Qualifications button")
    public void user_clicks_on_qualifications_button() {
    click(AddLicensesPage.qualificationsField);
    }

    @When("user clicks on Add button")
    public void user_clicks_on_add_button() {
    click(AddLicensesPage.AddLicenseButton);
    }
    @When("user clicks and selects License type")
    public void user_clicks_and_selects_license_type() {
    selectDropdown(AddLicensesPage.LicenseTypeField, "nico");
    }

    @When("user enters License Number")
    public void user_enters_license_number() {
    sendText(AddLicensesPage.LicenseNumField, "12345");
    }
    @When("user clicks and selects Issued Date")
    public void user_clicks_and_selects_issued_date() {
        click(AddLicensesPage.IssuedDateField);
        staticCalanderSelection(AddLicensesPage.IssuedDateMonth, "Jan", AddLicensesPage.IssuedDateYear,
                "2021", AddLicensesPage.IssuedDayList, "2");

    }
    @When("user clicks and selects Expiry date")
    public void user_clicks_and_selects_expiry_date() {
        click(AddLicensesPage.ExpiryDateField);
        staticCalanderSelection(AddLicensesPage.ExpiryDateMonth, "Dec", AddLicensesPage.ExpiryDateYear,
                "2022", AddLicensesPage.ExpiryDayList, "1" );

    }

    @Then("user clicks on License Save button")
    public void user_clicks_on_License_save_button() {
        click(AddLicensesPage.LicenseSaveButton);
        Log.endTestCase("Test case is ended");
    }

    }

