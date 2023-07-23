Feature:Product View Icon

  @test
  Scenario Outline : The user can change the product view in different subcategories
    Given The user is on home page
    When The user hover over to Category button
    And The user clicks to "<subcategory>" button
    When The user clicks on the product view icon to switch to "<view_option>" view
    And The product view should be changed to "<view_option>" view
    Then The user verify that "<view_option>" products are displayed side by side

    Examples:
      | subcategory     | view_option |
      | Health & Beauty | Two         |
      | Health & Beauty | Three       |
      | Health & Beauty | Four        |
      | Health & Beauty | List        |
      | Televisions     | Two         |
      | Televisions     | Three       |
      | Televisions     | Four        |
      | Televisions     | List        |
      | TV Accessories  | Two         |
      | TV Accessories  | Three       |
      | TV Accessories  | Four        |
      | TV Accessories  | List        |
      | Networking      | Two         |
      | Networking      | Three       |
      | Networking      | Four        |
      | Networking      | List        |
