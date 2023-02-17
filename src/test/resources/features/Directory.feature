Feature: Directory view

  @sprint1 @directory
  Scenario: Viewing employees under directory
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on Directory option
    Then user see number of employees displayed