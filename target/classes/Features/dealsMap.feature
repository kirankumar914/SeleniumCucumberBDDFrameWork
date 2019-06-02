Feature: Free crm deals page

Scenario: create new deals
Given user is already available loginpage.
When title of the login page is Free CRM.
Then User enetrs login username and password
   | username | password |
   | kiranautomation | test@123 |

Then User clicks on submit button.
And user is in HomePage.
Then user moves to New deal page.
Then user enter deal details
        |title  | amount | probability | commission |
		| test deal1 | 1000 | 50 | 10 |
		| test deal2 | 2000 | 60 | 20 |
		| test deal3 | 3000 | 70 | 30 |

Then close the browser.