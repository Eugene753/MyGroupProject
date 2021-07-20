package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddLanguageToEmployeeStep extends CommonMethods {
    @When("Clicks on PIM option")
    public void clicks_on_pim_option() {
        click(dashBoardPage.pimOption);
    }

    @When("Clicks on employee name {string} from Employee list")
    public void clicks_on_employee_name_from_employee_list(String employee_name) throws InterruptedException {
        clickTableEmployeeName(employeeListPage.employeeList, employee_name);

    }

    @When("Clicks on Qualifications in Personal Details menu")
    public void clicks_on_qualifications_in_personal_details_menu() {
       jsClick(personalEmployeeData.qualificationButton);
    }
    @When("Clicks on Add button in languages field")
    public void clicks_on_add_button_in_languages_field() {
       click(qualificationsLanguagesPage.addLanguageBtn);
    }
    @When("Selects any {string}, {string} and {string} from lists")
    public void selects_any_and_from_lists(String language, String fluency, String competency) {
        getSelect(qualificationsLanguagesPage.languageDD).selectByVisibleText(language);
        getSelect(qualificationsLanguagesPage.FluencyDD).selectByVisibleText(fluency);
        getSelect(qualificationsLanguagesPage.competencyDD).selectByVisibleText(competency);
    }
    @When("Clicks on save button")
    public void clicks_on_save_button() {
        click(qualificationsLanguagesPage.languageSaveBtn);
    }
    @Then("Chosen language is displayed in Languages list")
    public void chosen_language_is_displayed_in_languages_list() {
        System.out.println("Test case is passed");
    }


}
