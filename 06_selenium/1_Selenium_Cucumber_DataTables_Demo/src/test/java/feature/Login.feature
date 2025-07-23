@FunctionalTest 
Feature: BAHMNI EMR FOR CLINICS Login Page 

Background: BAHMNI EMR FOR CLINICS Welcome page 
	Given user on BAHMNI welcome page 
	
#@smokeTest @RegressionTest
#Scenario: Verify Login page 1
#	And user enters username1 and password1  
#
#@smokeTest 
#Scenario: Verify Login page 2
#	And user enters username2 "super man2" and password2 "Admin123"  
#	
#@RegressionTest @End2EndTest
#Scenario: Verify Login page 8
#	And user enters username8 and password8
#	| username   | super man8 |
#	| password  | Admin123 |
#	| super8  | Admin1234 |
#
#@RegressionTest @End2EndTest
#Scenario: Verify Login page 9
#	And user enters username9 and password9
#	| username   | password |
#	| super man9 | Admin123 |
  #| super9     | Admin1234 |
  #| super10     | Admin12 |
#
#@RegressionTest @End2EndTest
Scenario Outline: Verify Login page 3
	And user enters username3 <username> and password3 <password>
	Examples:
	| username  | password | status  |
	| superman3  | Admin123 | Success |
	| super3     | Admin123 | Failed  |
	| sup er3     | Admin123 | Failed  |
#
#Not preferred: we need to use List<List<String>> in stepdefinition class
#@End2EndTest     
#Scenario: Verify Login page 4
#	And user enters username4 and password4
#	|super man4|Admin123|
#	|sup er4|Admin123|
#
#Not preferred: we need to use List<Map<String, String>> in stepdefinition class
#@smokeTes @End2EndTest
#Scenario: Verify Login page 5
#	And user enters username5 and password5
#	| username | password |
#	| super man5 | Admin123 |
#	| super5    | Admin123 |
#
#Not preferred: we need to use Map<String, String> in stepdefinition class
#@smokeTes @End2EndTest
#Scenario: Verify Login page 6
#	And user enters username6 and password6
#	| username | password |
#	| super man6 | Admin123 |
#	| super6    | Admin123 |

#Scenario: Verify Login page 7
#	And user enters username7 and password7
#	| username   | password |
#	| superman7 | Admin123 |
#	| super7    | Admin1234 |
	
#Scenario: Verify Login page 10
#	Given the following employees:
  #| name   | department | salary |
  #| Alice  | HR         | 5000   |
  #| Bob    | IT         | 6000   |
	
	