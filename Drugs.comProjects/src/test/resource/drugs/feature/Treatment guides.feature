@Regression
Feature: Drugs.com Treatment guides funtionality


Scenario: Drugs.com Treatment guides validation

Given user navigate to url
When user navigates on Treatment guides from carousel  
And user clicks on search box 
And user search for headache
Then user should be able to see all the medication options for headache 




