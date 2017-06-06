Feature: To verify base functionality on Valtech site


  @runSmoke
  Scenario Outline: Validate H1 tags

    Given I am on Valtech website
    And I can see Latest News section
    When  I navigate to "<Module>" page via top navigation menu
    Then  I should be able to see "<Module>" page

    Examples:
      |Module   |
      |About    |
      |Services |
      |Work     |

  @runSmoke
  Scenario: Verify contact page info

    Given I am on Valtech website
    When I navigate to contacts page
    Then I should see all offices over the world


