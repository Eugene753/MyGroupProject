package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.SkillsPage;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class SkillsPageSteps extends CommonMethods {

    @When("Admin user navigates to Admin page")
    public void admin_user_navigates_to_admin_page() {
        click(dashBoardPage.adminButton);
    }

    @When("Admin user selects skills")
    public void admin_user_selects_skills() throws InterruptedException {
        Thread.sleep(2000);
        click(adminPage.skillsButton);
    }

    @Then("new skill added successfully")
    public void new_skill_added_successfully() {
        List<WebElement> skillNames= skillsPage.skillsNameList;
            for (int i = 0; i < skillNames.size(); i++) {
                String skillName=skillNames.get(i).getText();
                if(skillName.contains("Communication")){
                    System.out.println("Test passed");
                }
            }
        }

    @When("Admin user enters multiple skills and verify they are added successfully")
    public void admin_user_enters_multiple_skills_and_verify_they_are_added_succesfully(DataTable skills) throws InterruptedException {
        List<Map<String ,String >> skillNames = skills.asMaps();
        for (Map<String, String> skillName:skillNames) {
            String skillNameValue =skillName.get("SkillName");
            String descriptionValue =skillName.get("Description");
            click(skillsPage.addBtn);
            sendText(skillsPage.skillNameField, skillNameValue);
            sendText(skillsPage.skillDescriptionField, descriptionValue);

            click(skillsPage.saveBtn);
            Thread.sleep(2000);

            takeScreenshot(skillNameValue);

        }
    }
    }


