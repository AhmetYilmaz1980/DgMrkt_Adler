package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditInfoPage extends BasePage {
    AccountPage accountPage = new AccountPage();

    @FindBy(xpath = "//a[text()='Edit Information']")
    public WebElement editInfoText;

    @FindBy(id = "input-firstname")
    public WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    public WebElement lastNameInput;

    @FindBy(id = "input-email")
    public WebElement emailInput;

    @FindBy(id = "input-telephone")
    public WebElement telephoneInput;

    @FindBy(css = "[value='Continue']")
    public WebElement continueButton;

    @FindBy(className = "text-danger")
    public WebElement blankInputWarningMessage;

    public void editInformation(String firstName, String lastName, String email, String telephone) {

        for (int i = 0; i < 1; i++) {
            if (firstName != null) {
                firstNameInput.clear();
                firstNameInput.sendKeys(firstName);
            } else {
                firstNameInput.sendKeys(firstName);
                continueButton.click();
                break;
            }
            if (lastName != null) {
                lastNameInput.clear();
                lastNameInput.sendKeys(lastName);
            } else {
                lastNameInput.sendKeys(lastName);
                continueButton.click();
                break;
            }
            if (email != null) {
                emailInput.clear();
                emailInput.sendKeys(email);
            } else {
                emailInput.sendKeys(email);
                continueButton.click();
                break;
            }
            if (telephone != null) {
                telephoneInput.clear();
                telephoneInput.sendKeys(telephone);
            } else {
                telephoneInput.sendKeys(telephone);
                continueButton.click();
                break;
            }
        }

        continueButton.click();
        BrowserUtils.waitFor(3);
    }
    public void verifyEditInformationPage() {
        assertTrue("Element could NOT displayed",editInfoText.isDisplayed());
    }
    public void verifyGetWarningMessage(String expectedMessage) {
        BrowserUtils.waitForVisibility(blankInputWarningMessage, 3);
        String actualWarningMessage = blankInputWarningMessage.getText();
        assertEquals(expectedMessage, actualWarningMessage);
    }
    public void resetEmail() {
        accountPage.selectButtonFromAccountPage("Edit Account");
        emailInput.clear();
        emailInput.sendKeys("ali1@gmail.com");
        continueButton.click();
    }
    public void getDisappearingWarningMessage(String message) {
        String actualMessage;
        if (message.contains("@")) {
            actualMessage = emailInput.getAttribute("validationMessage");
            System.out.println("actualMessage = " + actualMessage);
        } else if (message.contains("valid")) {
            actualMessage = blankInputWarningMessage.getText();
            System.out.println("actualMessage = " + actualMessage);
        }
    }
}
