Feature: User Registration

Scenario: user registration with different data
	Given user is on registration page 
	When user enters following details
		|kannan|kannan.palani@aspiresys.com|9791411499|Namakkal|
		|dhanushkodi|dhanushkodi.narayan@aspiresys.com|012345|Chennai|
	Then user registration should be successful