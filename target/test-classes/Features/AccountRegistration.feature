Feature: Account registration feature

Scenario Outline: Creating an account scenario

Given user is on Landingpage
And user clicks Create Account link
And user enters "<firstname>", "<lastname>", "<email>" and "<password>"
When user clicks Register button
Then Registeration Success message is displayed

Examples:
| firstname  | lastname | email                   | password |
|Malar       | Kusthi   |test10100@mailinator.com | qwerty01 |
|Valli       | Pandi    |test10200@mailinator.com | qwerty02 |