@B7DGMRT-16
Feature: Product Compare Function


  @B7DGMRT-95
  Scenario Outline: Navigate to Product Compare Page

    Given  The user is on the home page
    When The user hover over to Category button
    Then The user clicks to "<category>" button
    When The user click the Product Compare button
    Then The user is on the Product Compare Page

    Examples:
      | category        |
      | Health & Beauty |
      | TV Accessories  |
      | Networking      |
      | Televisions     |

@B7DGMRT-96
Scenario Outline: The Products they want to compare on the Product Comparison page

    Given The user is on the home page
    When The user hover over to Category button
    Then The user clicks to "<category>" button
    When The user click Show button and choose 100
    Then The user should be able to click to "<product>" Product
    And The user should be able to navigate before page
    When The user click the Product Compare button
    Then The user should be able to see the "<product>" they want to compare on the Product Comparison page

    Examples:
      | category        | product                                |
      | Televisions     | Cello C4020DVB 40\" LED-backlit LCD TV |
      | Networking      | Belkin Secure Flip KVM Switch          |
      | Health & Beauty | Capsule Plate 6pcs                     |
      | TV Accessories  | Belkin adapter cable                   |

@B7DGMRT-97
Scenario Outline: The Products want to compare on the Product Comparison page

    Given The user is on the home page
    When The user hover over to Category button
    Then The user clicks to "<category>" button
    When The user click Show button and choose 100
    Then The user should be able to click to "<product>" Product
    When The user should be able to click to "<product2>" Product
    And The user should be able to see "2" products next to the product comparison button

    Examples:
      | category        | product | product2 |
      | Health & Beauty | 5       | 9        |
      | Televisions     | 4       | 12       |

  @B7DGMRT-98
  Scenario Outline: Add products Product Compare Page separately and see success message

    Given The user is on the home page
    When The user hover over to Category button
    Then The user clicks to "<category>" button
    When The user click Show button and choose 100
    Then The user should be able to click to "<product>" Product
    And The user should be able to see success message and message should contain the name of the "<product>"

    Examples:
      | category        | product                    |
      | Televisions     | Cello C4020DVB 40\" LED-backlit LCD TV |
      | Networking      | Belkin Secure Flip KVM Switch          |
      | Health & Beauty | Capsule Plate 6pcs                     |
      | TV Accessories  | Belkin adapter cable                   |

  @B7DGMRT-99
  Scenario Outline: Add the compared products to the cart separately

    Given The user is on the home page
    When The user hover over to Category button
    Then The user clicks to "<category>" button
    When The user click Show button and choose 100
    Then The user should be able to click to "<product>" Product
    And The user should be able to see and click Compare this Product button
    Then The user should be able to click to "<product2>" Product
    And The user should be able to see and click Compare this Product button
    Then The user should be able to click to "<product3>" Product
    And The user should be able to see and click Compare this Product button
    When The user click the Product Compare button
    Then The user click the add to cart button for first Product
    And The user should be able to see add to cart success message
    Then The user click the add to cart button for second Product
    And The user should be able to see add to cart success message
    Then The user click the add to cart button for third Product
    And The user should be able to see add to cart success message


    Examples:
      | category        | product | product2 | product3 |
      | Health & Beauty | 5       | 4        | 1        |
      | Networking      | 1       | 8        | 11       |
      | Televisions     | 4       | 11       | 6        |


  @B7DGMRT-100
  Scenario Outline: Remove the compared products separately

    Given The user is on the home page
    When The user hover over to Category button
    Then The user clicks to "<category>" button
    When The user click Show button and choose 100
    Then The user should be able to click to "<product>" Product
    And The user should be able to see and click Compare this Product button
    Then The user should be able to click to "<product2>" Product
    And The user should be able to see and click Compare this Product button
    Then The user should be able to click to "<product3>" Product
    And The user should be able to see and click Compare this Product button
    When The user click the Product Compare button
    Then The user click the remove button for first Product
    And The user should be able to see remove success message
    Then The user click the remove button for second Product
    And The user should be able to see remove success message
    Then The user click the remove button for third Product
    And The user should be able to see remove success message


    Examples:
      | category        | product | product2 | product3 |
      | Health & Beauty | 5       | 4        | 1        |
      | Networking      | 1       | 8        | 11       |
      | Televisions     | 4       | 11       | 6        |
















