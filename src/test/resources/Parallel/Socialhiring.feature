Feature: To validate the Social Hiring Features

  Background: 
    Given Navigate To The Social hirirng page

  Scenario: To Validate The select shops for posting window
    When Click on Select Shops for posting link
    Then Select shops for posting PopUp Winddow Should Display With The Titile "Select shop(s) for posting"
    When Click on create custom shop link
    Then Validating the create custom shop by entering invalid data

  Scenario: To Validate The Select Shop for posting
    When Click on Select Shops for posting link
    When Search for the shop number"457"
    And Select the "457" number shop
    Then "457" number shop should be selected
    When Click on To Plus button
    Then "457" number should be selected in To Section

  @Pending
  Scenario: To Validate The Subject Text
    When Eneter The Sbuject Text as "SandWich Artist Going to Hire New Employees"
    Then The Email Content Should have "SandWich Artist Going to Hire New Employees"


  Scenario: To Validate Create new Template and Delete Template
    When Eneter The Sbuject Text as "SandWich Artist Going to Hire New Employees"
    When chose template as "Create new template..."
    And Click on Save template
    Then The template Should not be saved and Pop Up message Should Be Displayed as "Please enter name and description to save template."
    When Enter New template Name as "Testing"
    And enter new template text as "creating the new template for validation"
    Then Click on Save Template Template Should be Saved and Pop Up Message Should Be Displayed as "Template Saved successfully!"
    Then Click on Template Edit button then The edit template Should be displayed and title Contains as "Templates"
    Then To Veritying the choose Template edit button PopUp Window Cross and Cancel button
    When clickon "Testing"delete button
    Then The delete PopUp Winddow should be Displayed With The Template name "Testing"
    Then To Verify delete Pop Up Window cancel and cross button
    Then Click on Continue button then template should be deleted and pop up message Should be display as "Template deleted successfully!"

  
  Scenario: To Verify the Preview and Cancel button
    When Eneter The Sbuject Text as "SandWich Artist Going to Hire New Employees"
    And Click on Preview button
    Then Pop Up Window should be displayed with the tittle "Preview" sbuject should contains "SandWich Artist Going to Hire New Employees"
    When click on Pop Up Cancel button
    And Click on Cancel button
    Then Subject Should not contians with "SandWich Artist Going to Hire New Employees"

  
  Scenario: To Verify The Subject Upload File button
    When Click on attachment button
    Then Upload Attachment PopUp Window Should be Open and Title should contains"Upload Attachment"
    When Upload the file
    Then File should be Uploaded with the name "sample-calm-eloquence-resume.pdf"
    Then Click on Pop up WinDow cancel button then the pop up window should be cancel
    When Click on file remove button
    When Click on attachment button
    Then The Uploaded "sample-calm-eloquence-resume.pdf" file should be deleted.

  Scenario: To Validate The view button
    When Eneter The Sbuject Text as "SandWich Artist Going to Hire New Employees"
    When chose template as a "Create new template..."
    And Click on Save template
    Then The template Should not be saved and Pop Up message Should Be Displayed as "Please enter name and description to save template."
    When Enter New template Name as "Testing"
    And enter new template text as "creating the new template for validation"
    Then Click on Save Template Template Should be Saved and Pop Up Message Should Be Displayed as "Template Saved successfully!"
    When Choose "Testing" template
    When Click on view button
    Then Subject window should be displayed and subject should contains "creating the new template for validation"
    Then Click on Template Edit button then The edit template Should be displayed and title Contains as "Templates"
    Then To Veritying the choose Template edit button PopUp Window Cross and Cancel button
    When clickon "Testing"delete button
    Then The delete PopUp Winddow should be Displayed With The Template name "Testing"
    Then To Verify delete Pop Up Window cancel and cross button
    Then Click on Continue button then template should be deleted and pop up message Should be display as "Template deleted successfully!"
 @persent
  Scenario: To Validate Preview,Send and Cancel button texts
    Then The Preview button should contain "Preview" text
    Then The Send button should contains "Send" text
    Then The Cancel button should contains "Cancel" text
