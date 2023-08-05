package Sample.tests;

import Sample.utilities.extentReport.ExtentReport;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import Sample.utilities.extentReport.ScreenShot;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
public class HooksHandler extends BaseTest {

    public HooksHandler() throws MalformedURLException {
        super();
    }

    @Before(order= 1)
     public void startTC(Scenario scenario) throws NoSuchFieldException, IllegalAccessException {
    ExtentReport.setScenario(scenario);  // To Pass which Scenario (Test Case) would be handled to Set TC Name //
    ExtentReport.startTC();             //To start Test case with the name of the Scenario or Test case name  // essential *
    ExtentReport.setStepDefs();        // to Add each step name to the Report return list of PickleStepTestStep (steps Name)
}

    @After(order=1)
    public void tearDown() {
        driver.closeApp();
    }

    @After(order = 2)
    public void endTC() throws URISyntaxException, IOException {
        {
            ExtentReport.reportTearDown();

        }
    }


    @AfterStep
    public void AfterStep(Scenario scenario) {
        String stepName = ExtentReport.getCurrentStepName();
        Status logStatus;

        if (scenario.isFailed()) {
            logStatus = Status.FAIL;
           String base64Screenshot = ScreenShot.getScreenShot();
            ExtentReport.getTest().log(logStatus, stepName, MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
           // ExtentReport.getTest().log(logStatus, stepName);
        }
        else {
            logStatus = Status.PASS;
            ExtentReport.getTest().log(logStatus, stepName);
        }


}}
