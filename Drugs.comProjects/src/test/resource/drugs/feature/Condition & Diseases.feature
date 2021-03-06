@Regression
Feature:  Desease and condition search feature 

Scenario: As a user I want to search desease and condition 

    Given User navigate the url
    
    When Click on  disease and condition from carosel
    And Input fever in search textbox
    Then User can see description of fever