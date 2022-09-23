@test
Feature: Are you 21 or Older(terms) page scenarios

  Scenario Outline: When user click on I Agree button.

    Given User is on 21 or older page with title "<title>"
    And There should be first description "<description1>"
    And user click on Terms of Use
    And title should be Terms & conditions "<title2>"
    And User click on Back button
    And User click on Privacy Policy "<link2>"
    And title should be Privacy Policy "<title3>"
    And User click on Back button.
    And User click on I Agree button
    Then User should be on Sign Up page "<title4>"
    Examples:
      | title | description1 | title2 | link2 | title3 | title4 |
      | Are you\n21 or older? | CliqueMJ requires that you meet the legal\nage requirements of your area to view\ncannabis information | Terms & Conditions | Privacy Policy. | Privacy Policy. | Sign Up |
