Feature: Adding Memberships of employees

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
    When user clicks on memberships button
    And user clicks on membership add button

  @sprint3 @membership
  Scenario: Adding different memberships
    And user clicks and select membership type
    And user clicks on membership save button
    Then user sees the details of membership added

  @sprint3 @membership
  Scenario: Adding details of membership
    When user clicks and select membership type
    And user clicks and select subscription paid by
    And user enters subscription amount
    And user clicks and select currency
    And user selects commence date
    And user selects renewal date
    And user clicks on membership save button
    Then user sees the details of membership added