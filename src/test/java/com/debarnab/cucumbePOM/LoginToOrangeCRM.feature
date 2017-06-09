Feature: As a Orange CRM Customer I want to check the login functionality of Orange HRM	
	
Scenario Outline: Testing the Orange HRM login functionality
Given WH User navigates to "Orange HRM" site using "<browser>"
Then I validate the page title as "OrangeHRM"
When I try to Login with the following data:
|Field		  |Value|
|loginField   |<username>| 
|passwordField|<password>|

Then I validate the Login with "<Type>" credentials  
Then I validate the page title as "<pageTitle>" 
#Then I Close the browser after testing is done


Examples:
|Type		|   username	|password		|browser|pageTitle|
|correct    |linda.anderson1|linda.anderson	|chrome |		  |
|incorrect  |test		    |test	        |chrome |         |
|correct    |admin		    |admin	        |chrome |         |
|incorrect  |peter.mac		|peter.mac	    |chrome |         |
|correct    |test1		    |test1	        |chrome |         |





