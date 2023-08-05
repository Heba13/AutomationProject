package Sample;

import Sample.Screens.Home;
import Sample.Screens.Intro;
import Sample.Screens.Login;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import java.net.MalformedURLException;
import java.time.Duration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MyApp {
    public Home home;
    public Login login ;
    public Intro intro;


    public MyApp(AppiumDriver<MobileElement> driver) throws MalformedURLException {
        this.intro = new Intro(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(30)), this);
    }
}
