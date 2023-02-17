package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class WorkExperienceSteps extends CommonMethods {

    @Then("user clicks on View Employee information")
    public void user_clicks_on_view_employee_information() {
        selectByIDFromTable(employeeList.tableElement, ConfigReader.getPropertyValue("id"));
    }


    @When("user clicks on Qualifications")
    public void user_clicks_on_qualifications() {
        click(experienceDetails.qualificationBtn);

    }

    @When("user click on Add Work Experience")
    public void user_click_on_add_work_experience() {
        click(experienceDetails.WorkExperienceField);

    }

    @When("user is adding Company name")
    public void user_is_adding_company_name() {
        sendText(experienceDetails.CompanyField, "Syntax School");

    }

    @When("job title")
    public void job_title() {
        sendText(experienceDetails.JobTitleField, "Quality Assurance Analyst");

    }

    @When("YYYY-mm-Date")
    public void yyyy_mm_date() {
        sendText(experienceDetails.FromFieldInput, "2020-09-19");

    }

    @Then("user clicks on Save")
    public void user_clicks_on_save() {
        click(experienceDetails.saveBtn);

        tableConfirmation(experienceDetails.tableConfirm,"Syntax School");

    }

}