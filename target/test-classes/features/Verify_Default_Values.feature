Feature: To verify default screen /home screen for weather forecast report application.


  @runSmoke
  Scenario Outline: Verify headline and number of columns

    Given I have entered the city as "<City>" to know weather forecast report
    When  I see weather forecast report
    Then  I should be able to see headline with city name as "<City>"

    Examples:
    |City   |
    |Glasgow |


  @runRegression
  Scenario Outline: Verify dates and day

    Given I have entered the city as "<City>" to know weather forecast report
    When  I see weather forecast report
    Then  I should be able to see five dates starting from current date
    And   Each date should be mapped with correct day

    Examples:
      |City   |
      |Glasgow |





