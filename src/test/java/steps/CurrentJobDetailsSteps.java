package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Constants;
import utils.Log;

public class CurrentJobDetailsSteps extends CommonMethods {

    @When("user clicks on displayed information")
    public void user_clicks_on_displayed_information() {
        selectByIDFromTable(employeeList.tableElement, ConfigReader.getPropertyValue("id"));
    }
    @Then("user sees employee details")
    public void user_sees_employee_details() {
        isDisplayed(personalDetails.detailsDisplayed, "Personal Details");
    }
    @When("user clicks on Job")
    public void user_clicks_on_job() {
        Log.startTestCase("Adding Employee's Current Job Details - Test case started");
        click(personalDetails.jobBtn);

    }
    @When("user clicks on Edit button")
    public void user_clicks_on_edit_button() {
       click(currentJob.saveButton);
    }
    @When("user selects Job Title")
    public void user_selects_job_title() {
    selectDropdown(currentJob.jobTitleDropdown, ConfigReader.getPropertyValue("job_title"));
    }
    @When("user selects Employment Status")
    public void user_selects_employment_status() {
     selectDropdown(currentJob.empStatus, ConfigReader.getPropertyValue("employment_status"));
    }
    @When("user selects Job Category")
    public void user_selects_job_category() {
     selectDropdown(currentJob.jobCategory, ConfigReader.getPropertyValue("job_category"));
    }
    @When("user picks Joined Date from calendar")
    public void user_picks_joined_date_from_calendar() {
    click(currentJob.joinedDate);
    staticCalanderSelection(currentJob.monthWebElement, "Dec", currentJob.yearWebElement, "2022", currentJob.dayList, "1");
    }
    @When("user selects Job Unit")
    public void user_selects_job_unit() {
       selectDropdown(currentJob.subUnit, ConfigReader.getPropertyValue("sub_unit"));
    }
    @When("user selects Location")
    public void user_selects_location() {
        selectDropdown(currentJob.location, ConfigReader.getPropertyValue("location"));
    }
    @When("user picks contract Start Date from calendar")
    public void user_picks_contract_start_date_from_calendar() {
    click(currentJob.contractStartDate);
        staticCalanderSelection(currentJob.monthWebElement, "Dec", currentJob.yearWebElement, "2022", currentJob.dayList, "1");
    }
    @When("user picks contract End Date from calendar")
    public void user_picks_contract_end_date_from_calendar() {
    click(currentJob.contractEndDate);
        staticCalanderSelection(currentJob.monthWebElement, "Dec", currentJob.yearWebElement, "2023", currentJob.dayList, "1");
    }
    @When("user uploads file up to 1MB for Contract Details")
    public void user_uploads_file_up_to_1mb_for_contract_details(){
    currentJob.chooseFile.sendKeys(Constants.CONTRACT_FILEPATH);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @When("user clicks on Save button")
    public void user_clicks_on_save_button() {
     click(currentJob.saveButton);
    }
    @Then("user successfully updated employee's current job details")
    public void user_successfully_updated_employee_s_current_job_details() {
        System.out.println("Employee's Current Job Details updated");

       Log.endTestCase("Employee's Current Job Details were successfully saved");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
