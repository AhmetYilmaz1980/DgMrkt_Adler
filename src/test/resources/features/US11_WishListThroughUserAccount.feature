@B7DGMRT-11
Feature: As a user, I should be able to modify My wish list by clicking the Wish List tab under the My Account module.

  Background: As a user I should be able reach wish list on My wish list page
    Given The user is on the home page
    Then The user clicks "Login" from MyAccountButton
    And The user logs into DgMrkt with valid credentials
    Then The user should be able to login and see positive login message
    Then The user is able to add a product to the wish list
    And The user clicks "My Account" from MyAccountButton
    Then Verify that the user is on the AccountPage
    And The user clicks "Wish List" from AccountPage

  @B7DGMRT-102
  Scenario: The user should be able to see products in the wish list
    Then The user verifies the product is in wish list

  @B7DGMRT-104
  Scenario: The user should be able to add products to cart
    And The user clicks cart button on the wish list page
    Then The user verifies that the product has been added

  @B7DGMRT-105
  Scenario: The user should be able to delete products from wish list
    And The user clicks remove button to remove the product button
    And The user updates wishlist
    Then The user verifies that the product has been deleted



