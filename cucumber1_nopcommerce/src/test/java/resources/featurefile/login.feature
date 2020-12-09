Feature: verify login Functionality
  as a user i want to login successfully

  Scenario: I should navigate to login page successfully
   Given I am on home page
    When I click on login link
    Then I should be navigate to login page successfully

    Scenario: verify that i should not be able to login with invalid credential
      Given I am on home page
      When I click on login link
      And  I enter email address "abc@gmail.com"
      And I enter password "123456"
      And I click on login button
      Then I should get en error message

      Scenario: verify user should login successfully with valid credential
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
        And I click on log out button
        And I click on login link
        And I enter random email address
        And I enter password "123456"
        And I click on login button
        Then I should be able to login successfully

