Feature: Current Job Details

@sprint2 @currentjob
Scenario: Adding employee's current job details
  When user enters valid username and valid password
  And user clicks on login button
  Then user is successfully logged in
  When user clicks on PIM option
  And user enter valid employee id
  And user clicks on search button
  And user clicks on displayed information
  Then user sees employee details
  When user clicks on Job
  And user clicks on Edit button
  And user selects Job Title
  And user selects Employment Status
  And user selects Job Category
  And user picks Joined Date from calendar
  And user selects Job Unit
  And user selects Location
  And user picks contract Start Date from calendar
  And user picks contract End Date from calendar
  And user uploads file up to 1MB for Contract Details
  And user clicks on Save button
  Then user successfully updated employee's current job details



