Feature: Time Menu

  Background:
    Given I am on the HRM application
    And I login

  Scenario: Verify that Time Menu is Active and navigates correctly

    Given I click on the Time Menu
    Then  I should see the Time/Timesheet page
