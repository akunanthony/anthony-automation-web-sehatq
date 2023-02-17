@all
Feature: Registration
  @positive
  Scenario: Verify success register new account
    Given I am not currently logged in
    When I am on the Login page
    And I press "Daftar"
    Then Daftar Page will be shown
    And I fill in Nama Lengkap with "Anthony"
    And I fill in Email with "anthony1234@yopmail.com"
    And I fill in Password with "Password26!"
    And I tick TnC
    And I press Daftar
    Then I should see Verify-otp page
    When I input otp with "0000"
    And I press Lanjutkan
    Then Lengkapi Profile will be shown
    And I click lewati button
    Then welcome page will be shown

  @negative
  Scenario: Verify failed register when let full name empty
    Given I am not currently logged in
    When I am on the Login page
    And I press "Daftar"
    Then Daftar Page will be shown
    And I fill in Nama Lengkap with ""
    And I fill in Email with "anthony1234@yopmail.com"
    And I fill in Password with "Password26!"
    And I tick TnC
    And I press Daftar
    Then error message for empty full name will show

  @negative
  Scenario: Verify failed register when let email empty
    Given I am not currently logged in
    When I am on the Login page
    And I press "Daftar"
    Then Daftar Page will be shown
    And I fill in Nama Lengkap with "anthony"
    And I fill in Email with ""
    And I fill in Password with "Password26!"
    And I tick TnC
    And I press Daftar
    Then error message empty email will be shown

  @negative
  Scenario: Verify failed register when let password empty
    Given I am not currently logged in
    When I am on the Login page
    And I press "Daftar"
    Then Daftar Page will be shown
    And I fill in Nama Lengkap with "anthony"
    And I fill in Email with "anthony1234@yopmail.com"
    And I fill in Password with ""
    And I tick TnC
    And I press Daftar
    Then error message for empty password will be shown

  @negative
  Scenario: Verify failed register when using invalid email empty
    Given I am not currently logged in
    When I am on the Login page
    And I press "Daftar"
    Then Daftar Page will be shown
    And I fill in Nama Lengkap with "anthony"
    And I fill in Email with "anthony@asdas."
    And I fill in Password with "Password26!"
    And I tick TnC
    And I press Daftar
    Then error message invalid email will be shown
