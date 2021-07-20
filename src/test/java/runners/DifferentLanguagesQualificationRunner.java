package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/AddLanguage.feature",
        glue = "steps",
        dryRun = false,
        monochrome = true,
        tags = "@differentlanguages",
        plugin = {"pretty","html:target/cucumber.html"}
)

public class DifferentLanguagesQualificationRunner {

}
