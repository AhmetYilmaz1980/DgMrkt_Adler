Feature: Search Icon Funcionality

  @searchicon
  Scenario: Search Icon Test
    * The user is on the home page
    * Click Search icon
    * Enter a valid search term "LCD TV"
    * Click Search text box search icon
    * Verify the result text including "LCD TV"

  Scenario: Search Icon Test With Special
    * The user is on the home page
    * Click Search icon
    * Enter a valid search term "+"
    * Click Search text box search icon
    * Verify the result text including "+"

  Scenario: Search Icon Test Case Sensitivity
    * The user is on the home page
    * Click Search icon
    * Enter a valid search term "lCd tV"
    * Click Search text box search icon
    * Verify the result text including "LCD TV"

  Scenario: Search Icon Test With Space
    * The user is on the home page
    * Click Search icon
    * Enter a valid search term " PORT CONNECT  "
    * Click Search text box search icon
    * Verify the result text including "PORT CONNECT"

  Scenario: Search Icon Is Visible
    * The user is on the home page
    * Verify that the search icon is visible

  Scenario: Search Icon Test In Description
    * The user is on the home page
    * Click Search icon
    * Enter a valid search term "high speed"
    * Click Search text box search icon
    * Verify the result text including "HIGH SPEED"

  Scenario: Search In Subcategory Test
    * The user is on the home page
    * Click Search icon
    * Click Search text box search icon
    * Enter a search term "shaver" and choose subcategory "Health & Beauty" then click black search button
    * Verify the result text including "SHAVER"

  Scenario: Search Term In Different Subcategories
    * The user is on the home page
    * Click Search icon
    * Click Search text box search icon
    * Enter a search term "hdmi" and choose subcategory "All Categories" then click black search button
    * Get search result as a list1
    * The user is on the home page
    #* Click Home Page Button
    * Click Search icon
    * Click Search text box search icon
    * Enter a search term "hdmi" and choose subcategory "Networking" then click black search button
    * Get search result as a list2
    * Verify that the results are different






