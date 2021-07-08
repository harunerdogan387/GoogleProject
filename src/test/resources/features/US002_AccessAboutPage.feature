@smoke
Feature: Access to About page
  Background:
    Given User access to google main page

  @us002
  Scenario: User access to About page
    And User access to About page
    And User should be click the About link
    Then User should be verify the About page