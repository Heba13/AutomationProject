package Sample.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
     public static AppiumDriver driver;

    public BaseTest() throws MalformedURLException {
        String URL = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
           caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"vodafone.vis.engezly.ui.screens.splash.SplashRevampActivity");
           caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.emeint.android.myservices");
         caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5API30");
         caps.setCapability(MobileCapabilityType.APP, "D:/newProject/untitled1/src/app-buildStagingEnvironmentFlavor-GoogleStore-debug_3_.apk");
         driver = new AndroidDriver(new URL(URL), caps);
    }
}
