Feature: Blog application

  Scenario: Sign up to the blog application
    Given User opens signup form
    When User enter name
    And User enter email
    And User enter password
    And User submit the form
    Then It confirms user can sign up to the blog successfully
    And Close the browser
