Feature: Navigate to Account Page

@wip
  Scenario: Navigate to Account Page
    Given The user is on the home page
    Then The user clicks "Login" from MyAccountButton
    And The user logs into DgMrkt with valid credentials
    Then The user should be able to login and see positive login message
    And The user clicks "My Account" from MyAccountButton
    Then Verify that the user is on the AccountPage
    And The user clicks "Edit Account" from AccountPage
