package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class AddressPage extends BasePage {
    @FindBy(xpath = "//a[text()='Modify your address book entries']")
    public WebElement modifyAddressButton;
    @FindBy(xpath = "//h2[text()='Address Book Entries']")
    public WebElement addressBookSuccessMessage;
    @FindBy(xpath = "//a[text()='Address Book']")
    public WebElement addressBookMessage;
    @FindBy(xpath = "//a[text()='New Address']")
    public WebElement newAddressButton;
    @FindBy(xpath = "//h2[text()='Add Address']")
    public WebElement addAdressPageMessage;
    @FindBy(id = "input-firstname")
    public WebElement firstNameInput;
    @FindBy(id = "input-lastname")
    public WebElement lastNameInput;
    @FindBy(id = "input-address-1")
    public WebElement addressInput;
    @FindBy(id = "input-city")
    public WebElement cityInput;
    @FindBy(id = "input-postcode")
    public WebElement postCodeInput;
    @FindBy(id = "input-country")
    public WebElement countryInput;
    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement editContinueButton;
    @FindBy(id = "input-zone")
    public WebElement regionInput;
    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;
    @FindBy(xpath = "//*[@id=\"account-address\"]/div[1]/text()")
    public WebElement addAddressMessageSuccess;
    @FindBy(xpath = "(//div[@class=\"text-danger\"])[1]")
    public WebElement textDangerList;
    @FindBy(xpath = "//div[text()='First Name must be between 1 and 32 characters!']")
    public WebElement FirstNameWarningMessage;
    @FindBy(xpath = "//div[text()='Last Name must be between 1 and 32 characters!']")
    public WebElement LastNameWarningMessage;
    @FindBy(xpath = "//div[text()='Address must be between 3 and 128 characters!']")
    public WebElement AddressWarningMessage;
    @FindBy(xpath = "//div[text()='City must be between 2 and 128 characters!']")
    public WebElement CityWarningMessage;
    @FindBy(xpath = "//div[text()='Postcode must be between 2 and 10 characters!']")
    public WebElement PostCodeWarningMessage;
    @FindBy(xpath = "//div[text()='Please select a country!']")
    public WebElement countryWarningMessage;
    @FindBy(xpath = "//div[text()='Please select a region / state!']")
    public WebElement regionWarningMessage;
    @FindBy(xpath = "//a[text()='Edit']")
    public WebElement editButton;
    @FindBy(xpath = "//h2[text()='Edit Address']")
    public WebElement editAddressPage;
    @FindBy(xpath = "//div[text()=' Your address has been successfully updated']")
    public WebElement editSuccessMessage;
    @FindBy(xpath = "//a[text()='Delete']")
    public WebElement deleteButton;
    @FindBy(xpath = "//div[text()=' Your address has been successfully deleted']")
    public WebElement deleteSuccessMessage;
    @FindBy(xpath ="//div[text()=' Warning: You must have at least one address!']")
    public WebElement deleteWarningMessage;


    public void addressButtonClick() {
        modifyAddressButton.click();
    }
    public void newAddressButtonClick() {
        newAddressButton.click();
    }
    public void verifyAdressBookUpdateSuccess() {
        BrowserUtils.waitForVisibility(addressBookSuccessMessage, 2);
        Assert.assertTrue(addressBookSuccessMessage.isDisplayed());
    }
    public void verifyAddAddressPageUpdateSuccess() {
        BrowserUtils.waitForVisibility(addAdressPageMessage, 2);
        Assert.assertTrue(addAdressPageMessage.isDisplayed());
    }
    public void selectCountry(String country) {
        Select ülke = new Select(countryInput);
        //List<WebElement> ülkeList = ülke.getOptions();
        ülke.selectByVisibleText(country);
    }
    public void selectRegion(String region) {
        Select bölge = new Select(regionInput);
        // List<WebElement> bölgeListe = bölge.getOptions();
        bölge.selectByVisibleText(region);
    }
    public void addAddressValue(String firstName, String lastName, String address, String city, String postCode, String country, String region) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        postCodeInput.sendKeys(postCode);
        selectCountry(country);
        BrowserUtils.waitFor(5);
        selectRegion(region);
        BrowserUtils.waitFor(5);
    }
    public void continueButtnClick() {
        continueButton.click();
    }
    public void jcAlert() {
        Alert alert = Driver.driver.switchTo().alert();
        BrowserUtils.waitFor(4);
        alert.accept();
        BrowserUtils.waitFor(2);
    }
    public void assertionNewAddress(String expectedMessage) {
        String actualMessage = null;
        if (expectedMessage.contains("First Name")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + expectedMessage + "']")).getText();
        } else if (expectedMessage.contains("Last Name")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + expectedMessage + "']")).getText();
        } else if (expectedMessage.contains("Address")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + expectedMessage + "']")).getText();
        } else if (expectedMessage.contains("City")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + expectedMessage + "']")).getText();
        } else if (expectedMessage.contains("Postcode")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + expectedMessage + "']")).getText();
        } else if (expectedMessage.contains("country")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + expectedMessage + "']")).getText();
        } else if (expectedMessage.contains("region")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + expectedMessage + "']")).getText();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    public void verifyEditPageUpdate() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(editAddressPage.isDisplayed());
    }
    public void deleteAlertOkClick() {
        Alert alert = Driver.driver.switchTo().alert();
        alert.accept();
    }
    public void deleteAlertAbbrechenClick() {
        Alert alert = Driver.driver.switchTo().alert();
        alert.dismiss();
    }
    public void editCredantion(String firstName, String lastName, String address, String city, String postCode, String country, String region) {

        if (!firstNameInput.getAttribute("value").equals(firstName)) {
            firstNameInput.clear();
            firstNameInput.sendKeys(firstName);
        }
        if (!lastNameInput.getAttribute("value").equals(lastName)) {
            lastNameInput.clear();
            lastNameInput.sendKeys(lastName);
        }
        if (!addressInput.getAttribute("value").equals(address)) {
            addressInput.clear();
            addressInput.sendKeys(address);
        }
        if (!cityInput.getAttribute("value").equals(city)) {
            cityInput.clear();
            cityInput.sendKeys(city);
        }
        if (!postCodeInput.getAttribute("value").equals(postCode)) {
            postCodeInput.clear();
            postCodeInput.sendKeys(postCode);
        }
        selectRegion("--- Please Select ---");
        selectCountry(country);
        selectRegion("--- Please Select ---");
        selectRegion(region);
        editContinueButton.click();
        BrowserUtils.waitFor(2);
    }
}

