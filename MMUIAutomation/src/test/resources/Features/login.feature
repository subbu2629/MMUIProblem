Feature: Mass Mutual Round2 Test
 
  Scenario: UI Automation using Java
    Given User logs into the portal
    When user verifies all the details
    Then the value count should be 5
    Then all the values on the screen should be greater than zero
    Then values should be formatted as currencies
    Then the total balance should be correct based on the listed values
    
    