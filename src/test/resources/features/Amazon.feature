Feature: To verify basic functionality of amazon

  Background:
    Given I am on amazon website
    When I have searched for iPhone 7

    @runSmoke
    Scenario: Verify Price Displayed
    Then I can see price for first five items

    @runSmoke
    Scenario Outline: Verify sorting result list

      And I sort list based on "<Sorting Criterion>"
      Then list should be sorted based on "<Sorting Criterion>"

      Examples:
      |Sorting Criterion |
      |Price: Low to High|


    @runSmoke
    Scenario: Add cheapest product in basket

      And I add cheapest item in basket
      Then Item should be added to basket properly