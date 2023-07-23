Feature:Product View Icon

  @test
  Scenario Outline : The user can change the product view in different subcategories
    Given The user is on the home page
    When The user hover over in category menu
    And The user clicks to "<subcategory>" button
    And The user clicks on the product view icon to switch to "<view_option>" view
    And The product view should be changed to "<view_option>" view
    Then The user verify that "<view_option>" products are displayed side by side

    Examples:
      | subcategory     | view_option |
      | Health & Beauty | grid-2      |
      | Health & Beauty | grid-3      |
      | Health & Beauty | grid-4      |
      | Health & Beauty | list        |
      | Televisions     | grid-2      |
      | Televisions     | grid-3      |
      | Televisions     | grid-4      |
      | Televisions     | list        |
      | TV Accessories  | grid-2      |
      | TV Accessories  | grid-3      |
      | TV Accessories  | grid-4      |
      | TV Accessories  | list        |
      | Networking      | grid-2      |
      | Networking      | grid-3      |
      | Networking      | grid-4      |
      | Networking      | list        |
