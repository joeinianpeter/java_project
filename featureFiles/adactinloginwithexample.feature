@simplelogin
Feature: analysis login adactin works expected

  Scenario Outline: logging in adactin
    Given user navigates to login page
    When user enter "<username>" and "<password>"
    Then it should login redirect to users account

    Examples: 
      | username       | password       |
      | joeinianpeterj | Johnjayajoe@12 |
