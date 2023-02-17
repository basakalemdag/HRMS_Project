package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class AddMembershipSteps extends CommonMethods {
    @When("user clicks on the employee name")
    public void user_clicks_on_the_employee_name() {
        Log.startTestCase("This is Adding membership user story case");
        selectByIDFromTable(employeeList.tableElement, ConfigReader.getPropertyValue("id"));
    }

    @Then("user see the personal details of the employee")
    public void user_see_the_personal_details_of_the_employee() {
        isDisplayed(personalDetails.detailsDisplayed, "Personal Details");
    }
    @When("user clicks on memberships button")
    public void user_clicks_on_memberships_button() {
        click(personalDetails.membershipBtn);
    }
    @When("user clicks on membership add button")
    public void user_clicks_on_membership_add_button() {
        click(addMembership.AddMembershipBtn);
    }
    @When("user clicks and select membership type")
    public void user_clicks_and_select_membership_type() {
        selectDropdown(addMembership.MembershipDropdown,ConfigReader.getPropertyValue("membership_type"));
    }
    @When("user clicks on membership save button")
    public void user_clicks_on_membership_save_button() {
        click(addMembership.MembershipSaveBtn);
    }

    @When("user clicks and select subscription paid by")
    public void user_clicks_and_select_subscription_paid_by() {
        selectDropdown(addMembership.MembershipPaidBy,ConfigReader.getPropertyValue("paid_by"));
    }

    @When("user enters subscription amount")
    public void user_enters_subscription_amount() {
        sendText(addMembership.MembershipAmount, ConfigReader.getPropertyValue("subscription_amount"));
    }
    @When("user clicks and select currency")
    public void user_clicks_and_select_currency() {
        selectDropdown(addMembership.MembershipCurrency,ConfigReader.getPropertyValue("subscription_currency"));
    }
    @When("user selects commence date")
    public void user_selects_commence_date() {
        click(addMembership.MembershipStartDate);
        staticCalanderSelection(addMembership.MembershipMonthDD, "Jan", addMembership.MembershipYearDD, "2021",addMembership.dayList,"15");
    }
    @When("user selects renewal date")
    public void user_selects_renewal_date() {
        click(addMembership.MembershipRenewalDate);
        staticCalanderSelection(addMembership.MembershipMonthDD, "Jan", addMembership.MembershipYearDD, "2023",addMembership.dayList,"15");
    }
    @Then("user sees the details of membership added")
    public void user_sees_the_details_of_membership_added() {
        tableConfirmation(addMembership.MembershipAddedResult,ConfigReader.getPropertyValue("membership_type"));
        Log.endTestCase("All membership details have been added. Test case end");
    }

}
