package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.CommonMethods;

import java.util.List;

public class LicensesSteps extends CommonMethods {

    @When("user clicks on Admin button")
    public void user_clicks_on_admin_button() {
        click(dashBoardPage.adminButton);
    }

    @When("user navigates to Qualifications")
    public void user_navigates_to_qualifications() {
        moveToElement(adminPage.qualificationsButton);
    }

    @When("user selects licenses")
    public void user_selects_licenses(){
        click(adminPage.licenseButton);
    }

    @When("user clicks on add button")
    public void user_clicks_on_add_button() {
        click(licensesPage.addLicensesButton);
    }

    @When("user enters {string}")
    public void user_enters(String name) {
        sendText(licensesPage.nameLicensesField, name);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button()   {
        click(licensesPage.saveLicensesButton);
    }

    @Then("Verify licenses {string} added successfully")
    public void verify_licenses_added_successfully(String name) {
        List<WebElement> licenseNames = licensesPage.licensesNameList;
        for (int i=0; i<licenseNames.size(); i++) {
            String licenseName = licenseNames.get(i).getText();
            if(licenseName.equals(name)){
                Assert.assertEquals("License name is different", licenseName, name);
                System.out.println("Test passed");
            }
        }
    }

}
