package com.euroTech.stepDefs;

import com.euroTech.pages.HomePage;
import com.euroTech.pages.SecurityPage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US04_CurrencyFuncitionality_Step_Defs {

    HomePage homePage=new HomePage();

    SecurityPage securityPage=new SecurityPage();

    @When("The user clicks currency button and selects {string}")
    public void the_user_clicks_currency_button_and_selects(String currency) {
        homePage.currencyButton.click();
        if(currency.contains("Euro")) {
            homePage.euroButton.click();}
        else if(currency.contains(("Pound"))){
            homePage.poundButton.click();
        } else if (currency.contains("Dollar")) {
            homePage.dollarButton.click();
        }
        BrowserUtils.waitFor(3);
    }

    @When("The user should close the advertisement tab")
    public void the_user_should_close_the_advertisement_tab() {
        securityPage.newsLetterClosedButton.click();

    }


    @Then("The user scrolls down the page and should be able to see products with currency of choice")
    public void the_user_scrolls_down_the_page_and_should_be_able_to_see_products_with_currency_of_choice() {
        BrowserUtils.scrollToElement(homePage.televisions);
        BrowserUtils.waitFor(3);
    }
}
