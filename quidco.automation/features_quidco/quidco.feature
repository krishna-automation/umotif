Feature: Join Us and Sign-in scenarios of Quidco

  Background: 
    Given I am on the Quidco homepage 
    When I click Join Us or Sign In

  Scenario Outline: Verify the Join Us functionality
    And I click Join Us on the Quidco page
    And I Enter "<First Name>" - my first name
    And I Enter "<Last Name>" -  my last name
    And I Enter "<Email Address>" - my email address
    And I Enter "<Password>" - my password
    When I click Join Us
    Then I am successfully logged in to my Quidco Account page

    Examples: 
      | First Name | Last Name | Email Address | Password    |
      | Krishna    | Quidco    | kq@quidco.com | krisquid321 |
      | Mark       | Quidco    | mq@quidco.com | markquid321 |
      | Shabana    | Quidco    | sq@quidco.com | shabquid321 |

  Scenario Outline: Verify the Sign In functionality
    And I click Sign In on the Quidco page
    And I Enter "<Email Address>" - my Email address 
    And I Enter "<Password>" - my Password
    When I click Sign In
    Then I am successfully logged in to my Quidco Account page with my credentials

    Examples: 
      | Email Address | Password    |
      | kq@quidco.com | krisquid321 | 
      | mq@quidco.com | markquid321 |
      | sq@quidco.com | shabquid321 |
