Feature: JupiterToys Login feature

Scenario: JupiterToys Login Test scenario

Given user is on Landingpage
When user clicks Login link
Then user enters username and passsword
And user clicks Login button
Then user is on homepage 
Then username is displayed on homepage
