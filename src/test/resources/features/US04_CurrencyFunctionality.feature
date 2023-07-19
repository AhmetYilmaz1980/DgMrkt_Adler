@wip
Feature: Currency Function

  Background:
    Given The user is on the home page
    When The user clicks to My Account
    Then The user should be able to see and click Login button

  Scenario Outline:
    When The user enters correct "<email>" ,"<password>" and clicks black login button
    Then The user should be able to login and see positive login message
    When The user clicks currency button and selects "<currency>"
    And  The user should close the advertisement tab
    Then The user scrolls down the page and should be able to see products with currency of choice


    Examples:
      | email          | password     |      currency            |
      | ali1@gmail.com | galatasaray. |      Euro                |
      | ali1@gmail.com | galatasaray. |      Pound Sterling      |
      |ali1@gmail.com  | galatasaray. |      US Dollar           |