$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/CanonReview.feature");
formatter.feature({
  "line": 1,
  "name": "Give a review on Canon",
  "description": "",
  "id": "give-a-review-on-canon",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8337712700,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User add a review to Canon EOS 5D item in Desktops tab",
  "description": "",
  "id": "give-a-review-on-canon;user-add-a-review-to-canon-eos-5d-item-in-desktops-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@FriendsAlwaysgood"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User click on Show all desktops",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User click on Canon EOS 5D item",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on write a review link",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user fill the review information with below information",
  "rows": [
    {
      "cells": [
        "yourname",
        "yourReview",
        "Rating"
      ],
      "line": 18
    },
    {
      "cells": [
        "name",
        "review",
        "Bad or good"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 8444011100,
  "status": "passed"
});
formatter.match({
  "location": "HpLaptopStepDefinition.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 5670847600,
  "status": "passed"
});
formatter.match({
  "location": "HpLaptopStepDefinition.user_click_on_Show_all_desktops()"
});
formatter.result({
  "duration": 4518900000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 24
    }
  ],
  "location": "CanonReviewStepDefinition.user_click_on_Canon_EOS_D_item(int)"
});
formatter.result({
  "duration": 6625186100,
  "status": "passed"
});
formatter.match({
  "location": "CanonReviewStepDefinition.user_click_on_write_a_review_link()"
});
formatter.result({
  "duration": 5154732400,
  "status": "passed"
});
formatter.match({
  "location": "CanonReviewStepDefinition.user_fill_the_review_information_with_below_information(DataTable)"
});
formatter.result({
  "duration": 4685032800,
  "status": "passed"
});
formatter.match({
  "location": "CanonReviewStepDefinition.user_click_on_Continue_Button()"
});
formatter.result({
  "duration": 4587385200,
  "status": "passed"
});
formatter.match({
  "location": "CanonReviewStepDefinition.user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval()"
});
formatter.result({
  "duration": 3747884800,
  "status": "passed"
});
formatter.after({
  "duration": 1107999200,
  "status": "passed"
});
});