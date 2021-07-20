package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;

public class QualificationSkillsPageSteps extends CommonMethods {

    @When("Admin user click on PIM option")
    public void admin_user_click_on_pim_option(){
        jsClick(dashBoardPage.pimOption);

    }

    @When("Admin user clicks on Qualifications in Personal Details menu")
    public void admin_user_clicks_on_qualifications_in_personal_details_menu() throws InterruptedException {
        Thread.sleep(5000);
       personalEmployeeData.qualificationButton.click();

    }

    @When("Admin user clicks on add button in skills field")
    public void admin_user_clicks_on_add_button_in_skills_field(){
       click(qualificationsSkillsPage.addSkillBtn);
    }

    @When("Admin user select any skill from given")
    public void admin_user_select_any_skill_from_given() throws InterruptedException {
        Select select=new Select(qualificationsSkillsPage.skillDD);
        List<WebElement> allOptions= select.getOptions();
        int size=allOptions.size();
        for(int i=1;i<size; i++){
            String optionText=allOptions.get(i).getText();
            select.selectByIndex(i);
            Thread.sleep(2000);
        }
    }

    @When("Admin user enters {string} and  {string}")
    public void admin_user_enters_and(String YearsOfExperience, String Comments) {
        sendText(qualificationsSkillsPage.skillYearsField, YearsOfExperience);
        sendText(qualificationsSkillsPage.skillCommentsField, Comments);
    }

    @When("Admin user click on skill save button")
    public void admin_user_click_on_skill_save_button() {
       click(qualificationsSkillsPage.skillSaveBtn);
    }

    @Then("chosen skill appears as an added skill for employee")
    public void chosen_skill_apears_as_an_added_skill_for_employee() {

        List<WebElement> skillList= qualificationsSkillsPage.skillsTable;
        for (int i = 0; i < skillList.size(); i++) {
            String skillsName=skillList.get(i).getText();
            if(!skillsName.isEmpty()){
                System.out.println("Test passed");
            }
        }
    }
}
