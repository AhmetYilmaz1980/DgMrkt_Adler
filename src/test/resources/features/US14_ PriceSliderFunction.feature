Feature: As a user, I should be able to bring the products in the price range
  I want on the Sub-Category Page by using the PRICE slider.



  Scenario Outline: The user can scroll the price slider.
    Given The user is on the home page
    When The user hover over category and select "<subcategory>".
    Then The user sees price slider.
    When  The user slides the left end of the price slider to the right.
    Then The user sees that the min value of the price slider has increased.
    When  The user slides the left end of the price slider to the left.
    Then The user sees that the min value of the price slider has decreased.
    When  The user slides the right end of the price slider to the left.
    Then The user sees that the max value of the price slider has decreased.
    When  The user slides the right end of the price slider to the right.
    Then The user sees that the max value of the price slider has increased.
    Examples:
      | subcategory     |
      | Health & Beauty |
     # | Televisions     |
     # | TV Accessories  |
     # | Networking      |

  @slider
  Scenario Outline:  The user can scroll the price slider to set a specific price range
    Given The user is on the home page
    When The user hover over category and select "<subcategory>".
    And The user scrolls the price slider to a specific price range <min> and <max>
    Then The products displayed should be within the selected price range
    Examples:
      | subcategory     | min | max |
      | Health & Beauty | 150 | 450 |
