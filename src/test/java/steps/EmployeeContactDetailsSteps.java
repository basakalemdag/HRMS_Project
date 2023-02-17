package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class EmployeeContactDetailsSteps extends CommonMethods {



    @Then("user clicks on contact details")
    public void user_clicks_on_contact_details() {
        Log.startTestCase("This is adding Contact Details user story");

        click(employeeContactDetails.contactDetails);
    }

    @When("user clicks on edit option")
    public void user_clicks_on_edit_option() {
        click(employeeContactDetails.editbtn);
    }

    @When("user enters employee address1 and address2")
    public void user_enters_employee_address1_and_address2() {
        sendText(employeeContactDetails.empAdSt1, ConfigReader.getPropertyValue("address1"));
        sendText(employeeContactDetails.empAdSt2, ConfigReader.getPropertyValue("address2"));
    }

    @When("users enters city,state,zip and country")
    public void users_enters_city_state_zip_and_country() {
        sendText(employeeContactDetails.empCity, ConfigReader.getPropertyValue("city"));
        sendText(employeeContactDetails.empState, ConfigReader.getPropertyValue("state"));
        sendText(employeeContactDetails.empZip, ConfigReader.getPropertyValue("zip"));


        selectDropdown(employeeContactDetails.empCountry, ConfigReader.getPropertyValue("country"));
    }

    @When("user enters homeNum, mobile, and workNumber")
    public void user_enters_home_num_mobile_and_work_number() {
     sendText(employeeContactDetails.emeHomeTelephone, ConfigReader.getPropertyValue("HomeTelephone"));
     sendText(employeeContactDetails.empTeNumber, ConfigReader.getPropertyValue("mobileNumber"));
     sendText(employeeContactDetails.empWorkTelephone, ConfigReader.getPropertyValue("workTelephoneNum"));
    }

    @When("user enters workEmail and personalEmail")
    public void user_enters_work_email_and_personal_email() {
        sendText(employeeContactDetails.empWorkEmail, ConfigReader.getPropertyValue("workEmail"));
        sendText(employeeContactDetails.empOtherEmail, ConfigReader.getPropertyValue("otherEmail"));
    }
    @Then("user clicks on save button and changed the data successfully")
    public void user_clicks_on_save_button_and_changed_the_data_successfully() {
        Log.endTestCase("All employee contact details have been added");
        click(employeeContactDetails.btnSave);
        //click(employeeContactDetails.empaddBtn);
    }

}