$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loveholidays.feature");
formatter.feature({
  "line": 1,
  "name": "Validation of Manage My Booking Sign In",
  "description": "",
  "id": "validation-of-manage-my-booking-sign-in",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5095778866,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the loveholidays homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoveHolidaysSteps.i_am_on_the_loveholidays_homepage()"
});
formatter.result({
  "duration": 21345111121,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Validate the booking reference field not starting with LVE or LOV",
  "description": "",
  "id": "validation-of-manage-my-booking-sign-in;validate-the-booking-reference-field-not-starting-with-lve-or-lov",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "The user goes to Manage My Booking page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "The user enters a reference number like \"1702LCCCQV9H\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "An error message should be displayed containing the text - Your booking reference number starts with LVE or LOV and can be found on your booking summary",
  "keyword": "Then "
});
formatter.match({
  "location": "LoveHolidaysSteps.the_user_goes_to_Manage_My_Booking_page()"
});
formatter.result({
  "duration": 3381399873,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1702LCCCQV9H",
      "offset": 41
    }
  ],
  "location": "LoveHolidaysSteps.the_user_enters_a_reference_number_like(String)"
});
formatter.result({
  "duration": 345447253,
  "status": "passed"
});
formatter.match({
  "location": "LoveHolidaysSteps.an_error_message_should_be_displayed_containing_the_text_Your_booking_reference_number_starts_with_LVE_or_LOV_and_can_be_found_on_your_booking_summary()"
});
formatter.result({
  "duration": 528097885,
  "status": "passed"
});
formatter.after({
  "duration": 2362672607,
  "status": "passed"
});
formatter.before({
  "duration": 5637302738,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the loveholidays homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoveHolidaysSteps.i_am_on_the_loveholidays_homepage()"
});
formatter.result({
  "duration": 6073119507,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Validate the booking reference field starting with LVE or LOV",
  "description": "",
  "id": "validation-of-manage-my-booking-sign-in;validate-the-booking-reference-field-starting-with-lve-or-lov",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "The user goes to Manage My Booking page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "The user enters a reference number \"LVE1702LCCCQV9H\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "The user enters \"Test\" in the passenger surname",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "An error message should be displayed containing the text - Sorry this is not a valid booking reference. If you have booked within the last 24 hours please wait until you receive your LOV or LVE reference number by email before logging in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoveHolidaysSteps.the_user_goes_to_Manage_My_Booking_page()"
});
formatter.result({
  "duration": 3372880680,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LVE1702LCCCQV9H",
      "offset": 36
    }
  ],
  "location": "LoveHolidaysSteps.the_user_enters_a_reference_number(String)"
});
formatter.result({
  "duration": 170165650,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 17
    }
  ],
  "location": "LoveHolidaysSteps.the_user_enters_in_the_passenger_surname(String)"
});
formatter.result({
  "duration": 92855581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "24",
      "offset": 139
    }
  ],
  "location": "LoveHolidaysSteps.an_error_message_should_be_displayed_containing_the_text_Sorry_this_is_not_a_valid_booking_reference_If_you_have_booked_within_the_last_hours_please_wait_until_you_receive_your_LOV_or_LVE_reference_number_by_email_before_logging_in(int)"
});
formatter.result({
  "duration": 1972283860,
  "status": "passed"
});
formatter.after({
  "duration": 738956527,
  "status": "passed"
});
});