@test
Feature: Check Enable push notifications page scenarios

  #1st scenario
  Scenario Outline: Check when user click on Enable Push Notifications button.
    Given User has redirected to One More Thing page with title "<title1>"
    And There should be bell image
    And There should be enable push notifications page description "<description>"
    And There should be Enable Push Notifications button "<button1>"
    And There should be i'll do this later button "<button2>"
    Then Click on enable push notifications
    Examples:
      | title1 | description | button1 | button2 |
      | One more\nthing.. | To get discreet notifications\nfor deals, products and more,\nEnable Push Notifications. | Enable Push Notifications | l'll do this later |

#2nd scenario
#  Scenario Outline: Check when user click on I'll do this later button.
#    Given User has redirected to One More Thing page with title "<title1>"
#    And There should be bell image
#    And There should be enable push notifications page description "<description>"
#    And There should be Enable Push Notifications button "<button1>"
#    And There should be i'll do this later button "<button2>"
#    Then Click on l'll do this later button
#    Examples:
#      | title1 | description | button1 | button2 |
#      | One more\nthing.. | To get discreet notifications\nfor deals, products and more,\nEnable Push Notifications. | Enable Push Notifications | l'll do this later |


