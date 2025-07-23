#Registration.feature
@First
Feature: Registration
     
Scenario: Verification of Registration Function 1  
	Given user on the Registration Page 
	When user enters user name with Admin 
	And user enters password with admin123  
	And user confirms password with admin123  
	And user click registration button
	Then user should see Orange Home page 

#Scenario: Verification of Registration Function 2 
#	Given user on the Registration Page 
#	When user enters user name with Admin 
#	And user enters password with admin123  
#	And user confirms password with admin123  
#	And user click registration button
#	Then user should see Orange Home page 