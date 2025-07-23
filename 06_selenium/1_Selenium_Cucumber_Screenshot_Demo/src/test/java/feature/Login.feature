@FunctionalTest 
Feature: Application 

Scenario: User logs in 
  Given the user is logged in
  When the user navigates to the dashboard
  Then the dashboard should be visible

	