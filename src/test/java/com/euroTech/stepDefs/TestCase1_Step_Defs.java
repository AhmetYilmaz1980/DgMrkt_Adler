package com.euroTech.stepDefs;

import com.euroTech.pages.BasePage;
import com.euroTech.pages.HomePage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase1_Step_Defs {

    HomePage homePage=new HomePage();
    @Given("The user is on the home page")
    public void theUserIsOnTheHomePage() {
    }
    @When("The user clicks to My Account")
    public void the_user_clicks_to_my_account() {
       homePage.myAccountButton.click();
    }
    @Then("The user should be able to see and click Login button")
    public void the_user_should_be_able_to_see_and_click_login_button() {
       homePage.loginButton.click();
       BrowserUtils.waitFor(2);
    }
    @When("The user enters correct {string} and {string}")
    public void the_user_enters_correct_and(String email, String password) {
        homePage.login(email, password);
    }
    @When("The user clicks black login\\(submit) button")
    public void the_user_clicks_black_login_submit_button() {
        homePage.blackLogin.click();
        BrowserUtils.waitFor(2);
    }
    @Then("The user should be able to login and see positive login message")
    public void the_user_should_be_able_to_login_and_see_positive_login_message() {
        BrowserUtils.verifyElementDisplayed(homePage.posLoginMessage);
    }

}
