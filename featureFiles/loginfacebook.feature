Feature: This is to login facebook application

  Scenario: login facebook
    Given user is on login page
    When user enters the username and password
      |joeinianpeterj|joeinianjohnjaya123|
    Then user will not be able to login
