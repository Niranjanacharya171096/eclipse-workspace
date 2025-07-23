Feature: Login feature file

  #Scenario: Scenario_Number One
    #Given Step from 'Scenario 1' in 'Login' feature file
#
  #Scenario: Scenario_Number Two
    #Given Step from 'Scenario 2' in 'Login' feature file


@chrome
Scenario: Verify login in Chrome
  Given I open the application
  When I login with valid credentials
  Then I should see the dashboard

@firefox
Scenario: Verify login in Firefox
  Given I open the application
  When I login with valid credentials
  Then I should see the dashboard
    