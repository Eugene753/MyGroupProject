package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.DashBoardPage;
import utils.CommonMethods;

import java.util.List;

public class AddMembershipToEmployeeSteps extends CommonMethods {

    @Then("User click on PIM Button")
    public void user_click_on_pim_button() {
        jsClick(dashBoardPage.pimOption);
    }

    @Then("In employee name field enter name {string}")
    public void in_employee_name_field_enter_name(String employeeName) throws InterruptedException {
        Thread.sleep(2000);
        sendText(employeeListPage.employeeNameField,employeeName);
    }

    @Then("Click on search button")
    public void click_on_search_button() throws InterruptedException {
        Thread.sleep(2000);
        click(employeeListPage.searchButton);
    }

    @Then("From the list of employee click on employee name {string}")
    public void from_the_list_of_employee_click_on_employee_name(String employeeName) throws InterruptedException {
        clickTableEmployeeName(employeeListPage.employeeList, employeeName);
    }

    @Then("In personal employee details click on memberships")
    public void in_personal_employee_details_click_on_memberships() {

       getWait().until(ExpectedConditions.visibilityOfAllElements(personalEmployeeData.membershipButton));

       click(personalEmployeeData.membershipButton);
    }

    @Then("In assigned memberships frame click on add button")
    public void in_assigned_memberships_frame_click_on_add_button() {
       click(persEmpMemData.addMembershipButton);
    }

    @Then("Enters {string} {string} {string} {string} Sub Commence Date {string} {string} {string} Sub Renewal Date {string} {string} {string}")
    public void enters_sub_commence_date_sub_renewal_date(String membership, String subPaidBy, String subAmount, String currency, String month1, String year1, String date1, String month2, String year2, String date2) {
        getSelect(persEmpMemData.membershipDropDown).selectByVisibleText(membership);
        getSelect(persEmpMemData.subscriptionPaidByDropDown).selectByVisibleText(subPaidBy);
        sendText(persEmpMemData.subscriptionAmountField,subAmount);
        getSelect(persEmpMemData.currencyDropDown).selectByVisibleText(currency);
        handleCalendar(persEmpMemData.subscriptionCommenceDateField,persEmpMemData.commenceDateSelectionOfMonthDropDown,month1,persEmpMemData.commenceDateSelectionOfYearDropDown,year1,persEmpMemData.datesListDropDown,date1);
        handleCalendar(persEmpMemData.subscriptionsRenewalDateField,persEmpMemData.commenceDateSelectionOfMonthDropDown,month1,persEmpMemData.commenceDateSelectionOfYearDropDown,year1,persEmpMemData.datesListDropDown,date1);
    }

    @Then("Click on save button")
    public void click_on_save_button() {
        click(persEmpMemData.saveMembershipButton);
    }

    @Then("Verifies that entered membership is displayed in membership list {string}")
    public void verifies_that_entered_membership_is_displayed_in_membership_list(String expectedMembership) {
        List<WebElement> listMembership= persEmpMemData.membershipsList;
        for(WebElement list:listMembership){
            String actualMembers=list.getText();
            if(actualMembers.equals(expectedMembership)){
                Assert.assertEquals("Membership is not present",actualMembers,expectedMembership);
            }
        }
    }
}
