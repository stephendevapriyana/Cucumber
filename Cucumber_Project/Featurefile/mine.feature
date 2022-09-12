@select
Feature: This is Users login facebook 
Scenario Outline: Facebook lgoin scenario 
Given login facebook  
When user gives <"username"> and <"password">
Then and clicks singin

Examples:
|username|password|
|stephendevapriyan24@gmail.com|Stephen@1234|





