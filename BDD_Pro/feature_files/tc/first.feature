Feature: Test Login Functionality
Scenario: Test with valid credentials
Given user is on login page
When user enter username
And user enter password
Then user should be able to login