@all
Feature: Login

  @positive
  Scenario: Verify success login when using valid email and password
    Given I am on login page
    When I input my correct email with "artinyapabangmesi@yopmail.com"
    And I input my correct password with "adminabcde"
    And I press button login
    Then lengkapi profile will be shown


  @negative
  Scenario: Verify failed login when using invalid email
    Given I am on login page
    When I input my correct email with "artinyapabangmesi@yopmail"
    And I input my correct password with "adminabcde"
    And I press button login
    Then error message email will be shown

  @negative
  Scenario: Verify failed login when let email and pass empty
    Given I am on login page
    When I input my correct email with ""
    And I input my correct password with ""
    And I press button login
    Then error message for empty email will be shown
    And error message for empty password will be shown

  @negative
  Scenario: Verify failed login when let password empty
    Given I am on login page
    When I input my correct email with "artinyapabangmesi@yopmail"
    And I input my correct password with ""
    And I press button login
    Then error message for empty password will be shown
