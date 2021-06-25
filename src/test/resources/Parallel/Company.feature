@company
Feature: Testing the Company page functionality of SubSource

  Background: 
    Given user navigate to the company page

  @TC_001
  Scenario: Check Company page without filling mandatory data
    When Go to company page and try to create new company without filling mandatory fields
    And click on Save Button

  @TC_002
  Scenario: Check EIN format
    When Go to company page and fill invalid EIN number
    And click on Save Button

  @TC_003
  Scenario: Check company page with vacant EIN field
    When Go to company page and do not fill EIN number
    And click on Save Button

  @TC_004
  Scenario: Check company page save button
    When Go to company page and fill all the details
    And click on Save Button and delete company

  @TC_005
  Scenario: Check company page save button
    When Go to company page and left some mandatory fields
    And click on Save Button

  @TC_006
  Scenario: Check company page Zip code field
    When Go to company page and fill invalid zipcode
    And click on Save Button

  @TC_007
  Scenario: Check company page phone_number field
    When Go to company page and fill invalid phone number
    And click on Save Button

  @TC_008
  Scenario: Check company page state field
    When Go to company page and check State drop down list box

  @TC_011
  Scenario: Check company page save without enable toggle buttons
    When Go to company page and fill all the details without enabling any of the toggle button EVerify or Enable ACA
    And click on Save Button and delete company

  @TC_012
  Scenario: Check company page toggle buttons
    When Go to company page and on and off toggle buttons

  @TC_013
  Scenario: Check company page Everify toggle button
    When Go to company page enable EVerify toggle button and fill username and password fields

  @TC_014
  Scenario: Check company page ACA toggle button
    When Go to company page and on and off ACA toggle button

  @TC_015
  Scenario: Check company page cancel button
    When Go to company page and fill all the required fields
    And click on Cancel Button

  @TC_016
  Scenario: Check company page confirmation message
    When Go to company page and add new company
    And click on Save Button and delete company

  @TC_017
  Scenario: Check company page max length of username Everify
    When Go to company page and enable Everify toggle button and fill maximum length in UserName field

  @TC_018
  Scenario: Check company page max length of password Everify
    When Go to company page and enable Everify toggle button and fill maximum length in password field

  @TC_019
  Scenario: Check company page Everify password encrypted form
    When Go to company page and enable Everify toggle button and fill password field and to check encrypted form

  @TC_020
  Scenario: Check newly created company data
    When Go to company page and fill details and add new company
    And click on save button and check recently added company data
    And delete recently added company

  @TC_021
  Scenario: Check company page update features
    When Go to company page and fill the details and create new company
    Then click on save button and check recently added company data and edit data
    Then click on save button and check updated data
    And delete recently added company

  @TC_022
  Scenario: Check company page delete features
    When Create new company
    Then click on Save Button
    And delete recently added company

  @TC_023
  Scenario: Check company page delete confirmation features
    When Create new company and delete it to check display of confirmation message before deleting a company
    Then click on Save Button
    And delete confirmation window

  @TC_024
  Scenario: Check company page duplicate EIN number
    When Go to company page and fill duplicate EIN number
    Then click on Save Button

  @TC_025
  Scenario: Check company page import and upload feature
    When Go to import page and upload new file
    Then click on upload button

  @TC_026
  Scenario: Check company page download sample file feature
    When Go to import page and click on download sample file link

  @TC_027
  Scenario: Check company page import/cancel feature
    When Go to import page
    And click on import page cancel button

  @TC_028
  Scenario: Check company page import and upload feature
    When import and upload wrong file format

  @TC_030
  Scenario: Check company page dropdown alphabetical order
    When Go to company page and check state dropdown alphabetical order

  @TC_031
  Scenario: Check company page saved data consistency
    When Go to company page and create new company
    And click on save button and check recently added company data
    And delete recently added company

  @TC_034
  Scenario: Check company page hyperlink
    And logout from company page

  @TC_035
  Scenario: Check company page export functionality
    When Go to company page and click on export icon
    And Click on PDF button

  @TC_036
  Scenario: Check company page export Pdf format
    When Go to company page and click on export icon
    And Click on PDF button

  @TC_037
  Scenario: Check company page export excel format
    When Go to company page and click on export icon
    And Click on Excel button

  @TC_038
  Scenario: Check company page display of company name before deletion
    When Go to company page and create new company
    And match the existing company with the deleting company
    And delete company

  @TC_039
  Scenario: Check company page import file ADD feature
    When Go to import page
    Then select the file to be imported and click on upload button
    And click on Cancel Button and delete recently added company

  @TC_040
  Scenario: Check company page import file EDIT feature
    When Go to import page
    Then select the file to be updated and click on upload button
    And click on Cancel Button
    And click on company

  @TC_041
  Scenario: Check company page import file UPDATE phone number feature
    When Go to import page
    Then select the file to update phone number and click on upload button
    And click on Cancel Button
    And click on company

  @TC_042
  Scenario: Check company page import file UPDATE Everify feature
    When Go to import page
    Then select the file to update Everify and click on upload button
    And click on Cancel Button
    And click on company

  @TC_043
  Scenario: Check company page import file UPDATE Everify username feature
    When Go to import page
    Then select the file to update Everify Username and click on upload button
    And click on Cancel Button
    And click on company

  @TC_044
  Scenario: Check company page import file duplicate EIN
    When Go to import page
    Then select the file to check duplicate EIN and click on upload button and scroll down
    And click on Cancel Button
    And click on company

  @TC_045
  Scenario: Check company page import file Invalid Zip
    When Go to import page
    Then select the file to check invalid zip and click on upload button and scroll down
    And click on Cancel Button

  @TC_046
  Scenario: Check company page import file duplicate EIN
    When Go to import page
    Then select the file to check add new functionality and click on upload button and scroll down
    And click on Cancel Button
    And click on company to check data
    And delete added company

  @TC_047
  Scenario: Check company page import file UPDATE feature
    When Go to import page
    Then select the file to update and click on upload button
    And click on Cancel Button
    And click on company

  @TC_048
  Scenario: Check company page import file DELETE feature
    When Go to import page
    Then select the file to add company and click on upload button
    And click on Cancel Button
    And click on company to check
    And back and delete the company

  @TC_049
  Scenario: Check company page import file UPDATE STATE feature
    When Go to import page
    Then select the file to update state of company and click on upload button
    And click on Cancel Button
    And click on company to check updation of state

  @TC_050
  Scenario: Check company page import file UPDATE CITY feature
    When Go to import page
    Then select the file to update City of company and click on upload button
    And click on Cancel Button
    And click on company to check updation of city

  @TC_051
  Scenario: Check company page import file verify EIN feature
    When Go to import page
    Then select the file to verify EIN of company and click on upload button
    And click on Cancel Button
    And click on company to check EIN

  @TC_052
  Scenario: Check company page import file UPDATE ADDRESS feature
    When Go to import page
    Then select the file to update address of company and click on upload button
    And click on Cancel Button
    And click on company to check updated address

  @TC_053
  Scenario: Check company page import file UPDATE COMPANY NAME feature
    When Go to import page
    Then select the file to update company name and click on upload button
    And click on Cancel Button
    And click on company to check updated name

  @TC_055
  Scenario: Check company page by creating duplicate company name
    When Go to company page and fill the required details with duplicate company name
    And click on Save Button
