Feature: As a user, I should be able to bring the products in the price range
  I want on the Sub-Category Page by using the PRICE slider.

  Background:
    Given The user is on the home page
    When The user hover over in category menu


  Scenario Outline: The user can scroll the price slider.
    And The user clicks subcategory "Health & Beauty"
    Then The user sees price slider.
    When  The user slides the "<priceSlider>" to the "<direction>".
    Then The user sees that the value of the "<priceSlider>" changes in proportion to the slider movement "<direction>".

    Examples:
      | priceSlider | direction |
      | sliderLeft  | right     |
      | sliderLeft  | left      |
      | sliderRight | left      |
      | sliderRight | right     |

  Scenario Outline: The user can scroll the price slider.
    And The user clicks subcategory "Televisions"
    Then The user sees price slider.
    When  The user slides the "<priceSlider>" to the "<direction>".
    Then The user sees that the value of the "<priceSlider>" changes in proportion to the slider movement "<direction>".

    Examples:
      | priceSlider | direction |
      | sliderLeft  | right     |
      | sliderLeft  | left      |
      | sliderRight | left      |
      | sliderRight | right     |

  Scenario Outline: The user can scroll the price slider.
    And The user clicks subcategory "TV Accessories"
    Then The user sees price slider.
    When  The user slides the "<priceSlider>" to the "<direction>".
    Then The user sees that the value of the "<priceSlider>" changes in proportion to the slider movement "<direction>".

    Examples:
      | priceSlider | direction |
      | sliderLeft  | right     |
      | sliderLeft  | left      |
      | sliderRight | left      |
      | sliderRight | right     |

  Scenario Outline: The user can scroll the price slider.
    And The user clicks subcategory "Networking"
    Then The user sees price slider.
    When  The user slides the "<priceSlider>" to the "<direction>".
    Then The user sees that the value of the "<priceSlider>" changes in proportion to the slider movement "<direction>".

    Examples:
      | priceSlider | direction |
      | sliderLeft  | right     |
      | sliderLeft  | left      |
      | sliderRight | left      |
      | sliderRight | right     |



