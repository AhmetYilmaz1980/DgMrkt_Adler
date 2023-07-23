@wip
Feature: Edit-Update Account Information

  Background:
    Given The user is on the home page
    Then The user clicks "Login" from MyAccountButton
    And The user logs into DgMrkt with valid credentials
    Then The user should be able to login and see positive login message
    And The user clicks "My Account" from MyAccountButton
    Then Verify that the user is on the AccountPage
    And The user clicks "Edit Account" from AccountPage
    Then Verify that the user is on the Edit Information Page


  Scenario Outline:Edit Info Positive TESTS - Edit Information with valid credentials
    Then The User on the Edit Information Page
    Then The User enters "<firstName>" "<lastName>" "<email>" "<telephone>"
    And Verify that the user successfully update information
    Examples:
      | firstName                        | lastName                         | email             | telephone                        |
      | a                                | a                                | ali1@gmail.com    | 012                              |
      | AbcAbcAbcAbcAbcAbcAbcAbcAbcAbcAb | AbcAbcAbcAbcAbcAbcAbcAbcAbcAbcAb | ali1@gmail.com    | 01234567890123456789012345678901 |
      | ali                              | ali                              | ali1@gmail.co     | 0123456789                       |
      | ali                              | ali                              | ali1@hotmail.com  | 0123456789                       |
      | ali                              | ali                              | ali1@gmail.com.de | 0123456789                       |
      | ali                              | ali                              | ali1@gmail.com    | 0123456789                       |


  Scenario Outline: Negative TESTS_1
    Given The User on the Edit Information Page
    When The User enters "<firstName>" "<lastName>" "<email>" "<telephone>"
    Then Verify that the user gets a "<warningMessage>"
    Examples:
      | firstName                         | lastName                          | email          | telephone  | warningMessage                                  |
      |                                   | ali                               | ali1@gmail.com | 0123456789 | First Name must be between 1 and 32 characters! |
      | ali                               |                                   | ali1@gmail.com | 0123456789 | Last Name must be between 1 and 32 characters!  |
      | ali                               | ali                               |                | 0123456789 | E-Mail Address does not appear to be valid!     |
      | ali                               | ali                               | ali1@gmail.com |            | Telephone must be between 3 and 32 characters!  |
      | AbcAbcAbcAbcAbcAbcAbcAbcAbcAbcAbc | ali                               | ali1@gmail.com | 0123456789 | First Name must be between 1 and 32 characters! |
      | ali                               | AbcAbcAbcAbcAbcAbcAbcAbcAbcAbcAbc | ali1@gmail.com | 0123456789 | Last Name must be between 1 and 32 characters!  |
      | ali                               | ali                               | ali1@gmail.com | 01         | Telephone must be between 3 and 32 characters!  |


  Scenario Outline: Negative TESTS_2 - Get POP-UP Warning Messages
    Given The User on the Edit Information Page
    When The User enters "<firstName>" "<lastName>" "<email>" "<telephone>"
    Then The message contains "<message>"
    Examples:
      | firstName | lastName | email         | telephone  | message                                                       |
      | ali1      | ali1     | ali1@gmail    | 0123456789 | E-Mail Address does not appear to be valid!                   |
      | ali1      | ali1     | ali1          | 0123456789 | Die E-Mail-Adresse muss ein @-Zeichen enthalten.              |
      | ali1      | ali1     | ())(=)(=)=??= | 0123456789 | Die E-Mail-Adresse muss ein @-Zeichen enthalten.              |
      | ali1      | ali1     | 0123456789    | 0123456789 | Die E-Mail-Adresse muss ein @-Zeichen enthalten.              |
      | ali1      | ali1     | ali1@         | 0123456789 | Gib etwas nach dem @-Zeichen ein.                             |
      | ali1      | ali1     | ali1@com.     | 0123456789 | Das Punktzeichen . steht in com. an einer falschen Stelle.    |
      | ali1      | ali1     | ali1@com@     | 0123456789 | Nach dem @-Zeichen darf das Zeichen @ nicht verwendet werden. |

