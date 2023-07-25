package com.euroTech.stepDefs;

import com.euroTech.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static com.euroTech.utilities.Driver.driver;

import com.euroTech.pages.HomePage;
import com.euroTech.pages.LogoutPage;
import org.openqa.selenium.interactions.Actions;

import static com.euroTech.utilities.Driver.driver;

public class US05_SearchIconFunctionality_StepDefs {

    HomePage homePage = new HomePage();

    SearchPage searchPage = new SearchPage();

    LogoutPage logoutPage = new LogoutPage();

    Actions actions = new Actions(driver);

    @Given("Click Search icon")
    public void click_search_icon() throws InterruptedException {
        Thread.sleep(3000);
        searchPage.searchButtonIcon.click();
    }

    @Given("Enter a valid search term {string}")
    public void enter_a_valid_search_term(String good) {
       searchPage.searchTextBox.sendKeys(good);
    }

    @Given("Click Search text box search icon")
    public void click_search_text_box_search_icon() {
        searchPage.searchTextBoxButton.click();
    }

    @Given("Verify the result text including {string}")
    public void verify_the_result_text_including(String expresult) {
        String actualResult = searchPage.resultSearch.getText();
        System.out.println(actualResult);
        String expectedResult = expresult;
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
