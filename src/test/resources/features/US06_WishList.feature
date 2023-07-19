Feature: Wish List Test

  Background:
    Given The user logs in to DgMrkt

    Scenario: The number of added items should be displayed on the Like icon before entering the wish list.
      When The user logs in to My Account
      Then The user verify that product number appears in the Like icon