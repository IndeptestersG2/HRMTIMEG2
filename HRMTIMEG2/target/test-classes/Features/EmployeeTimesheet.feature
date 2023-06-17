Feature: EmployeeTimesheet

  Background:
    Given I am on the HRM application
    And I login

  Scenario: Verify that the EmployeeTimesheet features is navigating correctly

    //Given I am on the HRM App
    When  I click on the Time section
    And   I click on the Timesheet sub-section
    And   I select the Employee Timesheets sub-section
    Then  I should be navigated to Select-Employee page
    When  I click on the Employee Name field
    And   I click the View Button
    Then  I should get an error message
    When  I click on the view button for Paul Collings
    Then  I should get to Paul Collings timesheet page
    And   I click on timesheet period toggle button backward and forward
    When  I click on the Edit button for Paul Collings timesheet page
    And   I click on the delete icon button to delete a timesheet role
    When  I Click on the cancel button
    Then  I should be take to my timesheet page
    And   I click Edit button again
    And   I click on the Reset button
    Then  I should be navigated to the Edit page with the restored deleted timesheet role
    And   I click on the Save button
    Then  I should be navigated to My time sheet page



