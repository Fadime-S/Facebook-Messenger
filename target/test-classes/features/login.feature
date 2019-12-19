@web
Feature: Login Feature
  Background:
    Given I am on the home page

    @login
    Scenario Outline: Verify invalid login for multiple users
    When I enter <username> into username text fields on home screen
    And I enter <password> into password text fields on home screen
    And I click on login button on home screen
    Then I verify that I am in invalid login page
Examples:

    |username        |password|
    |robert@gmail.com|test1234|
    |richard@gmail.com|abc123 |
    |jhonton@gmail.com|ert123 |