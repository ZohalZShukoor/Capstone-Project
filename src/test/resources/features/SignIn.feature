Feature: Sign In Feature

  Background: 
    Given User is on retail website

  @test6
  Scenario: Verify user can sign in into Retail Application
    When User click on Sign in option
    And User enter email 'daniel4@gmail.com' and password 'Daniel@12345'
    And User click on login button
    Then User should be logged in into Account

  @test7
  Scenario: Verify user can create an account into Retail Website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email            | password     | confirmPassword |
      | harris | harris1256@gmail.com | Harris@12345 | Harris@12345    |
    And User click on SignUp button
    Then User should be logged into account page
