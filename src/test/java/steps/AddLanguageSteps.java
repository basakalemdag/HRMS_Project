package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class AddLanguageSteps extends CommonMethods {
    @When("user clicks on qualification button")
    public void user_clicks_on_qualification_button() {
        Log.startTestCase("Test case starts. Adding Language user story");
        click(personalDetails.qualificationBtn);
    }
    @When("user clicks on languages add button")
    public void user_clicks_on_languages_add_button() {
        click(addLanguage.AddLanguageBtn);
    }
    @When("user clicks and select language")
    public void user_clicks_and_select_language() {
        selectDropdown(addLanguage.AddingLanguageDD, ConfigReader.getPropertyValue("language"));
    }
    @When("user clicks and select fluency")
    public void user_clicks_and_select_fluency() {
        selectDropdown(addLanguage.FluencyDD, ConfigReader.getPropertyValue("fluency"));
    }
    @When("user clicks and select competency")
    public void user_clicks_and_select_competency() {
        selectDropdown(addLanguage.CompetencyDD, ConfigReader.getPropertyValue("competency"));
    }
    @When("user enters comments")
    public void user_enters_comments() {
        sendText(addLanguage.LanguageComments, ConfigReader.getPropertyValue("languageCompetency"));
    }
    @When("user clicks on language save button")
    public void user_clicks_on_language_save_button() {
        click(addLanguage.LanguageSaveBtn);
    }
    @Then("user sees the details of language added")
    public void user_sees_the_details_of_language_added() {
        tableConfirmation(addLanguage.AddedLanguageTable,"Java");
        Log.endTestCase("All language details have been added. Test case end");
    }
}
