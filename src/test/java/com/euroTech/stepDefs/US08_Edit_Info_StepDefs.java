package com.euroTech.stepDefs;


import com.euroTech.pages.AccountPage;
import com.euroTech.pages.EditInfoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US08_Edit_Info_StepDefs {

    EditInfoPage editInfoPage = new EditInfoPage();
    AccountPage accountPage = new AccountPage();
    @Given("The User on the Edit Information Page")
    public void the_user_on_the_edit_information_page() {
        editInfoPage.verifyEditInformationPage();
    }
    @When("The User enters {string} {string} {string} {string}")
    public void the_user_enter(String firstName, String lastName, String email, String telephone) {
        editInfoPage.editInformation(firstName, lastName, email, telephone);
    }
    @Then("Verify that the user successfully update information")
    public void verify_that_the_user_successfully_update_information() {
        accountPage.verifyEditInfoUpdateSuccess();
        editInfoPage.resetEmail();
    }
    @Then("Verify that the user gets a {string}")
    public void verify_that_the_user_gets_a(String warningMessage) {
        editInfoPage.verifGetWarningMessage(warningMessage);
        editInfoPage.resetEmail();
    }
    @Then("The message contains {string}")
    public void the_message_contains(String expectedMessage) {
       editInfoPage.getDisappearingWarningMessage(expectedMessage);
    }
}
