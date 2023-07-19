Feature: Product Compare Function

  Scenario Outline: The user navigate the Product Compare Page

    @wip2
    Given The user is on the home page
    When The user hover over to Category button
    Then The user clicks to "<Category>" button
    When The user scroll to Products and hover over to "<Product>" Product
    Then The user should be able to see and click "Compare this Product" button
    And The user should be able to see success message

    Examples:
      |Category                    |Product      |
      |  Health & Beauty           |   2         |
      |                            |             |