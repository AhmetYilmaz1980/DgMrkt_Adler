Feature: Logout Funcionality

  @logout
  Scenario Outline: Logout Test
    * The user is on the home page
    * The user clicks to My Account
    * The user should be able to see and click Login button
    * The user enters correct "<email>" ,"<password>" and clicks black login button
    * The user should be able to login and see positive login message
    * The user cliks to My Account dropdown menu and Logout button
    * Verify that account logout pop-up is visible
    * Close driver

    Examples:
      | email          | password     |
      | ali1@gmail.com | galatasaray. |


  @logout
  Scenario Outline: Logout Test on My account page
    * The user is on the home page
    * The user clicks to My Account
    * The user should be able to see and click Login button
    * The user enters correct "<email>" ,"<password>" and clicks black login button
    * The user should be able to login and see positive login message
    * The user clicks to My Account dropdown menu and My Account button
    * Verify that account logout is visible
    * Close driver

    Examples:
      | email          | password     |
      | ali1@gmail.com | galatasaray. |

