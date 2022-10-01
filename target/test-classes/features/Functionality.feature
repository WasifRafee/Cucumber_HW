@FunctionalityFeature
Feature: Techfios bank and cash New Account Functionality 

Background:
Given User is on the techfios login page 

@HWScenario1
Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	
	When User enters the username as "<username>" 
	When User enters the password as "<password>"
	And  User clicks on signIn button
	Then User should land on Dashboard page 
	And User clicks the bankCash button
	And User clicks the newAccount button
	And User enters accountTitle as "<accountTitle>"in accounts page 
	And User enters description as "<description>"in accounts page 
	And User enters initialBalance as "<initialBalance>"in accounts page 
	And User enters accountNumber as "<accountNumber>"in accounts page 
	And User enters contactPerson as "<contactPerson>"in accounts page 
	And User enters Phone as "<Phone>"in accounts page 
	And User enters internetBankingURL as "<internetBankingURL>"in accounts page 
	And User clicks on submit button
	Then User should be able to validate account created successfully
	
	Examples:
	|username|password|accountTitle|description|initialBalance|accountNumber|contactPerson|Phone|internetBankingURL|
	|demo@techfios.com|abc123|Wasif|Cucumber Homework|100000|1234|Johnny Silverhand|1234567890|www.bofa.com|
	