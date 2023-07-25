package com.euroTech.stepDefs;

import com.euroTech.pages.*;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.euroTech.utilities.Driver.driver;

import com.euroTech.pages.HomePage;
import com.euroTech.pages.LogoutPage;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        String actualResult = searchPage.resultSearch.getText();
        System.out.println(actualResult);
        String expectedResult = expresult;
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Given("Verify that the search icon is visible")
    public void verify_that_the_search_icon_is_visible() {
        searchPage.searchButtonIcon.isDisplayed();
    }


    @Given("Enter a search term {string} and choose subcategory {string} then click black search button")
    public void enter_a_search_term_and_choose_subcategory_then_click_black_search_button(String urun, String subCat) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        searchPage.BelowSearchBox.sendKeys(urun);
        WebElement ddm = searchPage.subCatDDM;
        Select select = new Select(ddm);
        select.selectByVisibleText(subCat);
        searchPage.blackSearchButton.click();
    }

    int list1size=0;

    @Given("Get search result as a list1")
    public int get_search_result_as_a_list1() {
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        List<WebElement> list1 = driver.findElements(By.className("box-price"));
        System.out.println(list1.size());
        list1size = list1.size();
        return list1size;
    }

    int list2size=0;

    @Given("Get search result as a list2")
    public int get_search_result_as_a_list2() {
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        List<WebElement> list2 = driver.findElements(By.className("box-price"));
        System.out.println(list2.size());
        list2size = list2.size();
        return list2size;
    }

    @Given("Click Home Page Button")
    public void click_home_page_button() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_UP).perform();
        searchPage.homePageBut.click();
        Thread.sleep(3000);
    }

    @Given("Verify that the results are different")
    public void verify_that_the_results_are_different() {
        Assert.assertNotEquals(list1size, list2size);
    }


}
