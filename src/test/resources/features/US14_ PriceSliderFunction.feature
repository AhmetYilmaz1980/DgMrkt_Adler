Feature: As a user, I should be able to bring the products in the price range
  I want on the Sub-Category Page by using the PRICE slider.

  Background:
    Given The user is on the home page
    When The user hover over in category menu

  @B7DGMRT-32
  Scenario Outline: The user can scroll the price slider in "Health & Beauty".
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

  @B7DGMRT-71
  Scenario Outline: The user can scroll the price slider in"Televisions" .
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

  @B7DGMRT-72
  Scenario Outline: The user can scroll the price slider in "TV Accessories".
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

  @B7DGMRT-73
  Scenario Outline: The user can scroll the price slider in "Networking".
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

    # For loop ile
  @B7DGMRT-80
  Scenario Outline:  The user can scroll the price slider to set a specific price range in "Health & Beauty"
    And The user clicks subcategory "Health & Beauty"
    And The user scrolls the price slider to a specific price range <minValue> and <maxValue>
    Then Verify that the specified price range <minValue> and <maxValue> is visible.
    And Verify that the displayed products are within the selected price range.
    Examples:
      | minValue | maxValue |
      | 107      | 480      |
      | 102      | 475      |
      | 112      | 485      |

  @B7DGMRT-81
  Scenario Outline:  The user can scroll the price slider to set a specific price range in "Televisions"
    And The user clicks subcategory "Televisions"
    And The user scrolls the price slider to a specific price range <minValue> and <maxValue>
    Then Verify that the specified price range <minValue> and <maxValue> is visible.
    And Verify that the displayed products are within the selected price range.
    Examples:
      | minValue | maxValue |
      | 108      | 485      |
      | 108      | 485      |
      | 108      | 485      |

  @B7DGMRT-82
  Scenario Outline:  The user can scroll the price slider to set a specific price range in "TV Accessories"
    And The user clicks subcategory "TV Accessories"
    And The user scrolls the price slider to a specific price range <minValue> and <maxValue>
    Then Verify that the specified price range <minValue> and <maxValue> is visible.
    And Verify that the displayed products are within the selected price range.
    Examples:
      | minValue | maxValue |
      | 109      | 493      |
      | 109      | 493      |
      | 109      | 493      |

  @B7DGMRT-84
  Scenario Outline:  The user can scroll the price slider to set a specific price range in "Networking"
    And The user clicks subcategory "Networking"
    And The user scrolls the price slider to a specific price range <minValue> and <maxValue>
    Then Verify that the specified price range <minValue> and <maxValue> is visible.
    And Verify that the displayed products are within the selected price range.
    Examples:
      | minValue | maxValue |
      | 110      | 494      |
      | 110      | 494      |
      | 110      | 494      |

