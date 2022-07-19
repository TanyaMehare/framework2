#Parameterization and data driven
Feature: feature to test login functionality with parameters

  Scenario Outline: Check login is succesfull with valid credentials
    Given User is on login page
    When User enters<username> and <password>
    And Clicks on login page
    Then User is navigated to the home page and enter <country>

    Examples: 
      | username | password | country |
      | Tanya    |    12345 | India   |
      | mark     |    12345 | Russia  |
