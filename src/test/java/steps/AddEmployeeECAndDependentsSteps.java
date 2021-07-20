package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.AddEmployeeECAndDependentsPage;
import pages.PersonalEmployeeData;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class AddEmployeeECAndDependentsSteps extends CommonMethods {
    @Given("navigate to PIM options")
    public void navigate_to_pim_options() {
        jsClick(dashBoardPage.pimOption);

    }

    @Given("Admin user clicks on any employee from Employee list")
    public void admin_user_clicks_on_any_employee_from_employee_list() throws InterruptedException {
        clickTableEmployeeName(employeeListPage.employeeList, "azizullah");
    }

    @When("admin user clicks on Emergency contacts")
    public void admin_user_clicks_on_emergency_contacts() {
        jsClick(personalEmployeeData.emergencyContactsButton);
    }

    @When("admin user clicks on add Assigned Emergency Contacts button")
    public void admin_user_clicks_on_add_assigned_emergency_contacts_button() {
        jsClick(addEmployeeECAndDependentsPage.ECAddBtn);
    }



    @Then("enters following name relationship home telephone mobile work phone")
    public void enters_following_name_relationship_home_telephone_mobile_work_phone(DataTable personalData) throws InterruptedException {
        List<Map<String, String>> data = personalData.asMaps();
        for (Map<String, String> pData : data) {
            String name = pData.get("Name");
            String relationship = pData.get("Relationship");
            String hPhone = pData.get("Home Telephone");
            String mobile = pData.get("Mobile");
           String wPhone = pData.get("Work Telephone");
            sendText(addEmployeeECAndDependentsPage.ECName, name);
            sendText(addEmployeeECAndDependentsPage.relationship, relationship);
            Thread.sleep(2000);
            sendText(addEmployeeECAndDependentsPage.homeTelephone, hPhone);
            Thread.sleep(5000);
            sendText(addEmployeeECAndDependentsPage.mobile, mobile);
            sendText(addEmployeeECAndDependentsPage.workTelephone, wPhone);


        }
    }

    @Then("admin user clicks on save button")
    public void admin_user_clicks_on_save_button() {

        jsClick(addEmployeeECAndDependentsPage.ECAddBtn);


    }

      // Dependent Scenario

    @When("admin user clicks on Dependents button")
    public void admin_user_clicks_on_dependents_button() {
        jsClick(personalEmployeeData.dependendsButton);

    }

    @Then("enters Name Relationship Date of Birth")
    public void enters_name_relationship_date_of_birth(DataTable dataTable) {
        List<Map<String,String>>dataDependents=dataTable.asMaps();
        click(addEmployeeECAndDependentsPage.addDepentBtn);

        for(Map<String,String>dDepend:dataDependents){
            String name=dDepend.get("Name");
            String relationship = dDepend.get("Relationship");
            String month=dDepend.get("Month");
            String year=dDepend.get("Year");
            String day=dDepend.get("Day");

            sendText(addEmployeeECAndDependentsPage.dependentName,name);
            getSelect(addEmployeeECAndDependentsPage.dependentRelationship).selectByVisibleText(relationship);
            handleCalendar(addEmployeeECAndDependentsPage.dependentBoxDOfB,addEmployeeECAndDependentsPage.monthDD,month,addEmployeeECAndDependentsPage.yearDD,year,addEmployeeECAndDependentsPage.monthDate,day);

            click(addEmployeeECAndDependentsPage.saveBtn);
        }
    }
}