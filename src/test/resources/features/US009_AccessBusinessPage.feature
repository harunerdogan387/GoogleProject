@smoke
Feature: Access to Business page
  Background:
    Given User access to google main page

  @us009
  Scenario: User access to Google for Small Business page
    And User should be see the Business link
    And User should be click the Business link
    Then User should be verify the Business page