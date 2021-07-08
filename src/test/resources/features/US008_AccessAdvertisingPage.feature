@smoke
Feature: Access to Advertising page
  Background:
    Given User access to google main page

  @us008
  Scenario: User access to Google Ads page
    And User should be see the Advertising link
    And User should be click the Advertising link
    Then User should be verify the Advertising page