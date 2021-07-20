package steps;

import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginStep extends CommonMethods {

    @When("Admin user is logged in")
    public void admin_user_is_logged_in() {
        loginPage.login(ConfigReader.getPropertyValue("username"),ConfigReader.getPropertyValue("password"));
    }
}
