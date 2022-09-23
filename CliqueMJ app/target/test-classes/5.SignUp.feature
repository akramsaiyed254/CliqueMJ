@test
Feature: Check Sign Up page scenarios

  Scenario Outline: Check mandatory fields validation.
    Given User should be on Sign Up page "<title4>"
    And User click on Sign Up button
    #And User click on While Using The App
    Then Validation message should be "<message>"
    Examples:
      | title4 | message |
    | Sign Up | All fields are mandatory |

    Scenario Outline: To verify Sign Up with valid details.
      When User enter enter Full Name "<name>"
      And User click on Sign Up button
      And User click on country code drop-down
      And User enter Country Code "<code>"
      And User select country from the list
      #And User click on Sign Up button
      And User enter Phone Number "<phone>"
      And User click on Sign Up button
      And User enter Password "<password>"
      And User click on Sign Up button
      And User enter Confirm Password "<cpassword>"
      And User click on Sign Up button
      And User check the terms and conditions checkbox
      And User click on Sign Up button
      Then Otp screen should be displayed with title "<title>"
      Examples:
        | name | code | phone | password | cpassword | title |
        | Akram SaiYeD | 91 | 7020829599 | Admin@123 | Admin@123 | Verification |













