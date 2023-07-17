Feature: Login DgMrkt on Homepage
  @login
  Scenario Outline: Positive Login Test
    Given The user is on the home page
    When The user clicks to My Account
    Then The user should be able to see and click "Login" button
    When The user enters correct "<email>" and "<password>"
    And The user clicks black login(submit) button
    Then The user should be able to login and see positive login "<message>"


    Examples:
      |      email                 |      password       |        message                               |
      |    umut51088@gmail.com     |     2574dGlogin     |      Congratulation! Login Successfully      |