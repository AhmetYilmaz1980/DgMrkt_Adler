@US04
Feature: Currency Function

  Background:
    Given The user is on the home page
    When The user clicks to My Account
    Then The user should be able to see and click Login button

  Scenario Outline: The user should be able to see products price with currency of choice
    When The user enters correct "<email>" ,"<password>" and clicks black login button
    Then The user should be able to login and see positive login message
    When The user clicks currency button and selects "<currency>"
    And  The user should close the advertisement tab
    Then The user scrolls down the page and should be able to see products with "<symbol>" of "<currency>"


    Examples:
      | email               | password    | currency       | symbol |
      | umut51088@gmail.com | 2574dGlogin | Euro           | €      |
      | umut51088@gmail.com | 2574dGlogin | Pound Sterling | $      |
      | umut51088@gmail.com | 2574dGlogin | US Dollar      | £      |

  Scenario Outline: The user should be able to complete the purchase with currency of choice
    When The user enters correct "<email>" ,"<password>" and clicks black login button
    Then The user should be able to login and see positive login message
    When The user clicks currency button and selects "<currency>"
    And  The user should close the advertisement tab
    Then The user scrolls down the page and should be able to see products with "<symbol>" of "<currency>"
    And The user clicks on a product(TV)
    And The user clicks on add to cart button and close the success transaction tab
    And The user scrolls up the basket icon and clicks on it
    And The user clicks checkout button and should be able to see checkout page
    And The user clicks on continue button with existing address on billing and delivery details tabs
    And The user clicks on continue button on delivery method tab
    And The user clicks on continue and terms &condition button on payment method tab
    When The user should be able to be see total price with "<symbol>" of "<currency>" and clicks on confirm order button
    Then The user should be able to see that the order has been placed message


    Examples:
      | email               | password    | currency | symbol |
      | umut51088@gmail.com | 2574dGlogin | Euro     | €      |


  Scenario Outline: The user should be able to complete the purchase when the currency is changed at last step of purchase
    When The user enters correct "<email>" ,"<password>" and clicks black login button
    Then The user should be able to login and see positive login message
    Then The user scrolls down the page and should be able to see products
    And The user clicks on a product(TV)
    And The user clicks on add to cart button and close the success transaction tab
    And The user scrolls up the basket icon and clicks on it
    And The user clicks checkout button and should be able to see checkout page
    And The user clicks on continue button with existing address on billing and delivery details tabs
    And The user clicks on continue button on delivery method tab
    And The user clicks on continue and terms &condition button on payment method tab
    And The user scrolls up to currency button and selects "<currency>"
    And The user clicks on continue button with existing address on billing and delivery details tabs
    And The user clicks on continue button on delivery method tab
    And The user clicks on continue and terms &condition button on payment method tab
    When The user should be able to be see total price with "<symbol>" of "<currency>" and clicks on confirm order button
    Then The user should be able to see that the order has been placed message

    Examples:
      | email               | password    | currency | symbol |
      | umut51088@gmail.com | 2574dGlogin | Euro     | €      |

