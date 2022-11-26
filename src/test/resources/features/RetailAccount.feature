Feature: Retail Account Page

  # Note: For this feature you have to have an account and be logged in into account.
  # Repeated steps are under Background Keyword.
  Background: 
    Given User is on retail website
    When User click on Sign in Option
    And User enter email 'daniel4@gmail.com' and password 'Daniel@12345'
    And User click on login button
    And User should be logged in into Account

  @test11
  Scenario: Verify User can update Profile information
    When User click on Account option
    And User update Name 'Shukoor' and Phone '7472309223'
    And User click on Update button
    Then User profile information should be updated

  @test12
  Scenario: Verify User can update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword   | confirmPassword |
      | Daniel@12345     | Daniel@123456 | Daniel@123456   |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @test13
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard  | expirationMonth | expirationyear | securityCode |
      | 1234567891234567 | Zohal Zarif |              11 |           2023 |          344 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @test14
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard  | expirationMonth | expirationYear | securityCode |
      | 1234567891234599 | Zohal Zarif |              10 |           2023 |          344 |
    And User click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @test15
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @test16
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add Address option
    And User fill New Address form with below information
      | country       | fullName    | phoneNumber | streetAddress | apt | city       | state      | zipCode |
      | United States | Zohal Zarif |  7472309223 |         21433 | 201 | Northridge | California |   91302 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @test17
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country       | fullName    | phoneNumber | streetAddress | apt | city       | state      | zipCode |
      | United States | Zohal Zarif |  7472309223 |         21433 | 201 | Northridge | California |   91302 |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @test18
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
