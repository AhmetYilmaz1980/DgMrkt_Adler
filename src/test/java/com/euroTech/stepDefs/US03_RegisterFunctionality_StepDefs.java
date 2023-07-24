package com.euroTech.stepDefs;

import com.euroTech.pages.RegisterAccountPage;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import java.io.IOException;
import static org.junit.Assert.*;

public class US03_RegisterFunctionality_StepDefs {
    RegisterAccountPage registerAccountPage = new RegisterAccountPage();

    @Given("The user clicks on the My Account and Register section")
    public void the_user_clicks_on_the_my_account_and_register_section() {
        registerAccountPage.selectButton("Register");
    }

    @When("The user enters {string} and {string} and {string} and {string} and {string} and {string}")
    public void the_user_enters_and_and_and_and_and(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) {
        registerAccountPage.validRegister(firstName, lastName, email, telephone, password, passwordConfirm);
    }

    @When("The user clicks subscribe {string} and privacy policy")
    public void the_user_clicks_subscribe_and_privacy_policy(String yesNo) {
        registerAccountPage.subscribeAndPrivacyPolicy("Yes");
    }

    @When("The user clicks the register continue button")
    public void the_user_clicks_the_register_continue_button() {
        BrowserUtils.scrollToElement(registerAccountPage.registerContinueBtn);
        registerAccountPage.registerContinueBtn.click();

    }

    @Then("Verify that the user {string} pages appears on the screen")
    public void verify_that_the_user_pages_appears_on_the_screen(String expectedText) {
        BrowserUtils.waitFor(6);
        String actualText = registerAccountPage.yourAccountHasBeenCreated.getText();
        assertEquals(expectedText, actualText);
    }

    @When("The user clicks the continue button")
    public void the_user_clicks_the_continue_button() {
        registerAccountPage.continueBtn.click();
    }

    @Then("The user {string} can be see his account page")
    public void the_user_can_be_see_his_account_page(String expectedText) {
        String actualText = registerAccountPage.myAccount.getText();
        assertEquals(expectedText, actualText);

    }
    @Then("Verify the warning message {string} and {string}")
    public void verify_the_warning_message_and(String expectedMessage, String confirmExpectedMessage) {
        BrowserUtils.waitFor(6);
        registerAccountPage.fullAssertionMessage(expectedMessage,confirmExpectedMessage);
    }

    @When("The user clicks subscribe {string}")
    public void the_user_clicks_subscribe(String yesNo) {
        Driver.get().findElement(By.xpath("//label[text()='" + yesNo + "']")).click();
    }
    @Then("Verify the warning message {string} below the screen")
    public void verify_the_warning_message_below_the_screen(String expectedMessage) throws IOException {
        BrowserUtils.scrollToElement(registerAccountPage.privacyPolicy);
        BrowserUtils.waitFor(4);
        registerAccountPage.privacyPolicyAssertion(expectedMessage);
    }
}
