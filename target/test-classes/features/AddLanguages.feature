Feature: Adding Languages of employees

  Background:
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    When user enter valid employee id
    And user clicks on search button
    Then user see employee information is displayed
    When user clicks on the employee name
    Then user see the personal details of the employee
    When user clicks on qualification button
    And user clicks on languages add button

  @sprint3 @language
  Scenario: Adding different language details
    When user clicks and select language
    And user clicks and select fluency
    And user clicks and select competency
    And user enters comments
    And user clicks on language save button
    Then user sees the details of language added