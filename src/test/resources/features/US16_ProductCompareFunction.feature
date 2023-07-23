Feature: Product Compare Function


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


    Scenario Outline: The Products they want to compare on the Product Comparison page

      Given The user is on the home page
      When The user hover over to Category button
      Then The user clicks to "<category>" button
      When The user click Show button and choose 100
      Then The user should be able to hover over to "<product>" Product
      And The user should be able to see and click Compare this Product button
      When The user click the Product Compare button
      Then The user should be able to see the "<product>" they want to compare on the Product Comparison page

    Examples:
      | category        | product |
      | Health & Beauty | 5      |




  Scenario Outline: Add products Product Compare Page separately

    Given The user is on the home page
    When The user hover over to Category button
    Then The user clicks to "<category>" button
    When The user should be able to choose "<page>" and hover over to "<product>" Product
    Then The user should be able to see and click Compare this Product button
    And The user should be able to see success message

    Examples:
      | category        | page | product |
      | Health & Beauty | 2    | 5       |
      | Televisions     | 4    | 11      |
      | TV Accessories  | 7    | 10      |
      | Networking      | 1    | 1       |


    Scenario Outline: Add the compared products to the cart separately

      Given The user is on the home page
      When The user hover over to Category button
      Then The user clicks to "<category>" button
      When The user click Show button and choose 100
      Then The user should be able to hover over to "<product>" Product
      And The user should be able to see and click Compare this Product button
      Then The user should be able to hover over to "<product2>" Product
      And The user should be able to see and click Compare this Product button
      Then The user should be able to hover over to "<product3>" Product
      And The user should be able to see and click Compare this Product button
      When The user click the Product Compare button
      Then The user click the "add to cart" button for first Product


      Examples:
        | category        | product |product2 | product3|
        | Health & Beauty | 5       |      4    |   1      |



  @wip2
  Scenario Outline: The Products they want to compare on the Product Comparison page

    Given The user is on the home page
    When The user hover over to Category button
    Then The user clicks to "<category>" button
    When The user click Show button and choose 100
    Then The user should be able to hover over to "<product>" Product
    And The user should be able to see and click Compare this Product button

    Examples:
      | category        | product |
      | Health & Beauty | 21     |









