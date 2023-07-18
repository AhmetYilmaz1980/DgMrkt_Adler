Feature: Login DgMrkt on Homepage
  @login
  Scenario Outline: Positive Login Test
    Given The user is on the home page
    When The user clicks to My Account
    Then The user should be able to see and click Login button
    When The user enters correct "<email>" ,"<password>" and clicks black login button
    Then The user should be able to login and see positive login message


    Examples:
      |      email                 |      password       |
      |    umut51088@gmail.com     |     2574dGlogin     |