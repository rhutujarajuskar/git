Feature: login to upskills website

 
  Background: login with authorized user
    Given user is on home page
    When user enter valid credentnials 
    And user click on submit button
    Then validation message appears
    Given open Product Returns page
    
   @tag1
   Scenario:Add Product Return
   When Click on orders option from left navigation
   And Click on the add product details
   Given Verify the mandatory fields in Add Product Return page  
 

  
