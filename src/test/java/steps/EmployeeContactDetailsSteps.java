package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class EmployeeContactDetailsSteps extends CommonMethods {

    @Then("In personal employee details click on contact details")
    public void in_personal_employee_details_click_on_contact_details() {
        getWait().until(ExpectedConditions.visibilityOfAllElements(personalEmployeeData.contactDetailsButton));
        click(personalEmployeeData.contactDetailsButton);
    }

    @Then("Clicks on edit button and enters Contact details")
    public void clicks_on_edit_button_and_enters_contact_details(DataTable dataTable) throws InterruptedException {
        List<Map<String,String>> listOfContactDetails=dataTable.asMaps();

        for(Map<String,String> contactList:listOfContactDetails){
             String address1=contactList.get("Address Street 1");
             String address2=contactList.get("Address Street 2");
             String city=contactList.get("City");
             String state=contactList.get("State/Province");
             String zip=contactList.get("Zip/Postal Code");
             String country=contactList.get("Country");
             String hTeleophone=contactList.get("Home Telephone");
             String mobile=contactList.get("Mobile");
             String wTelephone=contactList.get("Work Telephone");
             String wEmail=contactList.get("Work Email");
             String othEmail=contactList.get("Other Email");

            click(persContEmpData.edit_saveButton);

            sendText(persContEmpData.AddressStreet1,address1);
            sendText(persContEmpData.AddressStreet2,address2);
            sendText(persContEmpData.cityBox,city);
            getSelect(persContEmpData.stateDD).selectByVisibleText(state);
            sendText(persContEmpData.zip_postalCode,zip);
            getSelect(persContEmpData.countryDD).selectByVisibleText(country);
            sendText(persContEmpData.homeTelephoneBox,hTeleophone);
            sendText(persContEmpData.mobileBox,mobile);
            sendText(persContEmpData.workTelephoneBox,wTelephone);
            sendText(persContEmpData.workEmailBox,wEmail);
            sendText(persContEmpData.otherEmailBox,othEmail);

            click(persContEmpData.edit_saveButton);

        }


    }
}
