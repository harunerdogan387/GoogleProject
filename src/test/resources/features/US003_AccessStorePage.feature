@smoke
Feature: Access to Store page
  Background:
    Given User access to google main page

  @us003
  Scenario: User access to Store page
    And User access to Store page
    And User should be click the Store link
    Then User should be verify the Store page