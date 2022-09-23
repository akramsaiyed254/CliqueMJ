@test
Feature: welcome page


  Scenario: Check splash screen
    Given when user start the application
    Then there should be cliqueMJ logo in splash screen


  Scenario Outline: Check Welcome page
    Given user is on welcome page
    And there should be cliqueMJ logo at top
    And  There should be welcome text "<title>"
    And there should be welcome description "<description>"
    Examples:
      |title | description |
      | Welcome! | Welcome aboard!\nWe're so happy you're here!\nClick the button below to get started |


  # when user click on get started button

  Scenario Outline: Click on get started button.
    Given user is on welcome page
    When User click on Get Started button
    Then User should be redirected to Shop Feature Brands intro page with title Shop Feature Brands "<title>"
    Examples:
      |title|
      |Shop\nFeatured\nBrands|

  #when user click on skip the introduction

#  Scenario Outline: Click on I'll do this later button.
#    Given user is on welcome page
#    When User click on Skip The Introduction button
#    Then User is redirected to One More Thing page with title "<title>"
#    Examples:
#      |title|
#      | One more\nthing.. |


