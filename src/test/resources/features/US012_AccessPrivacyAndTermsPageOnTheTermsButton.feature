@smoke
Feature: Access to Terms page
  Background:
    Given User access to google main page

  @us012
  Scenario: User access to Google Privacy & Terms page
    And User should be see the Terms link
    And User should be click the Terms link
    Then User should be verify the Privacy & Terms page