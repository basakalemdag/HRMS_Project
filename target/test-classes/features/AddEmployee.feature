Feature: Adding the Employee

  Background:
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add Employee button


  @sprint1 @addEmp
  Scenario: Adding one employee using feature file
    And user enter "Terminate" and "ID" and "G12"
    And user clicks on save button
    Then employee added successfully


    @DB
    Scenario: Adding employee and verifying it is stored in database
      And user enter "Mansoor" and "Raufi"
      And user captures employee id
      And user clicks on save button
      Then employee added successfully
      And added employee is displayed in database
