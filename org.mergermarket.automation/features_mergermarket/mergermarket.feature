@Chrome
Feature: Addition of items into the basket

  Scenario: Verify the addition of the cheapest item into the basket
    Given I am on the amazon homepage
    And I search for "iPhone" on the search bar to view the iPhone results
    And I sort the results by price (low to high)
    When I add the cheapest item in the list to the basket 
    Then I see the item has been added to the basket 
    

    