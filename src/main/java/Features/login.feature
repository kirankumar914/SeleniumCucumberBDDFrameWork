Feature: Free CRM login feature

#data driven testing with out Example keyword.
#Scenario: free scenario login test

#Given user is already available loginpage.
#When title of the login page is Free CRM.
#Then User enetrs login deatils i.e. "kiranautomation" and "test@123". 
#Then User clicks on submit button.
#And user is in HomePage.
#Then close the browser.

#data driven testing with Example keyword.
Scenario Outline: free scenario login test

Given user is already available loginpage.
When title of the login page is Free CRM.
Then User enetrs login deatils i.e. "<username>" and "<password>". 
Then User clicks on submit button.
And user is in HomePage.
Then close the browser.

Examples:
       | username | password |
       | kiranautomation | test@123 |
#       | naveenk | test@123 |











