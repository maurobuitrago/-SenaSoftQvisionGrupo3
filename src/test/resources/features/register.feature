Feature: Register
  i as services user i need to automate login for access the services

  Scenario:Register successful
    Given He user is on the page
    When He user register in the page
      | identification | email                    | password   |
      | 1006822100    | ekolivera2@misena.edu.co | Kata12345** |
    Then He user could see the his account