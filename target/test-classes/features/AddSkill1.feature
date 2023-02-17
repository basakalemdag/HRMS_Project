Feature: Adding Skills from Admin
  Background:
    When user enters valid username and valid password
    And user clicks on login button

  @sprint2 @skill
  Scenario: Add skills in qualifications
    When user click on Admin and select Skill from qualifications
    And user clicks on add and enter credentials
      |name|Description|
      |Batch14 MS G12|mentioned employee is very good at java|
    Then user should be able to add new skills

