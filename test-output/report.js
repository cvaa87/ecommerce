$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountRegistration.feature");
formatter.feature({
  "line": 1,
  "name": "Account registration feature",
  "description": "",
  "id": "account-registration-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Creating an account scenario",
  "description": "",
  "id": "account-registration-feature;creating-an-account-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Landingpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks Create Account link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cfirstname\u003e\", \"\u003clastname\u003e\", \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks Register button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Registeration Success message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "account-registration-feature;creating-an-account-scenario;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "password"
      ],
      "line": 12,
      "id": "account-registration-feature;creating-an-account-scenario;;1"
    },
    {
      "cells": [
        "Malar",
        "Kusthi",
        "test10100@mailinator.com",
        "qwerty01"
      ],
      "line": 13,
      "id": "account-registration-feature;creating-an-account-scenario;;2"
    },
    {
      "cells": [
        "Valli",
        "Pandi",
        "test10200@mailinator.com",
        "qwerty02"
      ],
      "line": 14,
      "id": "account-registration-feature;creating-an-account-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Creating an account scenario",
  "description": "",
  "id": "account-registration-feature;creating-an-account-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Landingpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks Create Account link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters \"Malar\", \"Kusthi\", \"test10100@mailinator.com\" and \"qwerty01\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks Register button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Registeration Success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_Landingpage()"
});
formatter.result({
  "duration": 8186179456,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_Create_Account_link()"
});
formatter.result({
  "duration": 1476619014,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Malar",
      "offset": 13
    },
    {
      "val": "Kusthi",
      "offset": 22
    },
    {
      "val": "test10100@mailinator.com",
      "offset": 32
    },
    {
      "val": "qwerty01",
      "offset": 63
    }
  ],
  "location": "StepDefinition.user_enters_and(String,String,String,String)"
});
formatter.result({
  "duration": 487659123,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_Register_button()"
});
formatter.result({
  "duration": 1261565136,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.registeration_Success_message_is_displayed()"
});
formatter.result({
  "duration": 40442390,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Creating an account scenario",
  "description": "",
  "id": "account-registration-feature;creating-an-account-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Landingpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks Create Account link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters \"Valli\", \"Pandi\", \"test10200@mailinator.com\" and \"qwerty02\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks Register button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Registeration Success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_Landingpage()"
});
formatter.result({
  "duration": 6426829591,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_Create_Account_link()"
});
formatter.result({
  "duration": 1417466321,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Valli",
      "offset": 13
    },
    {
      "val": "Pandi",
      "offset": 22
    },
    {
      "val": "test10200@mailinator.com",
      "offset": 31
    },
    {
      "val": "qwerty02",
      "offset": 62
    }
  ],
  "location": "StepDefinition.user_enters_and(String,String,String,String)"
});
formatter.result({
  "duration": 449966659,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_Register_button()"
});
formatter.result({
  "duration": 1145438398,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.registeration_Success_message_is_displayed()"
});
formatter.result({
  "duration": 40704431,
  "status": "passed"
});
});