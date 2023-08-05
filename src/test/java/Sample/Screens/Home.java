package Sample.Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;

public class Home extends BaseScreen {
    public Home(AppiumDriver<MobileElement> driver) {
        super(driver);

    }

        @iOSXCUITFindBy(accessibility = "ivVodafoneSearchButton")
        @AndroidFindBy(id = "com.emeint.android.myservices:id/ivSearchIcon")
        private MobileElement searchIcon;

        @iOSXCUITFindBy(accessibility = "OnboardingView_continueBtn")
        @AndroidFindBy(id = "com.emeint.android.myservices:id/btnContinue")
        private MobileElement onboardingContinueButton;

        @iOSXCUITFindBy(accessibility = "HomeTabBar_containerView_Menu")
        @AndroidFindAll(
                {@AndroidBy(xpath = "//android.widget.FrameLayout[@content-desc=\"More\"]"),
                        @AndroidBy(accessibility = "Menu")})
        private MobileElement moreButton;

        @iOSXCUITFindBy(accessibility = "HomeTabBar_containerView_Profile_new")
        @AndroidFindBy(id = "com.emeint.android.myservices:id/fab")
        private MobileElement profileIcon;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/rvSeeMoreActionContainer")
        private MobileElement seeMoreButton;

        @AndroidFindBy(id = "swipeToRefresh")
        @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Ana Vodafone\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
        private MobileElement loadingSpinner;

        @iOSXCUITFindBy(accessibility = "DynamicSectionType1_imageView_Balance_Transfer")
        @AndroidFindBy(id = "com.emeint.android.myservices:id/ivVodafoneLogo")
        private MobileElement vodafoneLogo;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/tvSpocTitle")
        private MobileElement spocCardTitle;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/tvSpocDescription")
        private MobileElement spocCardSubtitle;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/tvSpocMore")
        private MobileElement spocCardMoreLink;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/imageView19")
        private MobileElement vodafoneCashCardIcon;

        @AndroidFindBy(accessibility = "card background")
        private MobileElement vodafoneCashCard;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/cashSubTitle")
        private MobileElement vodafoneCashCardSubtitle;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/inImg")
        private MobileElement inJokerImage;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/cardLayoutBg")
        private MobileElement offerSecondaryCard;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/tvOffline")
        private MobileElement statusMessage;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/titleTv")
        private MobileElement myPointsRedCardHeader;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/subTitleTv")
        private MobileElement pointsCardTapForMoreOptionsButton;

        @iOSXCUITFindBy(accessibility = "containerView")
        @AndroidFindBy(id = "com.emeint.android.myservices:id/subTitleTv")
        private MobileElement balanceCardRechargeButton;

        @iOSXCUITFindBy(accessibility = "DynamicSectionType2_backgroundImageView_Flextransfer")
        @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"home_Content_flexTransfer\"]/android.view.ViewGroup")
        private MobileElement flexTransfer;


        @AndroidFindBy(accessibility = "RedOffers")
        private MobileElement newThisMonthSectionTitle;

        @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"home_Content_Iphone13\"]/android.view.ViewGroup")
        private MobileElement iPhone13OfferCard;

        @AndroidFindBy(accessibility = "PostPaidOffers")
        private MobileElement payByVodafoneCashCard;

        @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"home_Content_vodafone_cash\"]/android.view.ViewGroup")
        private MobileElement vodafoneCashServiceCard;

        @AndroidFindBy(accessibility = "stayInControl")
        private MobileElement exclusiveForRedSectionTitle;

        @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"home_Content_store locator\"]/android.view.ViewGroup")
        private MobileElement bookYourAppointmentCard;

        @AndroidFindBy(accessibility = "Entertainment")
        private MobileElement entertainmentForYouSectionTitle;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/ivBackground8")
        private MobileElement entertainmentCard;

        @AndroidFindBy(accessibility = "products")
        private MobileElement yourServicesInOneClickTitle;

        @iOSXCUITFindAll({
                @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@name=\"المزايا\"]"),
                @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@name=\" Your Benefits\"]")
        })
        @AndroidFindBy(xpath= "//android.widget.TextView[@content-desc=\"stayInControlRedFamily\"]")
        private MobileElement yourBenefitsTitle;

        @AndroidFindBy(accessibility = "home_Content_adsl")
        private MobileElement vodafoneDslServiceCard;

        @AndroidFindBy(xpath = "//*[@resource-id='com.emeint.android.myservices:id/tvTitle1']")
        private MobileElement vodafoneCashYourServiceCard;

        @AndroidFindBy(accessibility = "home_Content_PayBill")
        private MobileElement payBillForOthersServiceCard;

        @AndroidFindBy(accessibility = "home_Content_recharge")
        private MobileElement rechargeForOthersServiceCard;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/ivBackground8")
        private MobileElement redEntertainmentCard;

        @iOSXCUITFindBy(accessibility = "HomeTabBar_containerView_inbox_new")
        @AndroidFindBy(accessibility = "inbox_new")
        private MobileElement inboxButton;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/countBadge")
        private MobileElement inboxCounterBadge;

        @iOSXCUITFindBy(accessibility = "DashboardMyBill_containerView")
        @AndroidFindBy(id = "com.emeint.android.myservices:id/cvDashboardBill")
        private MobileElement myBillCard;

        @iOSXCUITFindBy(accessibility = "HomeTabBar_imageView_user_offers")
        @AndroidFindBy(accessibility = "user_offers")
        private MobileElement offersButton;

        @AndroidFindBy(accessibility = "home_Content_new_red_tariff_free_weeks_intro")
        private MobileElement takeYourBundleAbroadButton;

        @AndroidFindBy(accessibility = "products")
        private MobileElement yourServicesInOneClickHeader;

        @AndroidFindBy(accessibility = "home_Content_redfamilyowner")
        @iOSXCUITFindBy(accessibility = "DynamicSectionType2_actionButton_RedFamilyForNewBuilds")
        private MobileElement familySharingCard;

        @AndroidFindBy(accessibility = "stayInControl")
        private MobileElement exclusiveOffersTitle;

        @AndroidFindBy(accessibility = "PostPaidOffers")
        MobileElement scratchCouponCard;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/AnimvDealOfDay")
        MobileElement offerOfTheDayLogo;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/btnSubmitDeal")
        private MobileElement dodButton;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/titleTv")
        private MobileElement congratulationsHeaderTitle;

        @AndroidFindBy(id = "com.emeint.android.myservices:id/doneBtn")
        private MobileElement myScratchCoupun;

        @AndroidFindBy(accessibility = "RedOffers")
        private MobileElement redOffersTitle;

        @AndroidFindBy(accessibility = "home_Content_store locator")
        private MobileElement exclusiveOffers;

        @iOSXCUITFindBy(id = "DynamicSectionType2_actionButton_superflex")
        @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"home_Content_superFlex\"]/android.view.ViewGroup")
        private MobileElement superFlexCard;

        @iOSXCUITFindBy(accessibility = "DynamicSectionType2_backgroundImageView_Flexawaya")
        @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"home_Content_flexmgmt2\"]/android.view.ViewGroup")
        private MobileElement flexaweyaCard;

        @iOSXCUITFindAll({
                @iOSXCUITBy(accessibility = "My Flex"),
                @iOSXCUITBy(accessibility = "فليكساتي")
        })
        @AndroidFindBy( accessibility= "Myflex")
        private MobileElement myFlexSectionTitle;

        @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Content title\"])[4]")
        private MobileElement findMyFamilyCard;

        @AndroidFindBy(xpath = "(//android.widget.FrameLayout[@content-desc=\"home_Content_EntertainmentApps\"]/android.view.ViewGroup")
        private MobileElement flexEntertainmentSection;

        @iOSXCUITFindAll({
                @iOSXCUITBy( xpath = "//XCUIElementTypeStaticText[@name=\"Got it\"]"),
                @iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"إبدأ\"]")
        })
        @AndroidFindBy(id="pageBannerPositiveActionButton")
        private  MobileElement toolTipButton;

        @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='No, thanks!']")

        @AndroidFindBy(id = "com.emeint.android.myservices:id/survey_cancel_btn")
        private MobileElement surveyCancelButton;

        @AndroidFindAll({
                @AndroidBy(xpath = "//android.widget.Button[@text=\"Not now\"]"),
                @AndroidBy(xpath = "//android.widget.Button[@text=\"ليس الآن\"]")
        })
        private MobileElement notNowButton;

        @iOSXCUITFindAll({@iOSXCUITBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Skip\"`]"),
                @iOSXCUITBy(accessibility = "OnboardingView_skipButton")})
        @AndroidFindBy(id = "com.emeint.android.myservices:id/btnOnboardingSkip")
        private MobileElement onBoardingSkipButton;

        @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"SecondaryCard_actionButton\"])[3]")
        @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.emeint.android.myservices:id/btnExplore' and @clickable='true']")
        private MobileElement flexEntertainmentCardButton;

        @iOSXCUITFindBy(id = "DynamicOnboardingGetStarted_btnGetStarted")
        private MobileElement redGetStartedButton;

        public MobileElement getSearchIcon() {
            return searchIcon; }

        public MobileElement getServeyCancelButton(){
            return surveyCancelButton;
        }

        public MobileElement getYourBenefitsTitle(){ return yourBenefitsTitle; }

        public MobileElement getProfileIcon() {return profileIcon ;}

        public MobileElement getFindMyFamilyCard(){return findMyFamilyCard;}

        public MobileElement getExclusiveOffers() { return exclusiveOffers; }

        public MobileElement getExclusiveOffersTitle() { return exclusiveOffersTitle; }

        public MobileElement getInboxCounterBadge() { return inboxCounterBadge; }

        public MobileElement getLoadingSpinner() { return loadingSpinner; }

        public MobileElement getOnboardingContinueButton() { return onboardingContinueButton; }

        public MobileElement getInJokerImage() { return inJokerImage; }

        public MobileElement getOfferSecondaryCard() { return offerSecondaryCard; }

        public MobileElement getVodafoneLogo() { return vodafoneLogo; }

        public MobileElement getStatusMessage() { return statusMessage; }

        public MobileElement getMyPointsRedCardHeader() { return myPointsRedCardHeader; }

        public MobileElement getPointsCardTapForMoreOptionsButton() { return pointsCardTapForMoreOptionsButton; }

        public MobileElement getNewThisMonthSectionTitle() { return newThisMonthSectionTitle; }

        public MobileElement getiPhone13OfferCard() { return iPhone13OfferCard; }

        public MobileElement getPayByVodafoneCashCard() { return payByVodafoneCashCard; }

        public MobileElement getVodafoneCashServiceCard() { return vodafoneCashServiceCard; }

        public MobileElement getExclusiveForRedSectionTitle() { return exclusiveForRedSectionTitle; }

        public MobileElement getBookYourAppointmentCard() { return bookYourAppointmentCard; }

        public MobileElement getEntertainmentForYouSectionTitle() { return entertainmentForYouSectionTitle; }

        public MobileElement getEntertainmentCard() { return entertainmentCard; }

        public MobileElement getYourServicesInOneClickTitle() { return yourServicesInOneClickTitle; }

        public MobileElement getVodafoneDslServiceCard() { return vodafoneDslServiceCard; }

        public MobileElement getVodafoneCashYourServiceCard() { return vodafoneCashYourServiceCard; }

        public MobileElement getPayBillForOthersServiceCard() { return payBillForOthersServiceCard; }

        public MobileElement getRechargeForOthersServiceCard() { return rechargeForOthersServiceCard; }

        public MobileElement getRedEntertainmentCard() { return redEntertainmentCard; }

        public MobileElement getFamilySharingCard() { return familySharingCard; }

        public MobileElement getMyBillCard() { return myBillCard; }

        public MobileElement getSpocCardTitle() { return spocCardTitle; }

        public MobileElement getSpocCardSubtitle() { return spocCardSubtitle; }

        public MobileElement getSpocCardMoreLink() { return spocCardMoreLink; }

        public MobileElement getVodafoneCashCardIcon() { return vodafoneCashCardIcon; }

        public MobileElement getVodafoneCashCard() { return vodafoneCashCard; }

        public MobileElement getVodafoneCashCardSubtitle() { return vodafoneCashCardSubtitle; }

        public MobileElement getTakeYourBundleAbroadButton() { return takeYourBundleAbroadButton; }

        public MobileElement getYourServicesInOneClickHeader() { return yourServicesInOneClickHeader; }

        public MobileElement getSuperFlexCard() { return superFlexCard; }

        public MobileElement getSeeMoreButton() { return seeMoreButton; }

        public MobileElement getFlexTransfer() { return flexTransfer; }

        public MobileElement getScratchCouponCard() { return scratchCouponCard; }

        public MobileElement getOfferOfTheDayLogo() { return offerOfTheDayLogo; }

        private MobileElement getDodButton() { return dodButton; }

        public MobileElement getCongratulationsHeaderTitle() { return congratulationsHeaderTitle; }

        private MobileElement getViewMyScratchCopoun() { return myScratchCoupun; }

        public MobileElement getRedOffers() { return redOffersTitle; }

        public MobileElement getflexaweyaCard() { return flexaweyaCard; }

        public MobileElement getMyFlexSectionTitle() { return myFlexSectionTitle; }

        public MobileElement getOnBoardingSkipButton() { return  onBoardingSkipButton;}

        public MobileElement getFlexEntertainmentSection() { return flexEntertainmentSection; }

        public void clickOnOnboardingContinueButton() { onboardingContinueButton.click(); }
        public MobileElement getToolTipButton(){return toolTipButton;}

        public void clickOnGetDoDOffer() { getDodButton().click(); }
        public void clickOnToolTipButton(){getToolTipButton().click();}

        public void clickonViewMyScratchCopoun() { getViewMyScratchCopoun().click(); }

        public  void clickOnRedGetStartedButton(){redGetStartedButton.click() ;}

        public void clickOnNotNowButton(){
            notNowButton.click();
        }

        public void clickOnBoardingSkipButton() {onBoardingSkipButton.click();}


    }


