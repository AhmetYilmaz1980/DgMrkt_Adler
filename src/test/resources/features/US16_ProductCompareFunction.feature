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

  @wip2
    Scenario Outline: The Products they want to compare on the Product Comparison page

      Given The user is on the home page
      When The user hover over to Category button
      Then The user clicks to "<category>" button
      When The user click Show button and choose 100
      When The user should be able to hover over to "<product>" Product
      Then The user should be able to see and click Compare this Product button
      When The user click the Product Compare button
      Then The user should be able to see the "<product>" they want to compare on the Product Comparison page

    Examples:
      | category        | product |
      | Health & Beauty | 5       |




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
      | Health & Beauty | 3    | 1       |
      | Televisions     | 4    | 11      |
      | Televisions     | 1    | 3       |
      | Televisions     | 3    | 8       |
      | Televisions     | 5    | 6       |
      | TV Accessories  | 7    | 10      |
      | TV Accessories  | 1    | 7       |
      | TV Accessories  | 9    | 2       |
      | TV Accessories  | 6    | 4       |
      | TV Accessories  | 8    | 9       |
      | Networking      | 1    | 1       |
      | Networking      | 5    | 4       |
      | Networking      | 8    | 2       |
      | Networking      | 3    | 12      |
      | Networking      | 6    | 7       |
      | Networking      | 2    | 3       |
      | Networking      | 7    | 8       |
      | Networking      | 4    | 9       |

