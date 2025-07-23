#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  #@tag1
  #Scenario: Different data
  #Given I have 3 items in my cart
  #And I have (5) items in my cart
  #And the balance is .0
  #And the setting is "true"
  #And the setting is: false
  #Given the flag is: TRUE
  #And the user agreed: no
  #When I login with username "alice" and password "pass123"
  #Then I see the message "Login successful"
  #And I should see the welcome message "Welcome"
  #And I should see the welcome message
  #And I should be redirected to the dashboard
  #And I should be redirected
  #When I login as "admin"
  #When the user get the following message:
  #"""
  #Hello,
  #This is a test message.
  #Regards,
  #QA Team
  #"""
  Scenario: DataTable access
    Given the following fruits:
      | Apple  |
      | Banana |
      | Grape  |
    Given the following numbers:
      | 1 |
      | 2 |
      | 3 |
    Given the following fruits and colors:
      | Apple  | Red    |
      | Banana | Yellow |
      | Grape  | Purple |
    Given the user details:
      | name  | John          |
      | email | john@mail.com |
      | age   |            28 |
    Given the user data:
      | name  | email          | age |
      | Alice | alice@mail.com |  30 |
      | Bob   | bob@mail.com   |  25 |
    And the user details and email:
      | name  | age | email     |
      | Alice |  30 | alc@ma.in |
    Given the following users exist?:
      | name  | email     |
      | alice | pass123   |
      | bob   | qwerty456 |
    Given the following employees:
      | name  | department | salary |
      | Alice | HR         |   5000 |
      | Bob   | IT         |   6000 |
    Given raw table data:
      | Name  | Age | Country |
      | Alice |  30 | USA     |
      | Bob   |  25 | UK      |
      
  #@tag2
  Scenario Outline: data accessing using placeholders
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
