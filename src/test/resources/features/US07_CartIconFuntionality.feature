Feature: The Functionality of the Cart Icon
  @cart
  Scenario: The user should be able to see the the products added to the cart by clicking the cart icon
    Given The user is on the home page
    When The user is able to add a "product" to the cart
    Then The user is able to click the Cart Icon
    And The user is able to see the product added to the cart
