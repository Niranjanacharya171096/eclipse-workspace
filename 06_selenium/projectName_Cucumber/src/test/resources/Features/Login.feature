#Test.feature
Feature: Login

@testng
Scenario: Verify if the login functionality page is opening
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Facebook – log in or sign up"