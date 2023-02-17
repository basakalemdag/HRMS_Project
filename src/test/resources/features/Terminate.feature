Feature: Terminate

  @sprint2 @terminate
  Scenario: Terminating an employee
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user enter valid terminating employee id
    And user clicks on search button
    And user clicks on new displayed information
    Then user sees employee details
    When user clicks on Job
    And user clicks on Terminate Employment
    And user selects a Reason
    And user picks a date from the calendar
    And user adds a note in the textbox
    And user clicks on Confirm button
    Then the employee is terminated




