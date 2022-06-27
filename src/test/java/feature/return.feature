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
