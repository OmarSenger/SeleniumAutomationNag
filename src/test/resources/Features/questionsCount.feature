Feature: feature to test question count

  Scenario: check how many questions in specific lesson
    Given user is on home page
    When user searches for specific lesson ex : " addition "
    And user clicks on search button
    And user chooses the 2nd lesson
    And user clicks on worksheet section
    Then user is navigated to the worksheet page with number of questions