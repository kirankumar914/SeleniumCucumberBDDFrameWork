$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/NAVYA/eclipse-workspace/com.qa.bddframework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#data driven testing with out Example keyword."
    },
    {
      "line": 4,
      "value": "#Scenario: free scenario login test"
    },
    {
      "line": 6,
      "value": "#Given user is already available loginpage."
    },
    {
      "line": 7,
      "value": "#When title of the login page is Free CRM."
    },
    {
      "line": 8,
      "value": "#Then User enetrs login deatils i.e. \"kiranautomation\" and \"test@123\"."
    },
    {
      "line": 9,
      "value": "#Then User clicks on submit button."
    },
    {
      "line": 10,
      "value": "#And user is in HomePage."
    },
    {
      "line": 11,
      "value": "#Then close the browser."
    },
    {
      "line": 13,
      "value": "#data driven testing with Example keyword."
    }
  ],
  "line": 14,
  "name": "free scenario login test",
  "description": "",
  "id": "free-crm-login-feature;free-scenario-login-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "user is already available loginpage.",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "title of the login page is Free CRM.",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enetrs login deatils i.e. \"\u003cusername\u003e\" and \"\u003cpassword\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User clicks on submit button.",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user is in HomePage.",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "close the browser.",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "free-crm-login-feature;free-scenario-login-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 24,
      "id": "free-crm-login-feature;free-scenario-login-test;;1"
    },
    {
      "cells": [
        "kiranautomation",
        "test@123"
      ],
      "line": 25,
      "id": "free-crm-login-feature;free-scenario-login-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 295924,
  "status": "passed"
});
formatter.before({
  "duration": 145396,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "free scenario login test",
  "description": "",
  "id": "free-crm-login-feature;free-scenario-login-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "user is already available loginpage.",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "title of the login page is Free CRM.",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enetrs login deatils i.e. \"kiranautomation\" and \"test@123\".",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User clicks on submit button.",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user is in HomePage.",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "close the browser.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefination.user_is_already_on_loginPage()"
});
formatter.result({
  "duration": 14577968459,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefination.titile_of_the_login_page()"
});
formatter.result({
  "duration": 8938718,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kiranautomation",
      "offset": 32
    },
    {
      "val": "test@123",
      "offset": 54
    }
  ],
  "location": "LoginPageStepDefination.user_enetrs_login_deatils_i_e_username_and_passwrod(String,String)"
});
formatter.result({
  "duration": 251961563,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefination.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 5530317345,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefination.user_is_in_HomePage()"
});
formatter.result({
  "duration": 4382406,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefination.close_the_browser()"
});
formatter.result({
  "duration": 2264312810,
  "status": "passed"
});
formatter.after({
  "duration": 951631,
  "status": "passed"
});
formatter.after({
  "duration": 668822,
  "status": "passed"
});
});