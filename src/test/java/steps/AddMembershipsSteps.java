package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class AddMembershipsSteps extends CommonMethods {

    @Then("Admin navigates to Qualifications")
    public void admin_navigates_to_qualifications() {
        click(dashBoardPage.adminButton);
    }

    @Then("Selects membership under qualifications menu")
    public void selects_membership_under_qualifications_menu() {
        moveToElement(adminPage.qualificationsButton);
        click(adminPage.membershipButton);
    }

    @Then("User clicks on add button")
    public void user_clicks_on_add_button() {
        click(membershipsPage.addButton);
    }

    @Then("User enters different membership {string} in the name field")
    public void user_enters_different_membership_in_the_name_field(String membership) {
        sendText(membershipsPage.membershipNameField,membership);
    }

    @Then("Clicks on safe button")
    public void clicks_on_safe_button() {
        click(membershipsPage.saveButton);
    }

    @Then("Verifies that memberships were added {string}")
    public void verifies_that_memberships_were_added(String expectedMembership)
    {
        List<WebElement> listMemberships= membershipsPage.listOfMemberships;

        for(WebElement list:listMemberships){
            String actualMembership=list.getText();
            if(actualMembership.equals(expectedMembership)) {
                Assert.assertEquals("Membership is not verified", expectedMembership, actualMembership);
            }
        }
    }
}
