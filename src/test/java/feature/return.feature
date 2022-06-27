Feature: Login to website
  user wants to login to website

  Background: login to home page
    Given user is on homepage

  @tag1
  Scenario Outline: user enter valid credentnials
    When user provides valid credentials "<uname>" "<upass>"
    And user clicks on submit button
    And open Product Returns page

    Examples: 
      | uname | upass     |
      | admin | Admin@123 |

  @tag2
  Scenario Outline: Add Product Return
    And Add Product Return details "<orderID>" "<Firstname>" "<lastname>" "<email>" "<telephone>" "<product>"
    And user clicks on save

    Examples: 
      | orderID | firstname | lastname | email          | telephone  | product |
      |     123 | rhutu     | rajuskar | r123@gamil.com | 1223443234 | aghfd   |
 
 
@tag3
Scenario Outline: edit the details
When user need to edit the Product Returns information
    Given edit the details  "<orderID1>" "<Firstname1>" "<lastname1>" "<email1>" "<telephone1>" "<product1>"
    Then click on save
    
    Examples: 
      | orderID1 | firstname1 | lastname1 | email1         | telephone1 | product1 |
      |      123 | rhutu      | rajuskar  | r123@gamil.com | 1223443234 | aghfd    |
