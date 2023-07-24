package com.euroTech.pages;

import com.euroTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;
import static org.junit.Assert.assertEquals;

public class RegisterAccountPage extends BasePage {
    @FindBy(id = "input-firstname")
    public WebElement firstNameInput;
    @FindBy(id = "input-lastname")
    public WebElement lastNameInput;
    @FindBy(id = "input-register-email")
    public WebElement emailInput;
    @FindBy(id = "input-telephone")
    public WebElement telephoneInput;
    @FindBy(id = "input-register-password")
    public WebElement passwordInput;
    @FindBy(id = "input-confirm")
    public WebElement confirmPasswordInput;
    @FindBy(xpath = "//input[@name='agree']")
    public WebElement privacyPolicyBtn;
    @FindBy(xpath = "//*[@id='ajax-register-form']/div/div/input[2]")
    public WebElement registerContinueBtn;
    @FindBy(xpath = "//*[@id='content']/div[1]/div/div/div/div/div/div[3]/div[3]/div/div/div/div[1]")
    public WebElement yourAccountHasBeenCreated;
    @FindBy(xpath = "//span[text()='Continue']")
    public WebElement continueBtn;
    @FindBy(xpath = "//h2[text()='My Account']")
    public WebElement myAccount;
    @FindBy(xpath = "//div[text()='First Name must be between 1 and 32 characters!']")
    public WebElement firstNameWarningMessage;
    @FindBy(xpath = "//div[text()='Last Name must be between 1 and 32 characters!']")
    public WebElement lastNameWarningMessage;
    @FindBy(xpath = "//div[text()='E-Mail Address does not appear to be valid!']")
    public WebElement emailWarningMessage;
    @FindBy(xpath = "//div[text()='Telephone must be between 3 and 32 characters!']")
    public WebElement telephoneWarningMessage;
    @FindBy(xpath = "//div[text()='Password must be between 4 and 20 characters!']")
    public WebElement passwordWarningMessage;
    @FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
    public WebElement confirmPasswordWarningMessage;
    @FindBy(xpath = "//span[text()=' Warning: You must agree to the Privacy Policy!']")
    public WebElement privacyPolicy;


    protected String getString() {
        String emailChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) {
            int index = (int) (rnd.nextFloat() * emailChars.length());
            salt.append(emailChars.charAt(index));
        }
        String emailStr = salt.toString();
        return emailStr;
    }

    public void validRegister(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) {
        if (email.contains("Js")) {
            email = getString() + "@gmail.com";
        } else if (email.contains("J01")) {
            email = getString() + "@gmail.co";
        } else if (email.contains("J02")) {
            email = getString() + "@hotmail.com";
        } else if (!email.contains("@")) {
            email = getString() + "gmail.com";
        } else if (email.isBlank()) {
            email = null;
        } else if (!email.contains("gmail")) {
            email = getString() + "@.com";
        } else if (!email.contains(".")) {
            email = getString() + "@gmailcom";
        } else if (!email.contains(".com")) {
            email = getString() + "@gmail";
        }
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        telephoneInput.sendKeys(telephone);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(passwordConfirm);
    }

    public void subscribeAndPrivacyPolicy(String yesNo) {
        Driver.get().findElement(By.xpath("//label[text()='" + yesNo + "']")).click();
        privacyPolicyBtn.click();
    }

    public void assertionPassword(String expectedMessage, String confirmExpectedMessage) {
        if (expectedMessage.contains("4 and 20 characters!")&&confirmExpectedMessage==null){
            assertEquals(expectedMessage,passwordWarningMessage.getText());
        } else if (expectedMessage.isBlank()&&confirmExpectedMessage!=null) {
            assertEquals(confirmExpectedMessage,confirmPasswordWarningMessage.getText());
        }
    }

    public void assertion(String expectedMessage) {
        String actualMessage = null;
        if (expectedMessage.contains("First Name")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + expectedMessage + "']")).getText();
        } else if (expectedMessage.contains("Last Name")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + expectedMessage + "']")).getText();
        } else if (expectedMessage.contains("E-Mail")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + expectedMessage + "']")).getText();
        } else if (expectedMessage.contains("Telephone")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + expectedMessage + "']")).getText();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    public void fullAssertionMessage(String expectedMessage, String confirmExpectedMessage){
        if (expectedMessage.contains("32 characters!")|| expectedMessage.contains("E-Mail")){
            assertion(expectedMessage);
        } else {
            assertionPassword(expectedMessage,confirmExpectedMessage);
        }
    }
    public void privacyPolicyAssertion(String expectedMessage) {
        String actualMessage = privacyPolicy.getText();
        assertEquals(expectedMessage, actualMessage);
    }
}
