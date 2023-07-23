Feature: Cat-Subcategory Sort By Function


  @cat
  Scenario Outline:Selecting subcategories from the category menu
    Given The user is on the home page
    When The user hover over in category menu
    Then The user clicks subcategory "<subMenuName>"
    And The user should be able to see sort by in  on the subCategory page "<sortBy>"
    And The user must have selected "<sortbyverify>"
    Examples:
      | subMenuName     | sortBy             | sortbyverify       |
      | Health & Beauty | Default            | Default            |
      | Health & Beauty | Name (A - Z)       | Name (A - Z)       |
      | Health & Beauty | Name (Z - A)       | Name (A - Z)       |
      | Health & Beauty | Price (Low > High) | Price (Low > High) |
      | Health & Beauty | Price (High > Low) | Price (High > Low) |
      | Health & Beauty | Rating (Highest)   | Rating (Highest)   |
      | Health & Beauty | Rating (Lowest)    | Rating (Lowest)    |
      | Health & Beauty | Model (A - Z)      | Model (A - Z)      |
      | Health & Beauty | Model (Z - A)      | Model (Z - A)      |
      | Televisions     | Default            | Default            |
      | Televisions     | Name (A - Z)       | Name (A - Z)       |
      | Televisions     | Name (Z - A)       | Name (A - Z)       |
      | Televisions     | Price (Low > High) | Price (Low > High) |
      | Televisions     | Price (High > Low) | Price (High > Low) |
      | Televisions     | Rating (Highest)   | Rating (Highest)   |
      | Televisions     | Rating (Lowest)    | Rating (Lowest)    |
      | Televisions     | Model (A - Z)      | Model (A - Z)      |
      | Televisions     | Model (Z - A)      | Model (Z - A)      |
      | TV Accessories  | Default            | Default            |
      | TV Accessories  | Name (A - Z)       | Name (A - Z)       |
      | TV Accessories  | Name (Z - A)       | Name (A - Z)       |
      | TV Accessories  | Price (Low > High) | Price (Low > High) |
      | TV Accessories  | Price (High > Low) | Price (High > Low) |
      | TV Accessories  | Rating (Highest)   | Rating (Highest)   |
      | TV Accessories  | Rating (Lowest)    | Rating (Lowest)    |
      | TV Accessories  | Model (A - Z)      | Model (A - Z)      |
      | TV Accessories  | Model (Z - A)      | Model (Z - A)      |
      | Networking      | Default            | Default            |
      | Networking      | Name (A - Z)       | Name (A - Z)       |
      | Networking      | Name (Z - A)       | Name (A - Z)       |
      | Networking      | Price (Low > High) | Price (Low > High) |
      | Networking      | Price (High > Low) | Price (High > Low) |
      | Networking      | Rating (Highest)   | Rating (Highest)   |
      | Networking      | Rating (Lowest)    | Rating (Lowest)    |
      | Networking      | Model (A - Z)      | Model (A - Z)      |
      | Networking      | Model (Z - A)      | Model (Z - A)      |

