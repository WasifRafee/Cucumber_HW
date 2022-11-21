@FunctionalityFeature
Feature: Techfios bank and cash New Account Functionality 

Background:
Given User is on the techfios login page 

@HWScenario1
Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	
	When User enters the "<username>" in "userName" field
	When User enters the "<password>" in "passWord" field
	And  User clicks on signIn button
	Then User should land on Dashboard page 
	And User clicks the bankCash button
	And User clicks the newAccount button
	And User enters the "<accountTitle>" in "accountTitle" field 
	And User enters the "<description>" in "description" field
	And User enters the "<initialBalance>" in "initialBalance" field
	And User enters the "<accountNumber>" in "accountNumber" field
	And User enters the "<contactPerson>" in "contactPerson" field
	And User enters the "<Phone>" in "Phone" field 
	And User enters the "<internetBankingURL>" in "internetBankingURL" field
	And User clicks on submit button
	Then User should be able to validate account created successfully
	
	Examples:
	|username|password|accountTitle|description|initialBalance|accountNumber|contactPerson|Phone|internetBankingURL|
	|demo@techfios.com|abc123|Wasif|Cucumber Homework|100000|1234|Johnny Silverhand|1234567890|www.bofa.com|
	