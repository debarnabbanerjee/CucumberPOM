@Ignore
@Login
Feature: Login Functionality of App Store

  Scenario Outline: Testing Login

    Given I open a browser using "<browser>"
    When I navigate to "baseUrl" of application
    Then I see the title as "My Store"
    And I try to sign in entering userame and password as :
      | Field    | Value      |
      | UserName | <username> |
      | Password | <password> |
    Then I validate the login as per "<dataCorrectNess>"
    #need to add more validation

    Examples:
      | browser | username                    | password     | dataCorrectNess |
      | IE      | user1                       | pass1        | N               |
      | Chrome  | debarnab.banerjee@gmail.com | California0! | Y               |
      | Firefox | debarnab.banerjee@gmail.com | California0  | N               |

