@B7DGMRT-5

Feature: Search Icon Funcionality

  @B7DGMR-274
  Scenario: Search Icon Test
    * The user is on the home page
    * Click Search icon
    * Enter a valid search term "LCD TV"
    * Click Search text box search icon
    * Verify the result text including "LCD TV"

  @B7DGMR-275
  Scenario: Search Icon Test With Special
    * The user is on the home page
    * Click Search icon
    * Enter a valid search term "+"
    * Click Search text box search icon
    * Verify the result text including "+"

  @B7DGMR-276
  Scenario: Search Icon Test Case Sensitivity
    * The user is on the home page
    * Click Search icon
    * Enter a valid search term "lCd tV"
    * Click Search text box search icon
    * Verify the result text including "LCD TV"

  @B7DGMR-277
  Scenario: Search Icon Test With Space
    * The user is on the home page
    * Click Search icon
    * Enter a valid search term " PORT CONNECT  "
    * Click Search text box search icon
    * Verify the result text including "PORT CONNECT"

  @B7DGMR-278
  Scenario: Search Icon Is Visible
    * The user is on the home page
    * Verify that the search icon is visible

  @B7DGMR-279
  Scenario: Search Icon Test In Description
    * The user is on the home page
    * Click Search icon
    * Enter a valid search term "high speed"
    * Click Search text box search icon
    * Verify the result text including "HIGH SPEED"

  @B7DGMR-280
  Scenario: Search In Subcategory Test
    * The user is on the home page
    * Click Search icon
    * Click Search text box search icon
    * Enter a search term "shaver" and choose subcategory "Health & Beauty" then click black search button
    * Verify the result text including "SHAVER"

  @B7DGMR-281
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





