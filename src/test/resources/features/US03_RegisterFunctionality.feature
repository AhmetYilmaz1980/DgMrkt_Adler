@B7DGMRT-3
Feature: User Register Functionality

  @B7DGMRT-60
  Background: Click on My User Account and Register button
    Given The user clicks on the My Account and Register section

  @B7DGMRT-59
  Scenario Outline: To register in the application by entering valid criteria.
    When The user enters "<firstName>" and "<lastName>" and "<email>" and "<telephone>" and "<password>" and "<passwordConfirm>"
    When The user clicks subscribe "<yesNo>" and privacy policy
    And The user clicks the register continue button
    Then Verify that the user "Your Account Has Been Created!" pages appears on the screen
    When The user clicks the continue button
    Then The user "My Account" can be see his account page
    Examples:
      | firstName  | lastName | email           | telephone   | password  | passwordConfirm | yesNo |
      | zindan2    | karanlık | Js@gmail.com    | 01234567891 | Test1234! | Test1234!       | Yes   |
      | Nurzeynep2 | zeynep1  | J01@gmail.co    | 01234567891 | Test1234! | Test1234!       | Yes   |
      | nerede2    | nerede1  | J02@hotmail.com | 01234567891 | Test1234! | Test1234!       | Yes   |

  @B7DGMRT-61
  Scenario Outline: The user enters invalid value
    When The user enters "<firstName>" and "<lastName>" and "<email>" and "<telephone>" and "<password>" and "<passwordConfirm>"
    And The user clicks subscribe "<yesNo>" and privacy policy
    When The user clicks the register continue button
    Then Verify the warning message "<ExpectedMessage>" and "<confirmExpectedMessage>"
    Examples:
      | firstName                         | lastName                          | email        | telephone                         | password  | passwordConfirm | yesNo | ExpectedMessage                                 | confirmExpectedMessage                         |
      |                                   | ucmak9                            | Js@gmail.com | 01234567891                       | Test1234! | Test1234!       | Yes   | First Name must be between 1 and 32 characters! |                                                |
      | 123456789012345678901234567890124 | ucmak6                            | Js@gmail.com | 01234567891                       | Test1234! | Test1234!       | Yes   | First Name must be between 1 and 32 characters! |                                                |
      | turker6                           |                                   | Js@gmail.com | 01234567891                       | Test1234! | Test1234!       | Yes   | Last Name must be between 1 and 32 characters!  |                                                |
      | turker7                           | 123456789012345678901234567890126 | Js@gmail.com | 01234567891                       | Test1234! | Test1234!       | Yes   | Last Name must be between 1 and 32 characters!  |                                                |
      | fırsat6                           | frst6                             | trkgmail.com | 01234567891                       | Test1234! | Test1234!       | Yes   | E-Mail Address does not appear to be valid!     |                                                |
      | fırsat7                           | frst7                             | @gmail.com   | 01234567891                       | Test1234! | Test1234!       | Yes   | E-Mail Address does not appear to be valid!     |                                                |
      | fırsat8                           | frst8                             |              | 01234567891                       | Test1234! | Test1234!       | Yes   | E-Mail Address does not appear to be valid!     |                                                |
      | fırsat9                           | frst9                             | trk@.com     | 01234567891                       | Test1234! | Test1234!       | Yes   | E-Mail Address does not appear to be valid!     |                                                |
      | fırsat10                          | frst10                            | trk@gmailcom | 01234567891                       | Test1234! | Test1234!       | Yes   | E-Mail Address does not appear to be valid!     |                                                |
      | fırsat11                          | frst11                            | trk@gmail    | 01234567891                       | Test1234! | Test1234!       | Yes   | E-Mail Address does not appear to be valid!     |                                                |
      | omar1                             | omar1                             | Js@gmail.com |                                   | Test1234! | Test1234!       | Yes   | Telephone must be between 3 and 32 characters!  |                                                |
      | omar2                             | omar2                             | Js@gmail.com | 12                                | Test1234! | Test1234!       | Yes   | Telephone must be between 3 and 32 characters!  |                                                |
      | omar3                             | omar3                             | Js@gmail.com | 123456789012345678901234567890123 | Test1234! | Test1234!       | Yes   | Telephone must be between 3 and 32 characters!  |                                                |
      | erva                              | zeynep                            | Js@gmail.com | 01234567891                       |           |                 | Yes   | Password must be between 4 and 20 characters!   |                                                |
      | erva                              | zeynep                            | Js@gmail.com | 01234567891                       | 123       | 123             | Yes   | Password must be between 4 and 20 characters!   |                                                |
      | erva                              | zeynep                            | Js@gmail.com | 01234567891                       | 123       | 456             | Yes   | Password must be between 4 and 20 characters!   | Password confirmation does not match password! |
      | erva                              | zeynep                            | Js@gmail.com | 01234567891                       |           | 456789          | Yes   | Password must be between 4 and 20 characters!   | Password confirmation does not match password! |
      | erva                              | zeynep                            | Js@gmail.com | 01234567891                       | 456789    |                 | Yes   |                                                 | Password confirmation does not match password! |

  @B7DGMRT-62
  Scenario Outline: User does not click Privacy Policy
    When The user enters "<firstName>" and "<lastName>" and "<email>" and "<telephone>" and "<password>" and "<passwordConfirm>"
    And The user clicks subscribe "<yesNo>"
    When The user clicks the register continue button
    Then Verify the warning message "<warningMessage>" below the screen
    Examples:
      | firstName | lastName | email                | telephone   | password  | passwordConfirm | yesNo | warningMessage                                 |
      | altan     | erkek    | altanerkek@gmail.com | 01234567891 | Test1234! | Test1234!       | No    | Warning: You must agree to the Privacy Policy! |