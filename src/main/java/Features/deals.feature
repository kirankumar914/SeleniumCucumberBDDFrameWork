Feature: Free crm deals page

Scenario: create new deals
Given user is already available loginpage.
When title of the login page is Free CRM.
Then User enetrs login username and passowrd. 
| kiranautomation | test@123 |

Then User clicks on submit button.
And user is in HomePage.
Then user moves to New deal page.
Then user enter deal details.
| test deal | 1000 | 50 | 10 |

Then close the browser.