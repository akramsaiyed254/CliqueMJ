@test
Feature: Verify OTP page scenarios.

  Scenario Outline: User enter invalid OTP in sign up

    Given Otp screen should be displayed with title "<title>"
    And User enter otp "<digit1>" "<digit2>" "<digit3>" "<digit4>"
    Then user click on done button in keyboard
    Examples:
      | title | digit1 | digit2 | digit3 | digit4 |
      | Verification |    0      |    0    |    0    |    0    |

