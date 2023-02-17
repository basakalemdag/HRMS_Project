Feature: Adding the Employee dependants
  @sprint2 @dependents
  Scenario: Adding depandents for one employee using feature file
   # Given user is navigated to HRMS application
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    Then user is able to see the employee list displayed
    When user clicks on any enlisted employee
    Then user successfully navigates to the empoloyee Personal Details page
    When user clicks on dependents option
    Then user successfully navigates into Assign Dependents page
    When user click on add button
    And user is able to enter data into the name field
    And user is able to select an option from relationship dropdown
    And user is able to select day, month and year from the date of birth field
    Then user can save changes by clicking on save button


