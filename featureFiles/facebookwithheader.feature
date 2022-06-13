Feature: login facebook with credetials

  Scenario: login facebook
    Given user is on the login page
    When user enter the valid credentials
      | username       | password       |
      | joeinianpeterj | joe |
    Then it should be logged in 
