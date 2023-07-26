Feature: As a user, I should be able to bring the products in the price range
  I want on the Sub-Category Page by using the PRICE slider.

  @B7DGMRT-32
  Scenario Outline: The user can scroll the price slider.
    Given The user is on the home page
    When The user hover over in category menu
    And The user clicks subcategory "<subMenuName>"
   # When The user hover over category and select "<subcategory>".
    Then The user sees price slider.
    When  The user slides the "<priceSlider>" to the "<direction>".
    Then The user sees that the value of the "<priceSlider>" changes in proportion to the slider movement "<direction>".

    Examples:
      | subMenuName     | priceSlider | direction |
      | Health & Beauty | sliderLeft  | right     |
      | Health & Beauty | sliderLeft  | left      |
      | Health & Beauty | sliderRight | left      |
      | Health & Beauty | sliderRight | right     |
      | Televisions     | sliderLeft  | right     |
      | Televisions     | sliderLeft  | left      |
      | Televisions     | sliderRight | left      |
      | Televisions     | sliderRight | right     |
      | TV Accessories  | sliderLeft  | right     |
      | TV Accessories  | sliderLeft  | left      |
      | TV Accessories  | sliderRight | left      |
      | TV Accessories  | sliderRight | right     |
      | Networking      | sliderLeft  | right     |
      | Networking      | sliderLeft  | left      |
      | Networking      | sliderRight | left      |
      | Networking      | sliderRight | right     |



