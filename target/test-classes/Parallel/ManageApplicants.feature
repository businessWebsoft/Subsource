@ManageApplicants
Feature: Testing the Manage Applicants page functionality of Subsource

  Background: 
    Given user navigate to the manage applicants page

  @Navigation
  Scenario: Check dropdown of Hire new employee page
    When Click on dropdown and select manage applicants

  @ApplicantInfoWindow
  Scenario: Check Applicants Information window
    When Click on applicants name to check applicants information window
    Then click on buttons one by one available on the window
    Then click on combined and then click on sections
    Then click on share icon
    Then enter email id and click on send button

  @Paging
  Scenario: Check Manage Applicant paging feature
    When Click on right single arrow
    Then Click on left single arrow
    Then Click on right double arrow
    Then Click on left double arrow
    Then Click on individual pages

  @Page_view
  Scenario: Check Manage Applicant view per page feature
    When Click on view per page

  @Days_data
  Scenario: Check Manage Applicant days button feature
    When Click on days button one by one

  @Search_filter
  Scenario: Check Manage Applicant search filter feature
    When Click on search button
    Then Select shop and status

  @hire
  Scenario: Check Manage Applicant hire feature
    When Click on hire
    Then Select shop for referred
    And click on continue button
    Then Click on hire
    Then Select shop for referred
    And Click on cancel
