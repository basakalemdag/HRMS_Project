Feature: Adding Contact Details

    Background:
        When user enters valid username and valid password
        And user clicks on login button
        Then user is successfully logged in
        When user clicks on PIM option
        And user enter valid employee id
        And user clicks on search button
        When user see employee information is displayed
        When user clicks on the employee name

    @sprint2 @contactDetails
    Scenario: Changing Employee contact details
        When user clicks on contact details
        Then user clicks on edit option
        And user enters employee address1 and address2
        And users enters city,state,zip and country
        And user enters homeNum, mobile, and workNumber
        And user enters workEmail and personalEmail
        Then user clicks on save button and changed the data successfully
