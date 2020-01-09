Feature: User want to Sign in and Sign Off from Oscommerce

In order to Sign in and Sign Off from account
As a register user
I want to enter E-Mail Address, password, and click sign-in to login
and Click Sign Off for Sign Out


Scenario Outline: Positive user login and logout with valid E-Mail Address and Password

Given user visiting homepage
And click My Account button
When user enter "<E-Mail Address>" and "<password>"
And user clickn sign in button
Then user successfully login to the system
And user click on Log off Button for logout

Examples:

| E-Mail Address       | password | 
| pat@yahoo.com        | Abc123   |