package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class AddSkill2Steps extends CommonMethods {
    @When("user clicks on PIM and search the employee from Employee List")
    public void user_clicks_on_pim_and_search_the_employee_from_employee_list() {
        Log.info("Navigating to Employee List and searching for employee to add skills");
    click(dashboard.pimOption);
    click(employeeList.employeeList);
    Log.info("Searching employee by id");
    sendText(employeeList.empSearchIdField, ConfigReader.getPropertyValue("id"));
    click(employeeList.searchButton);
    }

    @When("user click on Searched Employee and select Qualifications")
    public void user_click_on_searched_employee_and_select_qualifications() {

        selectByIDFromTable(employeeList.tableElement, ConfigReader.getPropertyValue("id"));
        Log.info("Selected qualification tag in order to add employees");
        click(personalDetails.qualificationBtn);
        click(personalDetails.skillAddBtn);
    }

    @When("user should see skills dropdowns, experience textbox and commment box displayed")
    public void user_should_see_skills_dropdowns_experience_textbox_and_commment_box_displayed() {
        Log.info("Checking all the elements are displayed");
        isDisplayed(personalDetails.skillDropDown, ConfigReader.getPropertyValue("skills_Dropdown_Displayed"));
        isDisplayed(personalDetails.yearsOfExperience, ConfigReader.getPropertyValue("Experience_Field_Displayed"));
        isDisplayed(personalDetails.comments, ConfigReader.getPropertyValue("CommentsDisplayed"));



    }

    @Then("user can add employee's skills")
    public void user_can_add_employee_s_skills() {
    Log.info("Selecting required skill and adding comments");
        selectDropdown(personalDetails.skillDropDown, ConfigReader.getPropertyValue("dropDownValue"));
        sendText(personalDetails.yearsOfExperience, ConfigReader.getPropertyValue("Years_of_Experience") );
        sendText(personalDetails.comments, ConfigReader.getPropertyValue("Comments") );
        click(personalDetails.saveBtn);
        Log.endTestCase("Employees qualification skills added successfully, end of test");
    }
}
