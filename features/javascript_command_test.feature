Feature: Testing javascript command

  Scenario: To test the javascript code snippets
    Given User launches chrome browser
    And User navigates to "https://formy-project.herokuapp.com/modal"
    When User click Open Modal button
    And User clicks close Close button on Modal
    Then Modal should close
    And User shut the browser