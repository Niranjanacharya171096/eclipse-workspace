Feature: Login to HRM Application 

#Background: 
#	Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/" 

@smoke
Scenario: Login with valid credentials 
	Given User is on HRMLogin page 
	When User enters username as "Admin" and password as "admin123" 
	Then User should be able to login sucessfully and new page open 
	
#@InvalidCredentials 
#Scenario Outline: Login with invalid credentials 
#
#	When User enters username as "<username>" and password as "<password>" 
#	Then User should be able to see error message "<errorMessage>" 
#	
#	Examples: 
#		| username   | password  | errorMessage                      |
#		| Admin      | admin12$$ | Invalid credentials               |
#		| admin$$    | admin123  | Invalid credentials               |
#		| abc123     | xyz$$     | Invalid credentials               |