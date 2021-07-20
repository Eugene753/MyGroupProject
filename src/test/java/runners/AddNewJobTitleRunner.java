package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/AddNewJobTitle.feature",
        glue = "steps",
        dryRun = true,
        monochrome = true,
        tags ="@jobtitle",
        plugin = {"pretty", "html:target/cucumber.html"}
)

public class AddNewJobTitleRunner {

}
