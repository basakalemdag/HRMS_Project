Feature: Login functionality

  @sprint1 @valid
  Scenario: Valid admin login
    #Given user is navigated to HRMS application
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in


  @sprint1 @invalid
  Scenario Outline: Invalid login functionality
    When user enters different "<username>" and "<password>" and verify the "<error>" for it
    Examples:
      | username | password | error |
      |admin     |password1  |Invalid credentials|
      |admin1234 |Hum@nhrm123|Invalid credentials|
      |          |Hum@nhrm123|Username cannot be empty|
      |admin     |           |Password cannot be empty|