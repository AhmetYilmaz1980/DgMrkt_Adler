@B7DGMRT-7
Feature: The Functionality of the Cart Icon

  @B7DGMRT-88
  Scenario: The user should be able to verify if there is any product in the cart.
    Given The user is on the home page
    When The user clicks to My Account
    Then The user should be able to see and click Login button
    And The user logs into DgMrkt with valid credentials
    Then The user should be able to login and see positive login message
    Then The user is able to click the Cart Icon
    Then The user is able to receive a verify message that there isn't any product in the cart.

    @B7DGMRT-89
  Scenario: The user should be able to add products to the cart and see them in the cart.
    Given The user is on the home page
    When The user clicks to My Account
    Then The user should be able to see and click Login button
    And The user logs into DgMrkt with valid credentials
    Then The user should be able to login and see positive login message
    Then The user is able to add a product to the cart
    And The user is able to click the Cart Icon
    Then The user is able to see the product added to the cart

  @B7DGMRT-90
  Scenario Outline: The user should be able to see the the products added to the cart by clicking the cart icon.
    Given The user is on the home page
    When The user clicks to My Account
    Then The user should be able to see and click Login button
    And The user logs into DgMrkt with valid credentials
    Then The user should be able to login and see positive login message
    And The user hover over in category menu
    Then The user is able to navigate to "<subcategories>"
    And The user is able to add "<products>" to the cart
    And The user is able to click the Cart Icon
    Then The user is able to see the product added to the cart
    And The user is able to click the view cart button on the side window
    Then The user is able to navigate to the shopping cart page

    Examples:
      | subcategories   | products |
      | Health & Beauty | 7487330  |
      | Televisions     | 6816624  |
      | TV Accessories  | 2541828  |
      | Networking      | 7651328  |


  @B7DGMRT-91
  Scenario: The user should be able to continue check out and order the products successfully.
    Given The user is on the home page
    When The user clicks to My Account
    Then The user should be able to see and click Login button
    And The user logs into DgMrkt with valid credentials
    And The user should be able to login and see positive login message
    Then The user is able to click the Cart Icon
    And The user is able to see the check out button
    Then The user is able to navigate to shopping cart by clicking the check out button
    Then The user is able to continue to checkout to order the products

















