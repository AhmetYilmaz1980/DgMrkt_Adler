@wishList
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

  @wishList
  Scenario: The user should be able to see products in the wish list
    Then The user verifies the product is in wish list

  @wishList
  Scenario: The user should be able to add products to cart
    And The user sees and clicks cart button
    Then The user verify that the "Fitbit Aria Air Smart Bathroom Scale" has been added

  @wishList
  Scenario: The user should be able to delete products from wish list
    And The user scrolls down
    And The user sees and clicks delete button
    And The user updates wishlist
    Then The user verify that the product has been deleted





  #2-Verify that the user should be able to add the products from wish list to cart

  #3-Verify that the User should be able to delete the products from wish list