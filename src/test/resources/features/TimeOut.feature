Feature: TimeOut
  @wip

  Scenario: should show timeout and allow the user to stay signed in and sign the user out
    Given I enter the web address to the login page with Selenium
    Then I am on the login page
    Then I enter my username
    Then I enter my password
    Then I click login
    Then I should be on the login landing page
    Then I wait for the timeout Popup
    Then I click stay signed in
    Then I should be on the login landing page
    Then I wait for the timeout Popup
    Then I click on sign out
    Then I am on the login page


