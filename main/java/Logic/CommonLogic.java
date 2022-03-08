package Logic;

import basePage.BasePage;
import io.appium.java_client.AppiumDriver;
import pageLocators.AllCommonLocatorsPO.CommonLocatorsPO;

public class CommonLogic extends BasePage {

    CommonLocatorsPO loginPO;

    public CommonLogic(AppiumDriver driver) {

        super(driver);
        loginPO = new CommonLocatorsPO(driver);
    }

    public void createAccount() throws InterruptedException {

        waitForVisibility(loginPO.getGetStarted(), 30).click();

        waitForVisibility(loginPO.getSkipButton(), 30).click();

        waitForVisibility(loginPO.getCountryDrag(), 30).click();

        waitForVisibility(loginPO.getBhCountry(), 30).click();

        waitForVisibility(loginPO.getNextBtn(), 30).click();

        waitForVisibility(loginPO.getFistNameTxt(), 30).sendKeys("Mohamed");

        waitForVisibility(loginPO.getLastNameTxt(), 30).sendKeys("Ramadan");

        driver.hideKeyboard();

        waitForVisibility(loginPO.getCreateAccountNextBtn(), 30).click();

        waitForVisibility(loginPO.getEmailAccountTxt(), 30).sendKeys("mo.RamadanyG987@gmail.com");

        waitForVisibility(loginPO.getPassWordAccountTxt(), 30).sendKeys("RamadanyGy@123Tra$");

        // Avoiding fail  in waiting
        Thread.sleep(2000);

        waitForVisibility(loginPO.getCreateAccountBtn(), 30).click();
    }
}