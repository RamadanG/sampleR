package testCases;

import Logic.CommonLogic;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageLocators.AllCommonLocatorsPO.CommonLocatorsPO;

public class ScenariosTest extends BaseTest {

    CommonLogic createAccount;
    CommonLocatorsPO loginPO;

    @Test(priority = 1, enabled = true, description = "[Login][Create Account] - Verify User Can Create Account with Correct Format")
    public void AddNewPayment() throws InterruptedException {

        createAccount = new CommonLogic(driver);

        // create account
        createAccount.createAccount();

        // Avoiding wating for long api call
        Thread.sleep(5000);

        Assert.assertTrue(loginPO.getOpenYourEmailTxt().isDisplayed());

    }
}