Feature: To search for product on internet and buy it from vendor website


  @runSmoke
  Scenario Outline: Search for product on Google and buy it from amazon

    Given I am on google website
    And   I search for product as "<Product Name>"
    When  I select first result from vendor "<Vendor Site>"
    Then  I should be navigated to vendor's website as "<Vendor Site>"
    And   I should be able to fetch product details with filter criterion as "<Filter Criterion>" and Value as "<Filter Value>"

    Examples:
      |Product Name   |Vendor Name|Vendor Site      |Filter Criterion|Filter Value|
      |Cat Food       |amazon     |www.amazon.co.uk |Price           |200         |

