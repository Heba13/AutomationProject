package Sample.Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.appium.java_client.pagefactory.iOSXCUITFindAll;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.net.MalformedURLException;

public class Intro extends BaseScreen {

    @iOSXCUITFindBy(accessibility = "LoginHeader_languageButton")
    @AndroidFindBy(id = "com.emeint.android.myservices:id/btnChangeLanguage")
    private MobileElement changeLanguageButton;

    @iOSXCUITFindAll({
            @iOSXCUITBy(id = "OBgetStartedButton"),
            @iOSXCUITBy(accessibility = "Get started"),
            @iOSXCUITBy(accessibility = "أبدأ")
    })

    @AndroidFindBy(id= "com.emeint.android.myservices:id/tutorialPrimaryButton")
    private MobileElement getStartedButton;

    @iOSXCUITFindBy(accessibility = "Account_01091648892_closeButton")
    @AndroidFindBy(id= "com.emeint.android.myservices:id/btnDelete")
    private MobileElement buttonDelete;

    @iOSXCUITFindBy(accessibility = "Account_01032322955_tabButton")
    @AndroidFindBy(id= "com.emeint.android.myservices:id/cardView")
    private MobileElement cardView ;

    @iOSXCUITFindBy(accessibility = "confirmButtonView")
    @AndroidFindBy(id= "com.emeint.android.myservices:id/doneBtn")
    private MobileElement deleteConfirm;

    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath= "//XCUIElementTypeStaticText[@name=\"يوجد ٥ حسابات مسجلة يرجى مسح حساب من الحسابات المسجلة لتمكن من إضافة حساب جديد\"]"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@name=\"You have 5 accounts out of 5 To add new account, please remove one of the current added accounts\"]")
    })
    @AndroidFindBy(id= "com.emeint.android.myservices:id/tvDesc")
    private MobileElement errorMessage;

    public Intro(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public MobileElement getGetStartedButton(){return getStartedButton;}

    public MobileElement getButtonDelete(){return buttonDelete;}

    public MobileElement getErrorMessage(){return errorMessage;}

    public void clickOnChangeLanguageButton() {
        changeLanguageButton.click();
    }

    public Login clickOnGetStartedButton() throws MalformedURLException {
        getStartedButton.click();
        return new Login(driver);
    }
    public void clickOnDeleteButton() {
        buttonDelete.click();
    }
    public void clickOnCardViewButton() {
        cardView.click();
    }
    public void clickOnConfirmDelete() {
        deleteConfirm.click();
    }
}
