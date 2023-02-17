Feature: Adding licences of qualifications

  Background:
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option


    @sprint3 @license
    Scenario: Adding different licenses
      And user enters valid ID
      And user clicks on search button
      Then user sees employee's name is displayed
      When user clicks on the employee's name
      And user sees the personal details of the employee
      When user clicks on Qualifications button
      And user clicks on Add button
      And user clicks and selects License type
      And user enters License Number
      And user clicks and selects Issued Date
      And user clicks and selects Expiry date
      Then user clicks on License Save button





