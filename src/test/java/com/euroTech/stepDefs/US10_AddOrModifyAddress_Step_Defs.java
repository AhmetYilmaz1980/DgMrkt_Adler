package com.euroTech.stepDefs;

import com.euroTech.pages.AccountPage;
import com.euroTech.pages.AddressPage;
import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_AddOrModifyAddress_Step_Defs {
    AccountPage accountPage = new AccountPage();
    LoginPage loginPage = new LoginPage();
    AddressPage addressPage = new AddressPage();

    @Then("The users click {string} from AccountPage")
    public void the_users_click_from_account_page(String modifyAddressButton) {
        addressPage.modifyAddressButton.click();
    }
    @Then("Verify that the user is on the AddressPage")
    public void verify_that_the_user_is_on_the_address_page() {
        addressPage.verifyAdressBookUpdateSuccess();
    }

    @When("The user clicks to New Address")
    public void the_user_clicks_to_new_address() {
        addressPage.newAddressButtonClick();
    }

    @Then("Verify that the user is on the Add Address page")
    public void verify_that_the_user_is_on_the_add_address_page() {
        addressPage.verifyAddAddressPageUpdateSuccess();
    }

    @When("The user enters valid {string}, {string} ,{string}, {string},{string},{string},{string}")
    public void the_user_enters_valid(String firstName, String lastName, String address, String city, String postCode, String country, String region) {
        addressPage.addAddressValue(firstName, lastName, address, city, postCode, country, region);
    }
    @When("The user clicks {string}")
    public void the_user_clicks(String continueButton) {
        addressPage.continueButtnClick();
        BrowserUtils.waitFor(3);
    }

    @When("The user clicks {string} window")
    public void the_user_clicks_window(String string) {
        addressPage.jcAlert();
        BrowserUtils.waitFor(3);
    }
    @Then("The user should be able to add a new address and see successfully message {string}")
    public void the_user_should_be_able_to_add_a_new_address_and_see_successfully_message(String expectedMessage) {
        BrowserUtils.waitFor(2);
        // BrowserUtils.getScreenshot(message);
        Assert.assertEquals(expectedMessage, "Your address has been successfully added");
    }
    @Then("The user should NOT be able to add a new address and see warning message {string}")
    public void the_user_should_not_be_able_to_add_a_new_address_and_see_warning_message(String expectedMessage) {
        addressPage.assertionNewAddress(expectedMessage);
    }
    @When("The user clicks to Edit Button")
    public void the_user_clicks_to_edit_button() {
        addressPage.editButton.click();
    }
    @Then("Verify that the user is on the Edit Address page")
    public void verify_that_the_user_is_on_the_edit_address_page() {
        addressPage.verifyEditPageUpdate();
    }
    @When("The user enters new information {string}, {string} ,{string}, {string},{string},{string},{string}")
    public void the_user_enters_new_information(String firstName, String lastName, String address, String city, String postCode, String country, String region) {
        addressPage.editCredantion(firstName, lastName, address, city, postCode, country, region);
    }
    @Then("The user should be able to update new address information and see success message {string}")
    public void the_user_should_be_able_to_update_new_address_information_and_see_success_message(String expectedMessage) {
        Assert.assertEquals(expectedMessage, "Your address has been successfully updated");
    }
    @When("The user enters blank or invalid information {string}, {string} ,{string}, {string},{string},{string},{string}")
    public void the_user_enters_blank_or_invalid_information(String firstName, String lastName, String address, String city, String postCode, String country, String region) {
        addressPage.editCredantion(firstName, lastName, address, city, postCode, country, region);
    }
    @Then("The user should NOT be able to update new address with information and see warning message {string}")
    public void the_user_should_not_be_able_to_update_new_address_with_information_and_see_warning_message(String expectedMessage) {
        addressPage.assertionNewAddress(expectedMessage);
    }
    @When("The user clicks to Delete Button")
    public void the_user_clicks_to_delete_button() {
        addressPage.deleteButton.click();
    }
    @Then("The user click {string} button in confirmation screen")
    public void the_user_click_button_in_confirmation_screen(String string) {
        addressPage.deleteAlertOkClick();
    }
    @Then("The user should be able to delete address information and see success {string}")
    public void the_user_should_be_able_to_delete_address_information_and_see_success(String expectedMessage) {
        BrowserUtils.waitFor(2);
        expectedMessage = addressPage.deleteSuccessMessage.getText();
        Assert.assertEquals(expectedMessage, "Your address has been successfully deleted");
    }
    @Then("The user should NOT be able to delete address information and see warning {string}")
    public void the_user_should_not_be_able_to_delete_address_information_and_see_warning(String string) {
        BrowserUtils.waitFor(2);
        addressPage.deleteWarningMessage.isDisplayed();
    }
    @And("The user logs into DgMrkt with {string} and {string}")
    public void theUserLogsIntoDgMrktWithAnd(String emailEsra, String emailPasswordEsra) {
        loginPage.login(emailEsra,emailPasswordEsra);
    }
}

