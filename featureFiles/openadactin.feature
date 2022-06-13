Feature: This is to test adactin login webpage

  Scenario: open adactin login webpage
    Given user adactin.com
    When user  the username "joeinianpeterj"
    And user  the password "02KEO5"
    And user clicks the login button
    Then user logged in successfully
    Given user enters the location
    And user enters the hotel
    And user enters the room type
    And user enters the number of rooms
    And user enters check in date
    And user enters check out date
    And user enters adults per room
    And user entes childerns per room
    Then user clicks on search button
    And user clicks on select button
    And user clicks on continue
