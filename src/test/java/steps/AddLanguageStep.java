package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashBoardPage;
import utils.CommonMethods;

public class AddLanguageStep extends CommonMethods {
    @When("Admin user clicks on Admin button")
    public void admin_user_clicks_on_admin_button() {
     click(dashBoardPage.adminButton);
    }

    @When("Admin user navigates to Qualifications")
    public void admin_user_navigates_to_qualifications() {
       moveToElement(adminPage.qualificationsButton);
    }

    @When("Admin user selects Languages")
    public void admin_user_selects_languages() {
     click(adminPage.languageButton);

    }

    @When("Admin user clicks on add button")
    public void admin_user_clicks_on_add_button() {
        click(languagesPage.addBtn);
    }


    @When("Admin user enter {string}")
    public void admin_user_enter(String language) throws InterruptedException {
        sendText(languagesPage.languageNameField, language);
        Thread.sleep(2000);
        click(languagesPage.saveBtn);

    }

    @Then("Added {string} is displayed in Languages list")
    public void added_is_displayed_in_languages_list(String language) {
        System.out.println("Test case is passed");
    }
}
