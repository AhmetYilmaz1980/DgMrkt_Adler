package com.euroTech.stepDefs;

import com.euroTech.pages.HomePage;
import com.euroTech.pages.LoginPage;
import com.euroTech.pages.LogoutPage;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.ConfigurationReader;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.euroTech.utilities.Driver.driver;


public class US02_LogoutFunctionality_Step_Defs {


    HomePage homePage = new HomePage();

    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    Actions actions = new Actions(driver);

    @Then("The user cliks to My Account dropdown menu and Logout button")
    public void the_user_cliks_to_my_account_dropdown_menu_and_logout_button() throws InterruptedException {
        logoutPage.myAccountDDM.click();
        logoutPage.logoutDDM.click();
        Thread.sleep(3000);
    }

    @Given("Verify that account logout pop-up is visible")
    public void verify_that_account_logout_pop_up_is_visible() {
        String actualValue = logoutPage.logoutVerify.getText();
        System.out.println(actualValue);
        String expectedValue = "Account Logout";
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Given("The user clicks to My Account dropdown menu and My Account button")
    public void the_user_clicks_to_my_account_dropdown_menu_and_my_account_button() throws InterruptedException {
        logoutPage.myAccountDDM.click();
        logoutPage.myAccountDDM2.click();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();

        logoutPage.myAccountPageLogout.click();
        Thread.sleep(3000);

    }

    @Given("Verify that account logout is visible")
    public void verify_that_account_logout_is_visible() {
        String actualValue = logoutPage.myAccountPageLogoutVerify.getText();
        System.out.println(actualValue);
        String expectedValue = "Account Logout";
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Given("Close driver")
    public void close_driver() {
      // Driver.driver.close();
    }

}
