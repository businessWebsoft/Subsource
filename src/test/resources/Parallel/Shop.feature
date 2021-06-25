@shop
Feature: Testing the Shop page functionality of Subsource

  Background: 
    Given user navigate to the shop page

  @TC_001
  Scenario: Check Shop page navigation
    When Click on shop link

  @TC_003
  Scenario: Check shop no. text field
    When Go to shop page
    Then Click on shop number text field and verify

  @TC_004
  Scenario: Check shop page email validation
    When Go to shop page
    Then Fill all the details
    Then click on save button
    Then delete the shop
    Then Again go to shop page
    Then Again Fill all the details
    Then click on save button

  @TC_005
  Scenario: Check shop page region alphabetical order
    When Go to shop page
    Then click on region dropdown to check alphabetical order

  @TC_006
  Scenario: Check shop page toggle buttons
    When Go to shop page
    Then click all the toggle buttons

  @TC_007
  Scenario: Check shop page Address text field
    When Go to shop page
    Then check address field

  @TC_008
  Scenario: Check shop page state alphabetical order
    When Go to shop page
    Then click on state dropdown to check alphabetical order

  @TC_009
  Scenario: Check shop page zip code format
    When Go to shop page
    Then Fill the details
    Then click on save button
    Then delete the shop
    Then Again go to shop page
    Then Again Fill the details
    Then click on save button

  @TC_010
  Scenario: Check shop page Variable Rent and Royality format
    When Go to shop page
    Then Fill the details to check Variable Rent and Royality
    Then click on save button
    Then delete the shop
    Then Again go to shop page
    Then Again Fill the details to check Variable Rent and Royality
    Then click on save button
    Then delete the shop

  @TC_011
  Scenario: Check shop page Fixed Misc. Costs format
    When Go to shop page
    Then Fill the details to check Fixed Misc Costs
    Then click on save button
    Then delete the shop
    Then Again go to shop page
    Then Again Fill the details to check Fixed Misc Costs
    Then click on save button
    Then delete the shop

  @TC_012
  Scenario: Check creation of new shop
    When Go to shop page
    Then Fill the details
    Then click on save button
    Then delete the shop

  @TC_015
  Scenario: Check shop page cancel button
    When Go to shop page
    Then Fill the details
    Then click on cancel button

  @TC_017
  Scenario: Check shop page period ending date functionality
    When Go to shop page
    Then Fill the details including dates
    Then click on save button

  @TC_021
  Scenario: Check edit misc page cancel functionality
    When Go to edit misc page
    Then select the shop
    Then click on cancel

  @TC_022_TO_023
  Scenario: Check shop page update function
    When Go to shop page
    Then Fill the details
    Then click on save button
    Then go to the shop and update city
    Then delete the shop

  @TC_024_TO_042
  Scenario: Check shop page email notification section
    When Go to shop page
    Then Fill the details to check email notification section
    Then click on save button
    Then update an email
    Then click on save button
    Then Again to the shop and remove an email
    Then click on save button
    Then delete the shop

  @TC_043_TO_044
  Scenario: Check shop number text field validation
    When Go to shop page
    Then Enter numeric data in shop number text field
    Then click on cancel
    Then Again go to shop page
    Then Enter character data in shop number text field

  @TC_046
  Scenario: Check shop page validation and save button
    When Go to shop page
    Then Fill the details except mandatory fields
    Then click on save button and scroll up

  @TC_047
  Scenario: Check shop page validation and save button
    When Go to shop page
    Then Fill the details except some mandatory fields
    Then click on save button and scroll up

  @TC_048
  Scenario: Check shop page cancel button
    When Go to shop page
    Then Fill the details
    Then click on cancel button

  @TC_051
  Scenario: Check shop page display of shop number before deletion
    When Go to shop page
    Then Fill the details
    Then click on save button
    Then click on delete icon and match shop number
    Then delete shop

  @TC_053
  Scenario: Check shop page export functionality
    When click on export button
    Then click on PDF

  @TC_054
  Scenario: Check shop page export functionality
    When click on export button
    Then click on excel

  @TC_056
  Scenario: Check shop page download sample file feature
    When Go to shop import page
    Then click on download sample file link

  @TC_055_And_057
  Scenario: Verify import/upload file functionality
    When Go to shop import page
    Then click on choose button and select file

  @TC_058
  Scenario: Check shop page Food Cost Distributor alphabetical order
    When Go to shop page
    Then click on Food Cost Distributor dropdown to check alphabetical order

  @TC_059
  Scenario: Check shop page company alphabetical order
    When Go to shop page
    Then click on company dropdown to check alphabetical order

  @TC_060_TO_063
  Scenario: Check shop page update function
    When Go to shop page
    Then Fill the details to check updation
    Then click on save button
    Then go to the shop and update variable rent and fixed misc
    Then delete the shop

  @TC_064
  Scenario: Check shop page import ADD feature
    When Go to shop import page
    Then click on choose button and select the file to be uploaded
    Then click on shop upload button
    Then Go to recently added shop
    Then delete the recently added shop

  @TC_065_TO_070
  Scenario: Check shop page import UPDATE file feature
    When Go to shop import page
    Then select the file to create new shop
    Then again go to shop import page
    Then select the file to update newly created shop
    Then Go to the shop to check for updation
    Then delete the recently added shop

  @TC_073
  Scenario: Check shop page delete confirmation window
    When Go to shop page
    Then Fill the details
    Then click on save button
    Then click on delete icon
    Then click on No button
    Then click on delete icon
    Then click on Cross button
    Then click on delete icon
    Then click on Yes button
