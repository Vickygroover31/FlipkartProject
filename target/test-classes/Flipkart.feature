Feature: Create the Flipkart Account

Background: User launches Flipkart account
Given User launches the Flipkart Login  "https://www.flipkart.com"
Then user validate the launched application  "https://www.flipkart.com"

Scenario: User clicks on Fashion module
When User click on Fashion
When User selects the Men Top wear
Then User validate the top wear

Scenario: Test the Functionality of Search field
When User searches for an item in search field 
And User selects the Mobiles 
Then User validates the mobile prices

