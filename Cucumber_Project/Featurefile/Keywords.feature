Feature: this is to login my store page 
Scenario Outline: new login scenario
Given user is on login page
When user input the value of "<username>" and "<password>"
Then user lick login button and naviagte to homepage

Examples:
|username|password|
|stephendevapriyan24@gmail.com|Stephen@1234|
