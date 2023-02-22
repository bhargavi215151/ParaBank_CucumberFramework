Feature: Test the functionality of Home page

  Scenario: Verify clicking of Home page
    Given User launches the application
    When user clicks on Home page option
    Then user is directed to Home  page

  Scenario: Verify the contents of ATM services
    Given User launches the application
    When user clicks on Home page option
    Then user is directed to Home  page
    When user is able to view ATM services
    And User is able to view   Withdrawal funds, Transfer funds, check balances, make deposits  of Online services
    Then All the contents of ATM services are present

  Scenario: Verify the contents of Online services
    Given User launches the application
    When user clicks on Home page option
    Then user is directed to Home page
    When user is able to view  Online services
    And User is able to view  Bill pay,Account History,Transfer funds of Online services
    Then All the contents of Online services are present

  Scenario: Verify the presence of Latest news image in Home page
    Given User launches the application
    When user clicks on Home page option
    Then user is directed to Home  page
    When User is able to view Latest News image
    Then The presence of Latest news image is guaranteed
    
    
