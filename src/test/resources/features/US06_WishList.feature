@B7DGMRT-06
Feature: Wish List Test

  Background:
    Given The user logs in to My Account
    And The user clicks on wish list button

  @wish1
  Scenario: The user should be able to see products in the wish list
    Then The user verifies the product is in wish list

  @wish2
  Scenario: The user should be able to add products to cart
    And The user sees and clicks cart button
    Then The user verify that the product has been added

  @wish3
  Scenario: The user should be able to delete products from wish list
    And The user scrolls down
    And The user sees and clicks delete button
    And The user updates wishlist
    Then The user verify that the product has been deleted