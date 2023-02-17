package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;
import utils.Log;

public class AddEmployeeDependantsSteps extends CommonMethods {

    @Then("user is able to see the employee list displayed")
    public void user_is_able_to_see_the_employee_list_displayed() {
        Log.startTestCase("I have logged into the HRMS as execution of my codes");
        if (dashboard.welcomeMessage.isDisplayed()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    @When("user clicks on any enlisted employee")
    public void user_clicks_on_any_enlisted_employee() {
             //click(employeeDependacies.enlistedEmployee);
            employeeDependacies.enlistedEmployee.click();
    }

    @Then("user successfully navigates to the empoloyee Personal Details page")
    public void user_successfully_navigates_to_the_empoloyee_personal_details_page() throws InterruptedException {
        //WebElement employeeInfo = driver.findElement(By.xpath("//a[@class='toggle tiptip activated']"));
        isDisplayed(employeeDependacies.welcomeMessage, "welcome");
      //  if (employeeDependacies.personalDetailsPageDisplayed.isDisplayed()){
      //      System.out.println("test case passed");
    //    }else{
            //System.out.println("Test case failed");
          //  driver.manage().wait(2000);
       // }
    }
    @When("user clicks on dependents option")
    public void user_clicks_on_dependents_option() {
        click(employeeDependacies.clickDependent);
    }

    @Then("user successfully navigates into Assign Dependents page")
    public void user_successfully_navigates_into_assign_dependents_page() {
       isDisplayed(employeeDependacies.dependentpageDisplayed, "Personal Details");
       // if (employeeDependacies.dependentpageDisplayed.isDisplayed()){
         //   System.out.println("test case passed");
        //}else{
          //  System.out.println("Test case failed");
//    }
}

    @When("user click on add button")
    public void user_click_on_add_button() {
      employeeDependacies.addBtn.click();
    }

    @When("user is able to enter data into the name field")
    public void user_is_able_to_enter_data_into_the_name_field() {
        sendText(employeeDependacies.dependentsName, "JohnButt");
    }

    @When("user is able to select an option from relationship dropdown")
    public void user_is_able_to_select_an_option_from_relationship_dropdown() throws InterruptedException {
     selectDropdown(employeeDependacies.dependentsRelation, "Child");

    }

    @When("user is able to select day, month and year from the date of birth field")
    public void user_is_able_to_select_day_month_and_year_from_the_date_of_birth_field(){
        employeeDependacies.birthCalender.click();

         staticCalanderSelection(employeeDependacies.monthOfBirth, "Apr",
                 employeeDependacies.YearOfBirth, "2012", employeeDependacies.dayOfBirth,"11");

    }

    @Then("user can save changes by clicking on save button")
    public void user_can_save_changes_by_clicking_on_save_button() {
        employeeDependacies.saveBtn.click();
        tableConfirmation(employeeDependacies.dependentTable,"JohnButt");
        Log.info("I have successfully saved my desired changes");
    }}
