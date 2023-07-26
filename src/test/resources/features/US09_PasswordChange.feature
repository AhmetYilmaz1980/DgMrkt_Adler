@smoke @B7DGMRT-9
Feature: Password Change

  Background:
    Given The user is on the home page
    Then The user clicks "Login" from MyAccountButton
    And The user logs into DgMrkt with valid credentials
    Then The user should be able to login and see positive login message
    And The user clicks "My Account" from MyAccountButton
    Then Verify that the user is on the AccountPage
    And The user clicks "Password" from AccountPage

  @B7DGMRT-52
  Scenario Outline: Password Change Positiv TESTS - As a user I should be able to change password
    When The User is on the Change Password Page
    And The User enters password "<password>" and confirm "<passwordConfirm>"
    Then Verify that the user gets a success message
    Examples:
      | password             | passwordConfirm      |
      | '    '               | '    '               |
      | abcd                 | abcd                 |
      | 1234                 | 1234                 |
      | /()=                 | /()=                 |
      | ab12                 | ab12                 |
      | ab$%                 | ab$%                 |
      | ....                 | ....                 |
      | abcde12345abcde12345 | abcde12345abcde12345 |


  @B7DGMRT-53
  Scenario Outline: Password Change Negativ TESTS - As a user I should be able to get warning message
    When The User is on the Change Password Page
    And The User enters password "<password>" and confirm "<passwordConfirm>"
    Then Verify that the user gets a "<passwordExpected>" "<comfirmExpected>"and still on the password change page
    Examples:
      | password | passwordConfirm | passwordExpected                               | comfirmExpected                                |
      | abcd     |                 | Password confirmation does not match password! |                                                |
      |          | abcd            | Password must be between 4 and 20 characters!  | Password confirmation does not match password! |
      |          |                 | Password must be between 4 and 20 characters!  |                                                |
      | abc      | abc             | Password must be between 4 and 20 characters!  |                                                |


