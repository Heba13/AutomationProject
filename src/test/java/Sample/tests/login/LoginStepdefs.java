package Sample.tests.login;

import Sample.MyApp;
import Sample.tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import java.net.MalformedURLException;

public class LoginStepdefs extends BaseTest {

    public MyApp myApp = new MyApp(driver);

    public LoginStepdefs() throws MalformedURLException {
        super();
    }

    @Given("App opened in English and we need to run it in {string}")
    public void appOpenedInEnglishAndWeNeedToRunItIn(String lang) {
        if (lang.equals("ar"))
            myApp.intro.clickOnChangeLanguageButton();
    }

    @When("click on get started button in intro screen")
    public void clickOnGetStartedButtonInIntroScreen() throws MalformedURLException {
        myApp.login = myApp.intro.clickOnGetStartedButton();
    }

    @When("click on continue seamless login button in login screen")
    public void clicksOnContinueSeamlessLoginButton() {
        myApp.home = myApp.login.clickOnLoginSeamlessButton();
    }


    @Then("App opened")
    public void appOpened() {
        Assert.assertTrue(myApp.login.getLoginScreenTitle().isDisplayed());
    }

    @Then("Password field Should be displayed")
    public void passwordFieldShouldBeDisplayed() {
        Assert.assertTrue(myApp.login.getInvalidCredentialsTitle().isDisplayed());

    }
}
