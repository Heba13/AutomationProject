package Sample.Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.appium.java_client.pagefactory.iOSXCUITFindAll;


    public class Login extends BaseScreen {
        @AndroidFindBy(id = "com.emeint.android.myservices:id/tvOnboardingDesc")
        @iOSXCUITFindBy(accessibility = "tvOnboardingDesc")
        private MobileElement onBoardingMessage;

        @iOSXCUITFindBy(accessibility = "NormalLogin_msisdnTextField")
        @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
        private MobileElement msisdnField;

        @iOSXCUITFindBy(accessibility = "NormalLogin_passwordTextField")
        @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
        private MobileElement passwordField;

        @iOSXCUITFindBy(accessibility = "NormalLogin_loginButton")
        @AndroidFindBy(id = "com.emeint.android.myservices:id/btnLogin")
        private MobileElement loginButton;


        @iOSXCUITFindBy(accessibility = "Invalid Credentials!")
        @AndroidFindBy(id = "com.emeint.android.myservices:id/tvTitle")
        private MobileElement invalidCredentialsTitle;

        @iOSXCUITFindBy(id = "login-error")
        @AndroidFindBy(id = "com.emeint.android.myservices:id/tvError")
        private MobileElement errorMessage;

        @iOSXCUITFindBy(accessibility = "imgLanguage")
        @AndroidFindBy(id = "com.emeint.android.myservices:id/btnChangeLanguage")
        private MobileElement changeLanguageButton;

        @iOSXCUITFindAll({ @iOSXCUITBy(id = "Account_01092229246_tabButton") ,
                @iOSXCUITBy(id = "Account_01092229246_tabButton") ,
        })
        @AndroidFindBy(id = "com.emeint.android.myservices:id/cardView")
        private MobileElement loginSeamlessCard;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/tvMobileNumber")
        public MobileElement mobileNumberInSeamlessCard;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/tvGoToLoginScreen")
        protected MobileElement addNewAccountLink;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/tvMobileData")
        protected MobileElement upSelling4gMessage;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/tvTitle")
        private MobileElement loginScreenTitle;

        @iOSXCUITFindAll({
                @iOSXCUITBy(accessibility = "CustomTabBarView_itemIconView_الفروع"),
                @iOSXCUITBy(accessibility = "CustomTabBarView_itemIconView_Stores")
        })
        @AndroidFindAll({
                @AndroidBy(uiAutomator = "new UiSelector().textContains(\"Nearest Branch\")"),
                @AndroidBy(uiAutomator = "new UiSelector().textContains(\"أقرب الفروع\")")
        })
        private MobileElement nearestBranchButton;

        @iOSXCUITFindBy(accessibility = "SeamlessLogin_accountsCollectionView")
        @AndroidFindBy(id = "com.emeint.android.myservices:id/tvNumberOfAccountInfo")
        private MobileElement manageUpToFiveAccounts;

        @iOSXCUITFindAll({
                @iOSXCUITBy(accessibility = "CustomTabBarView_itemIconView_تسوق الآن"),
                @iOSXCUITBy(accessibility = "CustomTabBarView_itemIconView_Shop with us")
        })
        @AndroidFindAll({
                @AndroidBy(uiAutomator = "new UiSelector().textContains(\"Shop with us\")"),
                @AndroidBy(uiAutomator = "new UiSelector().textContains(\"تسوق الآن\")")
        })
        private MobileElement shopWithUsButton;

        @iOSXCUITFindAll({
                @iOSXCUITBy(accessibility = "Shop"),
                @iOSXCUITBy(accessibility = "تسوّق")
        })
        @AndroidFindBy(id="com.emeint.android.myservices:id/tvTitle")
        private MobileElement onlineShopScreenTitle;

        @iOSXCUITFindAll({
                @iOSXCUITBy(accessibility = "CustomTabBarView_itemIconView_اكتشف"),
                @iOSXCUITBy(accessibility = "CustomTabBarView_itemIconView_Explore")
        })
        @AndroidFindAll({
                @AndroidBy(uiAutomator = "new UiSelector().textContains(\"Explore\")"),
                @AndroidBy(uiAutomator = "new UiSelector().textContains(\"اكتشف\")")
        })
        private MobileElement exploreButton;

        @iOSXCUITFindAll({
                @iOSXCUITBy(accessibility = "Explore"),
                @iOSXCUITBy(accessibility = "اكتشف")
        })
        @AndroidFindAll({
                @AndroidBy(uiAutomator = "new UiSelector().textContains(\"Explore Vodafone\")"),
                @AndroidBy(uiAutomator = "new UiSelector().textContains(\"إكتشف ڤودافون\")")
        })
        private MobileElement exploreScreenTitle;

        public Login(AppiumDriver<MobileElement> driver) {
            super(driver);
        }

        public MobileElement getLoginScreenTitle() {
            return loginScreenTitle;
        }

        public MobileElement getInvalidCredentialsTitle() {
            return invalidCredentialsTitle;
        }
        public MobileElement getUpSelling4gMessage() {
            return upSelling4gMessage;
        }

        public MobileElement getOnBoardingMessage() {
            return onBoardingMessage;
        }

        public MobileElement getMobileNumberInSeamlessCard()
        {
            return mobileNumberInSeamlessCard;
        }
        public MobileElement getManageUpToFiveAccounts(){return manageUpToFiveAccounts;}
        public MobileElement getOnlineShopScreenTitle(){return onlineShopScreenTitle;}
        public MobileElement getExploreScreenTitle(){return exploreScreenTitle;}
        public Home clickOnLoginButton() {
            loginButton.click();
            return new Home(driver);
        }

        public void clickOnChangeLanguageButton() {
            changeLanguageButton.click();
        }

        public Home clickOnLoginSeamlessButton() {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.
                    textToBePresentInElement(getMobileNumberInSeamlessCard(), "010"));
            loginSeamlessCard.click();
            return new Home(driver);
        }

        public Home clickOnLoginSeamlessButtonForIOS(){
            loginSeamlessCard.click();
            return new Home(driver);
        }

        public void clickOnAddANewAccountLink() {
            addNewAccountLink.click();
        }

        public void enterMsisdnValueInMsisdnField(String msisdnValue) {
            msisdnField.sendKeys(msisdnValue);
        }

        public void enterPasswordValueInPasswordField(String passwordValue) {
            passwordField.sendKeys(passwordValue);
        }

        public Home loginWith(String msisdnValue, String passwordValue) {
            enterMsisdnValueInMsisdnField(msisdnValue);
            enterPasswordValueInPasswordField(passwordValue);
            return clickOnLoginButton();
        }
        public void clickOnShopWithUsButton(){
            shopWithUsButton.click();

        }
        public void clickonExploreButton(){
            exploreButton.click();
        }

}
