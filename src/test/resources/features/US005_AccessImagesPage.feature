@smoke
Feature: Access to Images page
  Background:
    Given User access to google main page

  @us005
  Scenario: User access to Images page
    And User should bee see the Images link
    And User should be click the Images link
    Then User should be verify the Images page