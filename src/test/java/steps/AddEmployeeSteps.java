package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.DataBase;

import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    String id;
    String fName, lName;

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        click(dashboard.pimOption);
    }

    @When("user clicks on Add Employee button")
    public void user_clicks_on_add_employee_button() {
        click(dashboard.addEmployeeOption);
    }

    @When("user enter {string} and {string} and {string}")
    public void user_enter_and_and(String firstName, String middleName, String lastName) {
        sendText(addEmployee.firstNameField, firstName);
        sendText(addEmployee.middleNameField, middleName);
        sendText(addEmployee.lastNameField, lastName);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployee.saveButton);
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        if (addEmployee.EmployeeDetail.isDisplayed()) {
            System.out.println("Employee added successfully");
        } else {
            System.out.println("Employee not added");
        }
    }
    @When("user enter {string} and {string}")
    public void user_enter_and(String firstName, String lastName) {
        fName=firstName;
        lName=lastName;
        sendText(addEmployee.firstNameField, firstName);
        sendText(addEmployee.lastNameField, lastName);
    }


    @When("user captures employee id")
    public void user_captures_employee_id() {
        id=addEmployee.empIdLocator.getAttribute("value");
    }
    @Then("added employee is displayed in database")
    public void added_employee_is_displayed_in_database() {
        String query=DataBaseSteps.getFnameLnameQuery()+id;
        List<Map<String, String>> dataFromDatabase= DataBase.getListOfMapsFromRset(query);

        String fNameFromDb=dataFromDatabase.get(0).get("emp_firstname");
        String lNameFromDb=dataFromDatabase.get(0).get("emp_lastname");
        //System.out.println(fNameFromDb+" "+lNameFromDb);
        //System.out.println(fName+" "+lName);
        Assert.assertEquals(fName, fNameFromDb);
        Assert.assertEquals(lName, lNameFromDb);
    }
}
