package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import utils.CommonMethods;
import utils.ConfigReader;

public class SearchEmployeeSteps extends CommonMethods {

    @When("user enter valid employee id")
    public void user_enter_valid_employee_id() {
        sendText(employeeList.empSearchIdField, ConfigReader.getPropertyValue("id"));
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(employeeList.searchButton);
    }
    @Then("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        tableConfirmation(employeeList.tableElement, ConfigReader.getPropertyValue("id"));
    }
    @When("user enter valid employee name")
    public void user_enter_valid_employee_name() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sendText(employeeList.empSearchNameField, ConfigReader.getPropertyValue("name"));
        employeeList.empSearchNameField.sendKeys(Keys.ARROW_DOWN);
        employeeList.empSearchNameField.sendKeys(Keys.ENTER);


    }

}
