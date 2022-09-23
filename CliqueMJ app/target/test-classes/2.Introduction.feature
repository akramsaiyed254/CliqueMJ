
Feature: Introduction pages



  Scenario Outline: Check First introduction page.
    Given User should be redirected to Shop Feature Brands intro page with title Shop Feature Brands "<title>"
    And there should be Shop Featured Brands image
    And there should be page description "<description1>"
    And User click on continue button
    Then User is redirected to Scan you receipt page with title "<title2>"
    Examples:
      | title | description1| title2|
      |Shop\nFeatured\nBrands | Earn cash back every time you purchase\nfrom your favorite brands! | Scan your\nReceipt |

  Scenario Outline: Check Second introduction page.
    Given User is redirected to Scan you receipt page with title "<title>"
    And there should be Scan Your Receipt image
    And there should be second page description "<description2>"
    And User click on continue button
    Then User is redirected to Redeem your cash page with title "<title2>"
    Examples:
      | title | description2 | title2 |
      | Scan your\nReceipt | Snap your receipts and\nturn them into cash! | Redeem\nyour Cash |

  Scenario Outline: Check Third introduction page.
    Given User is redirected to Redeem your cash page with title "<title>"
    And there should be Redeem Your Cash image
    And there should be third page description "<description2>"
    And User click on Start now button
    Then User is redirected to One More Thing page with title "<title2>"
    Examples:
      | title | description2 | title2 |
      | Redeem\nyour Cash | Transfer the cash you\nearn directly to your\nbank account! | One more\nthing.. |

























#    Scenario:  To verify Signup Page with valid details
#      Given I am on Signup Page
#      And I enter valid "<fullname>"
#      And I enter valid
#      And I click signup button
#      Then I should redirect to HomePage




















