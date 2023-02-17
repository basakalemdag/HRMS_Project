Feature: Adding skills
  Background:
    When user enters valid username and valid password
    And user clicks on login button

  @sprint2 @skill
    Scenario: Adding employee Skills
    When user clicks on PIM and search the employee from Employee List
    And user click on Searched Employee and select Qualifications
    And user should see skills dropdowns, experience textbox and commment box displayed
    Then user can add employee's skills
