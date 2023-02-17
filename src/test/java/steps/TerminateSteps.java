package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class TerminateSteps extends CommonMethods {

    @When("user enter valid terminating employee id")
    public void user_enter_valid_terminating_employee_id() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sendText(employeeList.empSearchNameField,ConfigReader.getPropertyValue("terminate_name"));
        employeeList.empSearchNameField.sendKeys(Keys.ARROW_DOWN);
        employeeList.empSearchNameField.sendKeys(Keys.ENTER);
    }
    @When("user clicks on new displayed information")
    public void user_clicks_on_new_displayed_information() {
        clickSearchedEmployee(employeeList.tableElement,ConfigReader.getPropertyValue("terminate_name"));
    }

    @When("user clicks on Terminate Employment")
    public void user_clicks_on_terminate_employment() throws InterruptedException {
    Log.startTestCase("Terminate Employee - Test case started");
    click(currentJob.terminateButton);
    Thread.sleep(1000);
    }

    @When("user selects a Reason")
    public void user_selects_a_reason() {
    selectDropdown(currentJob.terminateReason, ConfigReader.getPropertyValue("terminate_reason"));
    }
    @When("user picks a date from the calendar")
    public void user_picks_a_date_from_the_calendar() {
    click(currentJob.terminateDate);
        staticCalanderSelection(currentJob.monthWebElement, "Mar", currentJob.yearWebElement, "2023", currentJob.dayList, "31");
    }
    @When("user adds a note in the textbox")
    public void user_adds_a_note_in_the_textbox() {
    sendText(currentJob.terminateComment, ConfigReader.getPropertyValue("terminate_comment"));
    }
    @When("user clicks on Confirm button")
    public void user_clicks_on_confirm_button() {
    click(currentJob.confirmButton);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("the employee is terminated")
    public void the_employee_is_terminated() {
    if(currentJob.terminatedText.isDisplayed()){
        System.out.println("Employee successfully terminated");
        Log.endTestCase("Terminate Employee - Test case passed");
    } else {
        System.out.println("Employee was not terminated");
        Log.endTestCase("Terminate Employee - Test case failed");
    }
    }

}
