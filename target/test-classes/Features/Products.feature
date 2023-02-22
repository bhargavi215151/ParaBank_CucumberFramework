Feature: Test the functionality of products page

  Scenario: Verify clicking of products page
    Given User launches the application
    When user clicks on products option
    Then user is directed to Products page

  Scenario: Verify the presence of Parasoft logo in products page
    Given User launches the application
    When user clicks on products option
    And User is able to view parasoft logo
    Then Presence of logo is confirmed

  Scenario: Verify the clicking of search field in products page
    Given User launches the application
    When user clicks on products option
    And User views and clicks on search field
    Then Search button is clickable

  Scenario: Verify data entry in search field of products page
    Given User launches the application
    When user clicks on products option
    And User views and clicks on search field
    And user enters text into the search box and clicks enter
    Then search field is valid

  Scenario: Verify dropdown of Solutions in products page
    Given User launches the application
    When user clicks on products option
    And clicks on solution
    And selects a drop down option
    Then dropdown is working fine

  Scenario: Verify selecting the language in Products page
    Given User launches the application
    When user clicks on products option
    And user clicks on Language dropdown
    And user selects on English language
    Then the language of page is changed to english
