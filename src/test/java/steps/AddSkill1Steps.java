package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class AddSkill1Steps extends CommonMethods {
    @When("user click on Admin and select Skill from qualifications")
    public void user_click_on_admin_and_select_skill_from_qualifications() {
        click(adminPage.adminTag);
        click(adminPage.qualificaitons);
        /*Actions action=new Actions(driver);
        action.clickAndHold(adminPage.qualificaitons);*/
        click(adminPage.skills);

        click(adminPage.addButton);


    }




    @When("user clicks on add and enter credentials")
    public void user_clicks_on_add_and_enter_credentials(DataTable dataTable) {

        List<Map<String,String>> map=dataTable.asMaps();

        for(int i=0; i< map.size(); i++) {
            // Please add these two locators in the method next to dataTable
            String nameText = map.get(i).get("name");
            String descriptionText = map.get(i).get("Description");

            sendText(adminPage.name,nameText);
            sendText(adminPage.description,descriptionText);

        }

    }
    @Then("user should be able to add new skills")
    public void user_should_be_able_to_add_new_skills() {
        click(adminPage.saveButton);
    }
}
