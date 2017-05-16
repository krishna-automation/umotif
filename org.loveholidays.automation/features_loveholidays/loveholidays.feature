Feature: Validation of Manage My Booking Sign In

  Background: 
    Given I am on the loveholidays homepage  

  Scenario: Validate the booking reference field not starting with LVE or LOV
    Given The user goes to Manage My Booking page
    And The user enters a reference number like "1702LCCCQV9H"
    Then An error message should be displayed containing the text - Your booking reference number starts with LVE or LOV and can be found on your booking summary 

  Scenario: Validate the booking reference field starting with LVE or LOV
    Given The user goes to Manage My Booking page
    When The user enters a reference number "LVE1702LCCCQV9H"
    And The user enters "Test" in the passenger surname
    Then An error message should be displayed containing the text - Sorry this is not a valid booking reference. If you have booked within the last 24 hours please wait until you receive your LOV or LVE reference number by email before logging in 
 

    