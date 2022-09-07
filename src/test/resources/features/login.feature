Feature: Login
  i as services user i need to automate login for access the services

  @Register
  Scenario:Register successful
    Given He user is on the page
    When He user register in the page
    Then He user could see the his account


  Scenario: Login Successful
    Given He user is on the page
    When He user enter credentials
      | username   | password   |
      | 1006822101 | Kata12345* |
    Then He user could see the his account


