@smoke
Feature: Access to Google Apps page
  Background:
    Given User access to google main page

  @us006
  Scenario: User access to Google apps on the main page
    And User should bee see the Google apps link
    And User should be click the Google apps link
    Then User should be verify the Google apps