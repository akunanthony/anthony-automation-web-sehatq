@all
Feature: Edit Profile

  @positive
  Scenario: Verify success edit profile when using valid data
    Given I am on login page
    When I input my correct email with "artinyapabangmesi@yopmail.com"
    And I input my correct password with "adminabcde"
    And I press button login
    Then lengkapi profile will be shown
    And I press Lewati
    And I press profile logo
    And I press profile text
    And I press edit profile
    And I input tanggal lahir
    And I input jenis kelamin pria
    And I input my height
    And I input my weight
    And I input my phone number
    And I press simpan


  Scenario: Verify failed edit profile when let mandatory field empty
    Given I am on login page
    When I input my correct email with "artinyapabangmesi@yopmail.com"
    And I input my correct password with "adminabcde"
    And I press button login
    Then lengkapi profile will be shown
    And I press Lewati
    And I press profile logo
    And I press profile text
    And I press edit profile
    And I press simpan
    Then Error message on DOB filed will be shown
    And Error message on gender filed will be shown
    And Error message on Height filed will be shown
    And Error message on Weight filed will be shown
    And Error message on Address filed will be shown

  Scenario: Verify failed edit profile when using invalid phone number
    Given I am on login page
    When I input my correct email with "artinyapabangmesi@yopmail.com"
    And I input my correct password with "adminabcde"
    And I press button login
    Then lengkapi profile will be shown
    And I press Lewati
    And I press profile logo
    And I press profile text
    And I press edit profile
    And I input tanggal lahir
    And I input jenis kelamin pria
    And I input my height
    And I input my weight
    And I input my phone number with "123412"
    And I press simpan
    Then Error message on Phone number filed will be shown

  Scenario: Verify failed edit profile when using invalid phone number
    Given I am on login page
    When I input my correct email with "artinyapabangmesi@yopmail.com"
    And I input my correct password with "adminabcde"
    And I press button login
    Then lengkapi profile will be shown
    And I press Lewati
    And I press profile logo
    And I press profile text
    And I press edit profile
    And I input tanggal lahir
    And I input jenis kelamin pria
    And I input my height
    And I input my weight
    And I input my phone number with "123412"
    And I press simpan
    Then Error message on Phone number filed will be shown


  Scenario: Verify failed edit profile when let tanggal lahir field empty
    Given I am on login page
    When I input my correct email with "artinyapabangmesi@yopmail.com"
    And I input my correct password with "adminabcde"
    And I press button login
    Then lengkapi profile will be shown
    And I press Lewati
    And I press profile logo
    And I press profile text
    And I press edit profile
    And I input jenis kelamin pria
    And I input my height
    And I input my weight
    And I input my phone number with "08111213123"
    And I press simpan
    Then Error message on DOB filed will be shown

  Scenario: Verify failed edit profile when let gender field empty
    Given I am on login page
    When I input my correct email with "artinyapabangmesi@yopmail.com"
    And I input my correct password with "adminabcde"
    And I press button login
    Then lengkapi profile will be shown
    And I press Lewati
    And I press profile logo
    And I press profile text
    And I press edit profile
    And I input tanggal lahir
    And I input my height
    And I input my weight
    And I input my phone number with "08111213123"
    And I press simpan
    Then Error message on gender filed will be shown


  Scenario: Verify failed edit profile when let height field empty
    Given I am on login page
    When I input my correct email with "artinyapabangmesi@yopmail.com"
    And I input my correct password with "adminabcde"
    And I press button login
    Then lengkapi profile will be shown
    And I press Lewati
    And I press profile logo
    And I press profile text
    And I press edit profile
    And I input tanggal lahir
    And I input jenis kelamin pria
    And I input my weight
    And I input my phone number with "08111213123"
    And I press simpan
    Then Error message on Height filed will be shown


  Scenario: Verify failed edit profile when let weight field empty
    Given I am on login page
    When I input my correct email with "artinyapabangmesi@yopmail.com"
    And I input my correct password with "adminabcde"
    And I press button login
    Then lengkapi profile will be shown
    And I press Lewati
    And I press profile logo
    And I press profile text
    And I press edit profile
    And I input tanggal lahir
    And I input jenis kelamin pria
    And I input my height
    And I input my phone number with "08111213123"
    And I press simpan
    Then Error message on Weight filed will be shown