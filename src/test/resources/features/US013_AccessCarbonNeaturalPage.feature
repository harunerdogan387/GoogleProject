@smoke
Feature: Access to Carbon Neutral page
  Background:
    Given User access to google main page

  @us0013
  Scenario: User access to Carbon Neutral since 2007 page
    And User should be see the Carbon Neutral link
    And User should be click the Carbon Neutral link
    Then User should be verify the Carbon Neutral page