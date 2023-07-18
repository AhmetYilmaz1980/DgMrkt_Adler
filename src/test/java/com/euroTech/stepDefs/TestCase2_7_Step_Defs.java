package com.euroTech.stepDefs;

import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase2_7_Step_Defs {
    LoginPage loginPage=new LoginPage();

    @When("The user enters wrong {string} ,{string} and clicks black login button")
    public void theUserEntersWrongAndClicksBlackLoginButton(String email, String password) {
        loginPage.login(email, password);
    }
    @Then("The user shouldn't be able to login and see negative login message")
    public void the_user_shouldn_t_be_able_to_login_and_see_negative_login_message() {
        BrowserUtils.verifyElementDisplayed(loginPage.negLoginMessage);
    }
}
