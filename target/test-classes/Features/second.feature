Feature: To verify the login functionality
Scenario: Checking the functionality for valid data
Given user on the webpage "https://www.saucedemo.com/"
And user gives username as '<username>'
And user gives password as '<password>'
When click on the LoginButton
Then user navigates to product backlog page
Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|

