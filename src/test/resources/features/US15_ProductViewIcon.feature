  @B7DGMRT-15
  Feature: Product View Icon

  Background:
    Given The user is on the home page
    And The user hover over in category menu

  Scenario Outline: The user can change the product view in different subcategories
    And The user clicks subcategory "<subMenuName>"
    And The user clicks on the product view icon to switch to "<viewOption>" view
    Then The user verifies that "<activeViewOption>" products are displayed as viewOption

    Examples:
      | subMenuName     | viewOption            | activeViewOption |
      | Health & Beauty | grid', 2, 'btn-grid-2 | btn-grid-2       |
      | Health & Beauty | grid', 3, 'btn-grid-3 | btn-grid-3       |
      | Health & Beauty | grid', 4, 'btn-grid-4 | btn-grid-4       |
      | Health & Beauty | list', 0, 'btn-list   | btn-list         |
      | Televisions     | grid', 2, 'btn-grid-2 | btn-grid-2       |
      | Televisions     | grid', 3, 'btn-grid-3 | btn-grid-3       |
      | Televisions     | grid', 4, 'btn-grid-4 | btn-grid-4       |
      | Televisions     | list', 0, 'btn-list   | btn-list         |
      | TV Accessories  | grid', 2, 'btn-grid-2 | btn-grid-2       |
      | TV Accessories  | grid', 3, 'btn-grid-3 | btn-grid-3       |
      | TV Accessories  | grid', 4, 'btn-grid-4 | btn-grid-4       |
      | TV Accessories  | list', 0, 'btn-list   | btn-list         |
      | Networking      | grid', 2, 'btn-grid-2 | btn-grid-2       |
      | Networking      | grid', 3, 'btn-grid-3 | btn-grid-3       |
      | Networking      | grid', 4, 'btn-grid-4 | btn-grid-4       |
      | Networking      | list', 0, 'btn-list   | btn-list         |
