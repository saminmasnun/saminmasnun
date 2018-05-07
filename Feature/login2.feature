@Login2
Feature: AdminLogin to HRM home page
In Order To Login to OrangeHRM
As a Admin with validUsername and Password
I want to Enter UserName, Password, click on LoginButton to Access to the account

Scenario: Positive- AdminLogin Successfully
Given Admin Navigate to HRM Loginpage
When Admin Enter validUserName and Password
And click on LogingButton
Then Admin will Land in Admin homePage