package com.euroTech.stepDefs;

import com.euroTech.pages.PasswordChangePage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US09_PasswordChangeStepDefs {
    PasswordChangePage passwordChangePage = new PasswordChangePage();

    @When("The User is on the Change Password Page")
    public void the_user_is_on_the_change_password_page() {
        passwordChangePage.verifyChangePasswordPage();
    }

    @Then("The User enters password {string} and confirm {string}")
    public void the_user_enters_password_and_confirm(String password, String passwordConf) {
        passwordChangePage.changePassword(password, passwordConf);

    }

    @Then("Verify that the user gets a success message")
    public void verify_that_the_user_gets_a_success_message() {
        passwordChangePage.verifyChangePasswordSucces();
        BrowserUtils.waitFor(1);
        passwordChangePage.resetPassword();
    }

    @Then("Verify that the user is on the Change Password Page")
    public void verify_that_the_user_is_on_the_change_password_page() {
        passwordChangePage.verifyChangePasswordPage();
    }


    @Then("Verify that the user gets a warning message and still on the password change page")
    public void verify_that_the_user_gets_a_warning_message_and_still_on_the_password_change_page() {
        passwordChangePage.verifyChangePasswordPage();
    }

    @Then("Verify that the user gets a {string} {string}and still on the password change page")
    public void verifyThatTheUserGetsAAndStillOnThePasswordChangePage(String passwordExpected, String comfirmExpected) {
        passwordChangePage.verifyWarningMessage(passwordExpected, comfirmExpected);
    }
}
