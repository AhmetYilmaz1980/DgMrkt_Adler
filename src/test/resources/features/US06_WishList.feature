@wish
Feature: Wish List Test

  Background:
    Given The user logs in to DgMrkt

    Scenario: The number of added items should be displayed on the Like icon before entering the wish list.
      When The user logs in to My Account
      And The user clicks on wish list button
      Then The user verifies the product is in wish list