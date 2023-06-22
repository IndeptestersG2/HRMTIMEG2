Feature: MyTimesheet

  Background:
    Given I am on the HRM application
    And I login

  Scenario: Verify that MyTimesheet is clickable and navigates as expected

    When I click on the Time Menu
    Then I should see the Time/Timesheet page
    When I click on the Timesheet feature
    And I select the subsection of MyTimesheet
    Then I should see My Timesheet page
    When I select a Timesheet period on the calender
    And I click the submit button
    Then I should receive a pop-up message that Timesheet submitted

