Feature: To verify the login functionality and display products

Background: 
Given user is able to open the url "https://www.saucedemo.com/"

Scenario: To validate that user is able to login using valid data
And User enters value '<username>'
And User passes value '<password>'
When tap on the login button
Then user navigates to the next page
Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|

Scenario: To validate that all the products are displayed
And User enters username value "standard_user"
And User passes password value "secret_sauce"
When clicks on the login button
Then user should be navigated to the next page where he can see all the product details

