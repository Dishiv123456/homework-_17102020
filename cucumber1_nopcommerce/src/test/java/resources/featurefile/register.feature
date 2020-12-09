Feature: Registration Functionality
  as a user i want to register successfully

  Scenario: I should navigate to registration page successfully
    Given I am on home page
    When I click on register link
    Then  I should navigate to register page successfully

  Scenario: I should be able to register successfully with valid credential
    Given I am on home page
    When I click on register link
    And I select male radio button
    And I enter first name "Ram"
    And I enter last name "Krishna"
    And I enter day "10"
    And I enter month "May"
    And I enter year "1985"
    And I enter random email address
    And I enter company name "Prime Testing"
    And I enter password "123456"
    And I enter confirm password "123456"
    And I click on register button
    Then I should be able to register and create account successfully

