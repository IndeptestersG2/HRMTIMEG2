Feature: EmployeeTimesheet

  Background:
    Given I am on the HRM application
    And I login

  Scenario: Verify that the EmployeeTimesheet features is navigating correctly

    Given I am on the HRM App
    When  I click on the Time section
    And   I click on the Timesheet sub-section
    And   I select the Employee Timesheets sub-section
    Then  I should be navigated to Select-Employee page
    When  I click on the Employee Name field
    And   I type Fiona Grace on the Emplyee name field
    And   I click the View Button
    Then  I should get an error message

