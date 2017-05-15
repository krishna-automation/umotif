$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mergermarket.feature");
formatter.feature({
  "line": 2,
  "name": "Addition of items into the basket",
  "description": "",
  "id": "addition-of-items-into-the-basket",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Chrome"
    }
  ]
});
formatter.before({
  "duration": 3120712667,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the addition of the cheapest item into the basket",
  "description": "",
  "id": "addition-of-items-into-the-basket;verify-the-addition-of-the-cheapest-item-into-the-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the amazon homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for \"iPhone\" on the search bar to view the iPhone results",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I sort the results by price (low to high)",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I add the cheapest item in the list to the basket",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I see the item has been added to the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "MergerMarketSteps.i_am_on_the_amazon_homepage()"
});
formatter.result({
  "duration": 24976022821,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone",
      "offset": 14
    }
  ],
  "location": "MergerMarketSteps.i_search_for_on_the_search_bar_to_view_the_iPhone_results(String)"
});
formatter.result({
  "duration": 10272513483,
  "status": "passed"
});
formatter.match({
  "location": "MergerMarketSteps.i_sort_the_results_by_price_low_to_high()"
});
formatter.result({
  "duration": 5830594141,
  "status": "passed"
});
formatter.match({
  "location": "MergerMarketSteps.i_add_the_cheapest_item_in_the_list_to_the_basket()"
});
formatter.result({
  "duration": 7417159771,
  "status": "passed"
});
formatter.match({
  "location": "MergerMarketSteps.i_see_the_item_has_been_added_to_the_basket()"
});
formatter.result({
  "duration": 3437055282,
  "status": "passed"
});
formatter.after({
  "duration": 1666337519,
  "status": "passed"
});
});