@wish
Feature: Wish List Test

  Scenario: The user should be able to see products in the wish list
    Given The user logs in to My Account
    When The user clicks on wish list button
    Then The user verifies the product is in wish list


  Scenario: The user should be able to add products to cart
    Given The user logs in to My Account
    When The user clicks on wish list button
    And The user sees and clicks cart button
    Then The user verify that the product has been added


  Scenario: The user should be able to delete products from wish list
    Given The user logs in to My Account
    When The user clicks on wish list button
    And The user scrolls down
    And The user sees and clicks delete button
    And The user updates wishlist
    Then The user verify that the product has been deleted