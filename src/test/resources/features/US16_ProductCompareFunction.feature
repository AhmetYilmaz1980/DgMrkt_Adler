Feature: Product Compare Function

  @wip2
  Scenario Outline: The user navigate the Product Compare Page

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
