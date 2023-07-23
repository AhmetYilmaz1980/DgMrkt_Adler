@wip
Feature: User Register Functionality

  Background: Click on My User Account and Register button
    Given The user clicks on the My Account and Register section


  Scenario Outline: To register in the application by entering valid criteria.
    When The user enters "<firstName>" and "<lastName>" and "<email>" and "<telephone>" and "<password>" and "<passwordConfirm>"
    When The user clicks subscribe "<yesNo>" and privacy policy
    And The user clicks the register continue button
    Then Verify that the user "Your Account Has Been Created!" pages appears on the screen
    When The user clicks the continue button
    Then The user "My Account" can be see his account page
    Examples:
      | firstName  | lastName | email                      | telephone   | password  | passwordConfirm | yesNo |
      | zindan2    | karanlık | emirhan9@gmail.com         | 01234567891 | Test1234! | Test1234!       | Yes   |
      | Nurzeynep2 | zeynep1  | nursema01@gmail.co         | 01234567891 | Test1234! | Test1234!       | Yes   |
      | nerede2    | nerede1  | neredesinlan01@hotmail.com | 01234567891 | Test1234! | Test1234!       | Yes   |


  Scenario Outline: The user enters invalid value in firstName
    When The user enters "<firstName>" and "<lastName>" and "<email>" and "<telephone>" and "<password>" and "<passwordConfirm>"
    And The user clicks subscribe "<yesNo>" and privacy policy
    When The user clicks the register continue button
    Then Verify the warning message "<message>"
    Examples:
      | firstName                         | lastName                          | email                | telephone                         | password  | passwordConfirm | yesNo | message                                         |
      |                                   | ucmak9                            | developer3@gmail.com | 01234567891                       | Test1234! | Test1234!       | Yes   | First Name must be between 1 and 32 characters! |
      | 123456789012345678901234567890124 | ucmak6                            | developer9@gmail.com | 01234567891                       | Test1234! | Test1234!       | Yes   | First Name must be between 1 and 32 characters! |
      | turker6                           |                                   | devnets7@gmail.com   | 01234567891                       | Test1234! | Test1234!       | Yes   | Last Name must be between 1 and 32 characters!  |
      | turker7                           | 123456789012345678901234567890126 | devnets8@gmail.com   | 01234567891                       | Test1234! | Test1234!       | Yes   | Last Name must be between 1 and 32 characters!  |
      | fırsat6                           | frst6                             | trkgmail.com         | 01234567891                       | Test1234! | Test1234!       | Yes   | E-Mail Address does not appear to be valid!     |
      | fırsat7                           | frst7                             | @gmail.com           | 01234567891                       | Test1234! | Test1234!       | Yes   | E-Mail Address does not appear to be valid!     |
      | fırsat8                           | frst8                             |                      | 01234567891                       | Test1234! | Test1234!       | Yes   | E-Mail Address does not appear to be valid!     |
      | fırsat9                           | frst9                             | trk@.com             | 01234567891                       | Test1234! | Test1234!       | Yes   | E-Mail Address does not appear to be valid!     |
      | fırsat10                          | frst10                            | trk@gmailcom         | 01234567891                       | Test1234! | Test1234!       | Yes   | E-Mail Address does not appear to be valid!     |
      | fırsat11                          | frst11                            | trk@gmail            | 01234567891                       | Test1234! | Test1234!       | Yes   | E-Mail Address does not appear to be valid!     |
      | omar1                             | omar1                             | omar1@gmail.com      |                                   | Test1234! | Test1234!       | Yes   | Telephone must be between 3 and 32 characters!  |
      | omar2                             | omar2                             | omar2@gmail.com      | 12                                | Test1234! | Test1234!       | Yes   | Telephone must be between 3 and 32 characters!  |
      | omar3                             | omar3                             | omar3@gmail.com      | 123456789012345678901234567890123 | Test1234! | Test1234!       | Yes   | Telephone must be between 3 and 32 characters!  |
      | erva                              | zeynep                            | erva@gmail.com       | 01234567891                       |           |                 | Yes   | Password must be between 4 and 20 characters!   |
      | erva                              | zeynep                            | erva@gmail.com       | 01234567891                       | 123       | 123             | Yes   | Password must be between 4 and 20 characters!   |
      | erva                              | zeynep                            | erva@gmail.com       | 01234567891                       | 123       | 456             | Yes   | Password must be between 4 and 20 characters!   |
      | erva                              | zeynep                            | erva@gmail.com       | 01234567891                       |           | 456789          | Yes   | Password must be between 4 and 20 characters!   |
      | erva                              | zeynep                            | erva@gmail.com       | 01234567891                       | 456789    |                 | Yes   | Password confirmation does not match password!  |


  Scenario Outline: User does not click Privacy Policy
    When The user enters "<firstName>" and "<lastName>" and "<email>" and "<telephone>" and "<password>" and "<passwordConfirm>"
    And The user clicks subscribe "<yesNo>"
    When The user clicks the register continue button
    Then Verify the warning message "Warning: You must agree to the Privacy Policy!" below the screen
    Examples:
      | firstName | lastName | email                | telephone   | password  | passwordConfirm | yesNo |
      | altan     | erkek    | altanerkek@gmail.com | 01234567891 | Test1234! | Test1234!       | No    |



