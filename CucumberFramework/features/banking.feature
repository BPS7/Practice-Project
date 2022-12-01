

Feature: Login with guru99 web application
  
  Scenario Outline: User should only be able to login with valid credentials
    Given I navigate to the guru99 website
    When enter Username as "<username>" and Password as "<password>"
    And  I click on Login
    Then User login based on expected "<loginstatus>" status

    Examples: 
      | username  | password | loginstatus  |
      |mngr443901|vEhYduq| success |
      | name2 |     7 | Fail    |
