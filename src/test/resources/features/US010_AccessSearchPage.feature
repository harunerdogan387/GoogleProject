@smoke
Feature: Access to Business page
  Background:
    Given User access to google main page

  @us010
  Scenario: User access to Google Search page
    And User should be see the How Search work link
    And User should be click the How Search work link
    Then User should be verify the Search page