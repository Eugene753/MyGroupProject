package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;


public class QualificationsLicenseSteps extends CommonMethods {
    @When("user clicks on PIM button")
    public void user_clicks_on_pim_button() {
        click(dashBoardPage.pimOption);
    }

    @When("user clicks on {string} from Employee list")
    public void user_clicks_on_from_employee_list(String employeeName) {
        clickTableEmployeeName(employeeListPage.employeeList, employeeName);
    }

    @When("user clicks on Qualification button in Personal Details menu")
    public void user_clicks_on_qualification_button_in_personal_details_menu() {
        click(personalEmployeeData.qualificationButton);
    }

    @When("user clicks on add button in License field")
    public void user_clicks_on_add_button_in_license_field() {
        click(qualificationsLicensePage.qualificationsLicenseButton);
    }

    @When("user selects {string} from given")
    public void user_selects_any_license_from_given(String licenseName)  {
        getSelect(qualificationsLicensePage.licenseTypeDD).selectByVisibleText(licenseName);
    }

    @When("user enters {string} in License number field")
    public void user_enters_in_license_number_field(String licenseNumber) {
        sendText(qualificationsLicensePage.licenseNumber,licenseNumber);
    }

    @When("user selects issued date fields {string}, {string} and {string}")
    public void user_selects_issued_date_fields_and(String issuedMonth, String issuedYear, String issuedDay)  {
       handleCalendar(qualificationsLicensePage.issuedDate, qualificationsLicensePage.issuedMonth, issuedMonth, qualificationsLicensePage.issuedYear, issuedYear, qualificationsLicensePage.expiryDayTable, issuedDay);
    }

    @When("user selects expiry date fields {string}, {string} and {string}")
    public void user_selects_expiry_date_fields_and(String expiryMonth, String expiryYear, String expiryDay) {
        handleCalendar(qualificationsLicensePage.expiryDate, qualificationsLicensePage.expiryMonth, expiryMonth, qualificationsLicensePage.expiryYear, expiryYear,qualificationsLicensePage.expiryDayTable, expiryDay);
    }

    @When("user clicks on save license button")
    public void user_clicks_on_save_license_button() {
       click(qualificationsLicensePage.qualificationsLicenseSaveButton);
    }

    @Then("verify that license {string} added successfully")
    public void verify_that_license_added_successfully(String licenseName){
        List <WebElement> qualificationsLicense = qualificationsLicensePage.addedLicenseList;
        for(int i=0; i<qualificationsLicense.size(); i++){
            String qualificationsLicenseText = qualificationsLicense.get(i).getText();
            if(qualificationsLicenseText.equals(licenseName)){
                Assert.assertEquals("License name is different",qualificationsLicenseText,licenseName);
                System.out.println("Test passed");
            }
        }
    }


}
