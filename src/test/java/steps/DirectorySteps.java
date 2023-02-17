package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class DirectorySteps extends CommonMethods {

    @When("user clicks on Directory option")
    public void user_clicks_on_directory_option() {
        click(dashboard.directoryBtn);
    }

    @Then("user see number of employees displayed")
    public void user_see_number_of_employees_displayed() {
        if (directory.noOfEmployees.isDisplayed()){
            System.out.println("All employees are present in the page");
        } else {
            System.out.println("test has failed");
        }

    }
}
