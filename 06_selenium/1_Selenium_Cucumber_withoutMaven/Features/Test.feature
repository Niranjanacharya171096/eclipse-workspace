Feature: Login

Scenario: Verification of Login Function  
	Given user on the Login Page
	When user enters user name with Admin 
	And user enters password with admin123  
	And user click login button
	Then user should see Orange Home page 