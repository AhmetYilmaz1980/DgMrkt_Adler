Feature:Product View Icon

  @view
  Scenario Outline: The user can change the product view in different subcategories
    Given The user is on the home page
    When The user hover over in category menu
    And The user clicks subcategory "<subMenuName>"
    And The user cliks on the product view icon to switch to "<viewOption>" view
    And The product should be changed to "<viewOption>" view
    Then The user verifies that "<viewOption>" products are displayed side by side
    Examples:
      | subMenuName     | viewOption            |
      | Health & Beauty | grid', 2, 'btn-grid-2 |
      | Health & Beauty | grid', 3, 'btn-grid-3 |
      | Health & Beauty | grid', 4, 'btn-grid-4 |
      | Health & Beauty | list', 0, 'btn-list   |
      | Televisions     | grid', 2, 'btn-grid-2 |
      | Televisions     | grid', 3, 'btn-grid-3 |
      | Televisions     | grid', 4, 'btn-grid-4 |
      | Televisions     | list', 0, 'btn-list   |
      | TV Accessories  | grid', 2, 'btn-grid-2 |
      | TV Accessories  | grid', 3, 'btn-grid-3 |
      | TV Accessories  | grid', 4, 'btn-grid-4 |
      | TV Accessories  | list', 0, 'btn-list   |
      | Networking      | grid', 2, 'btn-grid-2 |
      | Networking      | grid', 3, 'btn-grid-3 |
      | Networking      | grid', 4, 'btn-grid-4 |
      | Networking      | list', 0, 'btn-list   |
