@B7DGMRT-10
Feature: Navigate to Address Page and Modify Address information

  Background:
    Given The user is on the home page
    Then The user clicks "Login" from MyAccountButton


  @B7DGMRT-55
  Scenario Outline: Positive scenaria - user should be add a new address with valid credentials
    And The user logs into DgMrkt with "esra9067@gmail.com" and "esra9067"
    Then The user should be able to login and see positive login message
    And The user clicks "My Account" from MyAccountButton
    Then Verify that the user is on the AccountPage
    And The users click "Address Book" from AccountPage
    Then Verify that the user is on the AddressPage
    When The user clicks to New Address
    Then Verify that the user is on the Add Address page
    When The user enters valid "<input-firstname>", "<input-lastname>" ,"<input-address-1>", "<input-city>","<input-postcode>","<input-country>","<input-zone>"
    And The user clicks "ContinueButton"
    Then The user should be able to add a new address and see successfully message "<message>"
    Examples:
      | input-firstname | input-lastname | input-address-1 | input-city | input-postcode | input-country | input-zone    | message                                  |
      | esra            | caglar         | langenhagen 1   | hannover   | 12345          | Germany       | Niedersachsen | Your address has been successfully added |

  @B7DGMRT-63
  Scenario Outline: Positive scenaria - user should be add another new address with valid credentials
    And The user logs into DgMrkt with "esra9067@gmail.com" and "esra9067"
    Then The user should be able to login and see positive login message
    And The user clicks "My Account" from MyAccountButton
    Then Verify that the user is on the AccountPage
    And The users click "Address Book" from AccountPage
    Then Verify that the user is on the AddressPage
    When The user clicks to New Address
    Then Verify that the user is on the Add Address page
    When The user enters valid "<input-firstname>", "<input-lastname>" ,"<input-address-1>", "<input-city>","<input-postcode>","<input-country>","<input-zone>"
    And The user clicks "ContinueButton"
    Then The user should be able to add a new address and see successfully message "<message>"

    Examples:
      | input-firstname | input-lastname | input-address-1 | input-city | input-postcode | input-country | input-zone | message                                  |
      | hakan           | caglar         | göbelbastei 19  | hameln     | 12789          | Germany       | Bremen     | Your address has been successfully added |


  @B7DGMRT-64
  Scenario Outline: Negative scenaria - user should NOT be add another new address with invalid credentials
    And The user logs into DgMrkt with "esra9067@gmail.com" and "esra9067"
    Then The user should be able to login and see positive login message
    And The user clicks "My Account" from MyAccountButton
    Then Verify that the user is on the AccountPage
    And The users click "Address Book" from AccountPage
    Then Verify that the user is on the AddressPage
    When The user clicks to New Address
    Then Verify that the user is on the Add Address page
    When The user enters valid "<input-firstname>", "<input-lastname>" ,"<input-address-1>", "<input-city>","<input-postcode>","<input-country>","<input-zone>"
    And The user clicks "ContinueButton"
    Then The user should NOT be able to add a new address and see warning message "<message>"

    Examples:
      | input-firstname                   | input-lastname | input-address-1 | input-city | input-postcode | input-country         | input-zone            | message                                         |
      |                                   | caglar         | göbelbastei 19  | hameln     | 12789          | Germany               | Bremen                | First Name must be between 1 and 32 characters! |
      | hak123456789012345678901234567890 | caglar         | göbelbastei 19  | hameln     | 12789          | Germany               | Bremen                | First Name must be between 1 and 32 characters! |
      | hakan                             |                | göbelbastei 19  | hameln     | 12789          | Germany               | Bremen                | Last Name must be between 1 and 32 characters!  |
      | hakan                             | caglar         | g               | hameln     | 12789          | Germany               | Bremen                | Address must be between 3 and 128 characters!   |
      | hakan                             | caglar         | göbelbastei 19  | h          | 12789          | Germany               | Bremen                | City must be between 2 and 128 characters!      |
      | hakan                             | caglar         | göbelbastei 19  | hameln     | 1              | Germany               | Bremen                | Postcode must be between 2 and 10 characters!   |
      | hakan                             | caglar         | göbelbastei 19  | hameln     | 12345123456    | Germany               | Bremen                | Postcode must be between 2 and 10 characters!   |
      | hakan                             | caglar         | göbelbastei 19  | hameln     | 12789          | --- Please Select --- | --- None ---          | Please select a country!                        |
      | hakan                             | caglar         | göbelbastei 19  | hameln     | 12789          | Germany               | --- Please Select --- | Please select a region / state!                 |

  @B7DGMRT-65
  Scenario Outline: Positive sceneria - user should be edit the address with valid credentials
    And The user logs into DgMrkt with "esra9067@gmail.com" and "esra9067"
    Then The user should be able to login and see positive login message
    And The user clicks "My Account" from MyAccountButton
    Then Verify that the user is on the AccountPage
    And The users click "Address Book" from AccountPage
    Then Verify that the user is on the AddressPage
    When The user clicks to Edit Button
    Then Verify that the user is on the Edit Address page
    When The user enters new information "<input-firstname>", "<input-lastname>" ,"<input-address-1>", "<input-city>","<input-postcode>","<input-country>","<input-zone>"
    Then The user should be able to update new address information and see success message "<message>"

    Examples:
      | input-firstname | input-lastname | input-address-1   | input-city | input-postcode | input-country | input-zone | message                                    |
      | tarik           | cag            | göbelbas 19       | bon        | 12789          | Turkey        | Ankara     | Your address has been successfully updated |
      | esra            | caglar         | wolfstalstrasse 2 | hameln     | 12789          | Germany       | Hamburg    | Your address has been successfully updated |

  @B7DGMRT-66
  Scenario Outline: Negative sceneria -user should NOT be edit the address with invalid credentials
    And The user logs into DgMrkt with "esra9067@gmail.com" and "esra9067"
    Then The user should be able to login and see positive login message
    And The user clicks "My Account" from MyAccountButton
    Then Verify that the user is on the AccountPage
    And The users click "Address Book" from AccountPage
    Then Verify that the user is on the AddressPage
    When The user clicks to Edit Button
    Then Verify that the user is on the Edit Address page
    When The user enters blank or invalid information "<input-firstname>", "<input-lastname>" ,"<input-address-1>", "<input-city>","<input-postcode>","<input-country>","<input-zone>"
    Then The user should NOT be able to update new address with information and see warning message "<message>"

    Examples:
      | input-firstname                   | input-lastname | input-address-1 | input-city | input-postcode | input-country         | input-zone            | message                                         |
      |                                   | caglar         | göbelbastei 19  | hameln     | 12789          | Germany               | Bremen                | First Name must be between 1 and 32 characters! |
      | hak123456789012345678901234567890 | caglar         | göbelbastei 19  | hameln     | 12789          | Germany               | Bremen                | First Name must be between 1 and 32 characters! |
      | hakan                             |                | göbelbastei 19  | hameln     | 12789          | Germany               | Bremen                | Last Name must be between 1 and 32 characters!  |
      | hakan                             | caglar         | g               | hameln     | 12789          | Germany               | Bremen                | Address must be between 3 and 128 characters!   |
      | hakan                             | caglar         | göbelbastei 19  | h          | 12789          | Germany               | Bremen                | City must be between 2 and 128 characters!      |
      | hakan                             | caglar         | göbelbastei 19  | hameln     | 1              | Germany               | Bremen                | Postcode must be between 2 and 10 characters!   |
      | hakan                             | caglar         | göbelbastei 19  | hameln     | 12345123456    | Germany               | Bremen                | Postcode must be between 2 and 10 characters!   |
      | hakan                             | caglar         | göbelbastei 19  | hameln     | 12789          | --- Please Select --- | --- None ---          | Please select a country!                        |
      | hakan                             | caglar         | göbelbastei 19  | hameln     | 12789          | Germany               | --- Please Select --- | Please select a region / state!                 |


  @B7DGMRT-67
  Scenario: User can delete the added address, when user clicks ok in alertsBox (more than one address information)
    And The user logs into DgMrkt with "esra9067@gmail.com" and "esra9067"
    Then The user should be able to login and see positive login message
    And The user clicks "My Account" from MyAccountButton
    Then Verify that the user is on the AccountPage
    And The users click "Address Book" from AccountPage
    Then Verify that the user is on the AddressPage
    When The user clicks to Delete Button
    Then The user click "OK" button in confirmation screen
    Then The user should be able to delete address information and see success "message"

  @B7DGMRT-68
  Scenario: User can NOT delete the added address, when user clicks ok in alertsBox when there is one address information
    And The user logs into DgMrkt with "esrac@gmail.com" and "Esrac."
    Then The user should be able to login and see positive login message
    And The user clicks "My Account" from MyAccountButton
    Then Verify that the user is on the AccountPage
    And The users click "Address Book" from AccountPage
    Then Verify that the user is on the AddressPage
    When The user clicks to Delete Button
    Then The user click "OK" button in confirmation screen
    Then The user should NOT be able to delete address information and see warning "message"
