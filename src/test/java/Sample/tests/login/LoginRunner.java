package Sample.tests.login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Sample/tests",
        glue = { "Sample.tests"}
)
public class LoginRunner extends AbstractTestNGCucumberTests {
}
