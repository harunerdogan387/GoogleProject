@smoke
Feature: Access to Privacy page
  Background:
    Given User access to google main page

  @us011
  Scenario: User access to Google Privacy & Terms page
    And User should be see the Privacy link
    And User should be click the Privacy link
    Then User should be verify the Privacy & Terms page