$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Functionality.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalityFeature"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@HWScenario1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User enters the username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enters the password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User clicks on signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User clicks the bankCash button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks the newAccount button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters accountTitle as \"\u003caccountTitle\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters description as \"\u003cdescription\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters initialBalance as \"\u003cinitialBalance\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters accountNumber as \"\u003caccountNumber\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enters contactPerson as \"\u003ccontactPerson\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enters Phone as \"\u003cPhone\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User enters internetBankingURL as \"\u003cinternetBankingURL\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "Phone",
        "internetBankingURL"
      ],
      "line": 28,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Wasif",
        "Cucumber Homework",
        "100000",
        "1234",
        "Johnny Silverhand",
        "1234567890",
        "www.bofa.com"
      ],
      "line": 29,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1658839600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "duration": 357177300,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalityFeature"
    },
    {
      "line": 7,
      "name": "@HWScenario1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User enters the username as \"demo@techfios.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enters the password as \"abc123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User clicks on signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User clicks the bankCash button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks the newAccount button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters accountTitle as \"Wasif\"in accounts page",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters description as \"Cucumber Homework\"in accounts page",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters initialBalance as \"100000\"in accounts page",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters accountNumber as \"1234\"in accounts page",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enters contactPerson as \"Johnny Silverhand\"in accounts page",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enters Phone as \"1234567890\"in accounts page",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User enters internetBankingURL as \"www.bofa.com\"in accounts page",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 29
    }
  ],
  "location": "StepDefinition.user_enters_the_username_as(String)"
});
formatter.result({
  "duration": 3075746900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 29
    }
  ],
  "location": "StepDefinition.user_enters_the_password_as(String)"
});
formatter.result({
  "duration": 3054871000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_signIn_button()"
});
formatter.result({
  "duration": 3763083000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 3016496800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_bankCash_button()"
});
formatter.result({
  "duration": 46705500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_newAccount_button()"
});
formatter.result({
  "duration": 241888200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wasif",
      "offset": 29
    }
  ],
  "location": "StepDefinition.user_enters_accountTitle_as_in_accounts_page(String)"
});
formatter.result({
  "duration": 3057828900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber Homework",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_enters_description_as_in_accounts_page(String)"
});
formatter.result({
  "duration": 3066185800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100000",
      "offset": 31
    }
  ],
  "location": "StepDefinition.user_enters_initialBalance_as_in_accounts_page(String)"
});
formatter.result({
  "duration": 3059363000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 30
    }
  ],
  "location": "StepDefinition.user_enters_accountNumber_as_in_accounts_page(String)"
});
formatter.result({
  "duration": 3055398700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Johnny Silverhand",
      "offset": 30
    }
  ],
  "location": "StepDefinition.user_enters_contactPerson_as_in_accounts_page(String)"
});
formatter.result({
  "duration": 3061191800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567890",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_enters_Phone_as_in_accounts_page(String)"
});
formatter.result({
  "duration": 3064252400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "www.bofa.com",
      "offset": 35
    }
  ],
  "location": "StepDefinition.user_enters_internetBankingURL_as_in_accounts_page(String)"
});
formatter.result({
  "duration": 3066251000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 3751551600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "duration": 54295200,
  "status": "passed"
});
formatter.after({
  "duration": 596730700,
  "status": "passed"
});
});