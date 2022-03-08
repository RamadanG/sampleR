package pageLocators.AllCommonLocatorsPO;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pageLocators.Page;

public class CommonLocatorsPO extends Page {

    /**
     * "Home" Button in Burger Menu
     */
    @AndroidFindBy(id = "com.rainmanagement.rain.staging:id/getStartedButton")
    private MobileElement getStarted;

    /**
     * "Sign In" button displayed in the Welcome landing Screen.
     */
    @AndroidFindBy(id = "com.rainmanagement.rain.staging:id/skipButton")
    private MobileElement skipButton;

    /**
     * "Email Field" Section displayed in the landing Screen.
     */
    @AndroidFindBy(accessibility = "Show dropdown menu")
    private MobileElement countryDrag;

    /**
     * "Email Field" Section displayed in the landing Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bahrain']")
    private MobileElement bhCountry;

    @AndroidFindBy(id = "com.rainmanagement.rain.staging:id/submitButton")
    private MobileElement nextBtn;

    @AndroidFindBy(id = "com.rainmanagement.rain.staging:id/firstNameTextInput")
    private MobileElement fistNameTxt;

    @AndroidFindBy(id = "com.rainmanagement.rain.staging:id/lastNameTextInput")
    private MobileElement lastNameTxt;

    @AndroidFindBy(id = "com.rainmanagement.rain.staging:id/submitButton")
    private MobileElement createAccountNextBtn;

    @AndroidFindBy(id = "com.rainmanagement.rain.staging:id/emailTextInput")
    private MobileElement emailAccountTxt;

    @AndroidFindBy(id = "com.rainmanagement.rain.staging:id/passwordTextInput")
    private MobileElement passWordAccountTxt;

    @AndroidFindBy(xpath = "//android.view.View[@text='Create Account']")
    private MobileElement createAccountBtn;

    @AndroidFindBy(id = "com.rainmanagement.rain.staging:id/openButton")
    private MobileElement openYourEmailTxt;

    /**
     * @param driver
     */
    public CommonLocatorsPO(AppiumDriver driver) {
        super(driver);
    }

    public MobileElement getGetStarted() {
        return getStarted;
    }

    public MobileElement getSkipButton() {
        return skipButton;
    }

    public MobileElement getCountryDrag() {
        return countryDrag;
    }

    public MobileElement getBhCountry() {
        return bhCountry;
    }

    public MobileElement getNextBtn() {
        return nextBtn;
    }

    public MobileElement getFistNameTxt() {
        return fistNameTxt;
    }

    public MobileElement getLastNameTxt() {
        return lastNameTxt;
    }

    public MobileElement getCreateAccountNextBtn() {
        return createAccountNextBtn;
    }

    public MobileElement getEmailAccountTxt() {
        return emailAccountTxt;
    }

    public MobileElement getPassWordAccountTxt() {
        return passWordAccountTxt;
    }

    public MobileElement getCreateAccountBtn() {
        return createAccountBtn;
    }

    public MobileElement getOpenYourEmailTxt() {
        return openYourEmailTxt;
    }
}
