Feature: Work Experience

  @sprint2 @Experience
  Scenario: Adding Employee Working Experience
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user enter valid employee id
    And user clicks on search button
    Then user clicks on View Employee information
    When user clicks on Qualifications
    And user click on Add Work Experience
    And user is adding Company name
    And job title
    And YYYY-mm-Date
    Then user clicks on Save


