$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Google search engine FEATURE",
  "description": "",
  "id": "google-search-engine-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17227441100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Google input data Test Sceraio",
  "description": "",
  "id": "google-search-engine-feature;google-input-data-test-sceraio",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@GoogleTest_001"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is already on Google page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User input \u0027New York\u0027 data in google empty box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on search key",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is search home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_is_already_on_Google_page()"
});
formatter.result({
  "duration": 5335754300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 12
    }
  ],
  "location": "LoginSteps.user_input_New_York_data_in_google_empty_box(String)"
});
formatter.result({
  "duration": 155034300,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginSteps.user_is_search_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 18499,
  "status": "passed"
});
});