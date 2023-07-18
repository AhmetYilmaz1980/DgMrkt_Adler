package com.euroTech.stepDefs;

import com.euroTech.pages.BasePage;
import com.euroTech.pages.HomePage;
import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase1_Step_Defs {

    HomePage homePage=new HomePage();

    LoginPage loginPage=new LoginPage();

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
    }

    @When("The user enters correct {string} ,{string} and clicks black login button")
    public void theUserEntersCorrectAndClicksBlackLoginButton(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("The user should be able to login and see positive login message")
    public void the_user_should_be_able_to_login_and_see_positive_login_message() {
        BrowserUtils.verifyElementDisplayed(homePage.posLoginMessage);
    }


}
