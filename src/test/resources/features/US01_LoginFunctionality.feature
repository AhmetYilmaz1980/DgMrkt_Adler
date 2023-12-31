@B7DGMRT-1
Feature: Login DgMrkt on Homepage

  @B7DGMRT-28
  Scenario Outline: Positive Login Test
    Given The user is on the home page
    When The user clicks to My Account
    Then The user should be able to see and click Login button
    When The user enters correct "<email>" ,"<password>" and clicks black login button
    Then The user should be able to login and see positive login message


    Examples:
      | email          | password     |
      | ali1@gmail.com | galatasaray. |



  @B7DGMRT-69
  Scenario Outline: Negative Login Test
    Given The user is on the home page
    When The user clicks to My Account
    Then The user should be able to see and click Login button
    When The user enters wrong "<email>" ,"<password>" and clicks black login button
    Then The user shouldn't be able to login and see negative login message


    Examples:
      | email               | password    |
      | alicabbar@gmail.com | Test123     |
      |                     |             |
      |umut51088@gmail.com  |             |