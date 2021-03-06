@Regression
Feature: Drugs.com Side Effects funtionality


Scenario: As a user i want search for side Effects
 
Given user navigate to the url
When user clicks on Side Effects from Carousel 
And inputs aspirin in search textbox
Then user should be able to see all the side effects of aspirin
