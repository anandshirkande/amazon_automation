Feature: To verify basic functionality of amazon

  Background:
    Given I am on amazon website
    When I have searched for iPhone 7

    @runSmoke
    Scenario Outline: Verify sorting result list

      And I sort list based on "<Sorting Criterion>"
      Then list should be sorted based on "<Sorting Criterion>"

      Examples:
      |Sorting Criterion |
      |Price: Low to High|
