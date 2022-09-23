@test
Feature: Verify dashboard scenarios

  Scenario Outline: Verify Dashboard is displayed when user sign up

    Given user click on done button in keyboard
    Then Dashboard should be displayed with "<title>" when user sign up
    Examples:
      | title |
      | CashBack Balance |
