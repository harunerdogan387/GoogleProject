@smoke
Feature: Access to Gmail page
  Background:
    Given User access to google main page

  @us004
  Scenario: User access to Gmail page
    And User should bee see the Gmail link
    And User should be click the Gmail link
    Then User should be verify the Gmail page
