@smoke
Feature: Access to Sign in page
  Background:
    Given User access to google main page

  @us007
  Scenario: User access to Sign in page
    And User should be see the Sign in button
    And User should be click the Sign in Button
    Then User should be verify the Sign in page