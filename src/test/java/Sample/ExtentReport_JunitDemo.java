//package Sample;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//
//public class ExtentReport_JunitDemo {
//    static ExtentTest test;
//    static ExtentReports report;
//    @BeforeClass
//    public static void startTest()
//    {
//        report = new ExtentReports();
//        test = report.createTest("ExtentDemo");
//    }
//    @Test
//    public void extentReportsDemo()
//    {
//        System.setProperty("webdriver.edge.driver","D://driver.exe");
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://www.google.co.in");
//        if(driver.getTitle().equals("Google"))
//        {
//            test.log(LogStatus.PASS, "Navigated to the specified URL");
//        }
//        else
//        {
//            test.log(LogStatus.FAIL, "Test Failed");
//        }}
//    @AfterClass
//    public static void endTest()
//    {
//        report.endTest(test);
//        report.flush();
//    }}
//
