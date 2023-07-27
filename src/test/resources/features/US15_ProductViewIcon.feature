@B7DGMRT-15
Feature: Product View Icon

  Background:
    Given The user is on the home page
    And The user hover over in category menu

  @view1
  Scenario Outline: The user can change the product view in different subcategories
    And The user clicks subcategory "Health & Beauty"
    And The user clicks on the product view icon to switch to "<viewOption>" view
    Then The user verifies that "<activeViewOption>" products are displayed as viewOption

    Examples:
      | viewOption            | activeViewOption |
      | grid', 2, 'btn-grid-2 | btn-grid-2       |
      | grid', 3, 'btn-grid-3 | btn-grid-3       |
      | grid', 4, 'btn-grid-4 | btn-grid-4       |
      | list', 0, 'btn-list   | btn-list         |

  @view2
  Scenario Outline: The user can change the product view in different subcategories
    And The user clicks subcategory "Televisions"
    And The user clicks on the product view icon to switch to "<viewOption>" view
    Then The user verifies that "<activeViewOption>" products are displayed as viewOption

    Examples:
      | viewOption            | activeViewOption |
      | grid', 2, 'btn-grid-2 | btn-grid-2       |
      | grid', 3, 'btn-grid-3 | btn-grid-3       |
      | grid', 4, 'btn-grid-4 | btn-grid-4       |
      | list', 0, 'btn-list   | btn-list         |

  @view3
  Scenario Outline: The user can change the product view in different subcategories
    And The user clicks subcategory "TV Accessories"
    And The user clicks on the product view icon to switch to "<viewOption>" view
    Then The user verifies that "<activeViewOption>" products are displayed as viewOption

    Examples:
      | viewOption            | activeViewOption |
      | grid', 2, 'btn-grid-2 | btn-grid-2       |
      | grid', 3, 'btn-grid-3 | btn-grid-3       |
      | grid', 4, 'btn-grid-4 | btn-grid-4       |
      | list', 0, 'btn-list   | btn-list         |

  @view4
  Scenario Outline: The user can change the product view in different subcategories
    And The user clicks subcategory "Networking"
    And The user clicks on the product view icon to switch to "<viewOption>" view
    Then The user verifies that "<activeViewOption>" products are displayed as viewOption

    Examples:
      | viewOption            | activeViewOption |
      | grid', 2, 'btn-grid-2 | btn-grid-2       |
      | grid', 3, 'btn-grid-3 | btn-grid-3       |
      | grid', 4, 'btn-grid-4 | btn-grid-4       |
      | list', 0, 'btn-list   | btn-list         |