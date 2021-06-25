Feature: To test the Quiz Module functionality of Subsource

  Background: 
    Given user navigate to the Quiz page
  @persent
  Scenario: To verify the basic functionality For TO button
    When To Leave as a emty and click on To Edit button
    Then Edit button pop up message should be displayed
    When TO text Leave as a emty and choose the Test template
    Then Quiz Should not be sent to the employees
   
  Scenario: To Verify the basic functionalitys for choose template edit button
    When Click on choose template edit button
    Then The Edit pop up window should be displayed
 
  Scenario: To validate the creating New Quiz Template,Edit Quiz Template Name and Delete the Quiz Teamplate
    When creating new Quiz Template as "Quiz" , title is "General Question", Description "Every one has basic general knowledge" and passing percentage is "60"
    Then New Quiz Template should be created and Pop up message Sholud be displayed as "Quiz template saved successfully."
    When Edit "Quiz" template name to "Quizbws"
    Then Template Name should be Changed and pop up message should be displayed as "Template name updated successfully."
    When Click on "Quizbws" Delete button
    Then Quiz Template Should be Deleted and pop up Message Shoud be displayed as "Quiz Template deleted successfully!"

  Scenario: to verify the creating new quiz Teamplate by enetring invalid data
    Then Quiz Template Should not be created and PopUp message should be displayed as "Please check all Required Fields"
  #@persent
  Scenario: to verify the basic functionality for subscription
    When creating new Quiz as "subscription" , title is "General Knowledge", Description "Creating Quiz for Subscription" and passing percentage is "70"
    Then the quiz should be creadted and Pop up message Sholud be displayed as "Quiz template saved successfully."
    When navigate to the subscription page
    And creating new subscription list as "testing"
    And select template name as "subscription"
    Then save the subscription list and Pop up Should be displayed as "Rule created successfully."
    When user navigate to the message page
    Then Let delete the Subscription quiz"subscription" but user not able to delete delete the subscritpion Quiz and get the text as "This template can not be deleted as this is mapped with the subscription(s)."
    When navigate to the subscription list page
    Then Validate The "subscription" Subscription Quiz list edit Button function
    When Changing the Subscription name "testing" to "Edting" of "subscription" quiz
    Then Verify the basic functionality for "subscription" quiz delete button and get the validation text as "Rule deleted successfully."
    When user navigate to the message page
    Then Let delete the "subscription" quiz and successfull Message get as "Quiz Template deleted successfully!"
 
  Scenario: To Verify the basic functionality for Send Only button
    When Click on to button and Choose the to recipients
    And creating the new quiz as "recipients"
    Then Lets click on Send only button then the quiz is assigned to the recipients and pop up message is displayed as "Quiz assigned succesfully!"
   
  Scenario: To Validate the basic functionality for Save and Send button
    When Click on to button and Choose the to recipients
    And creating the new quiz as "recipients"
    Then Lets click on Save and Send button then the quiz is saved,assigned to the recipients and pop up message is displayed as "Quiz assigned succesfully!"
    When navigate to the quiz message page and click on teamplate Edit button
    Then to validate wheather the "recipients" quiz saved or not
    Then Let delete the "recipients" quiz and successfull Message is displayed as "Quiz Template deleted successfully!"
      #@persent
  Scenario: To Validate the basic functionality of Upate Template button
    When creating Quiz as "Update Template" , title is "General Knowledge", Description "Creating Quiz for Subscription" and passing percentage is "70"
    Then Quiz should be creadted and Pop up message Sholud be displayed as "Quiz template saved successfully."
    When select new Template as "Update Template"
    When Let changing the template title as "Upadte"
    Then click on update Template button then The template should be Updated and PopUp message should be displayed as "Quiz template updated successfully."
    Then let delete the "Update Template" quiz and pop up message should be displayed as "Quiz Template deleted successfully!"
  
  Scenario: To verify the basic functionality of Select Roles button
    When Click on To button and nagivate to Select Role
    Then The "Additional Roles" window is Dispalyed

  Scenario: To Validate the basic functionality of additional role check box
    When Click on To button and nagivate to Select Role
    And Click on all the check boxes
    And Click on save button
    Then all "12" roles shoulb be selected
  
  Scenario: To Validate the basic finctionality of Plus button
    When Select the new Template as "Create new template..."
    Then Click on Plus button up to 100 Questions then the "Q100." should be created.
 
  Scenario: To Verify the copy button
    When Select the new Template as "Create new template..."
    And Fill The "Question"text,Select"Radio Button" option,fill the options as "Answer1","Answer2","Answer3" and select answer
    And Click on copy button
    Then The copy "Question" should be created with the "Radio Button"option,options as "Answer1","Answer2","Answer3"
 
  Scenario: To Valiadte The basic functionality of Save new tenplate
    When creating Quiz as "Update Template" , title is "General Knowledge", Description "Creating Quiz for Subscription" and passing percentage is "70"
    Then Quiz should be creadted and Pop up message Sholud be displayed as "Quiz template saved successfully."
    When select new Template as "Update Template"
    When Let changing the template title as "Upadte"
    When clickon save new template button
    When Enter the new "Template Name"
    Then the pop up message should be display as"Quiz template saved successfully."
  
  Scenario: To validate the Manager Edit button
    When Click on To button and Manager Check box
