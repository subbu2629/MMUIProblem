$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Mass Mutual Round2 Test",
  "description": "",
  "id": "mass-mutual-round2-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "UI Automation using Java",
  "description": "",
  "id": "mass-mutual-round2-test;ui-automation-using-java",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User logs into the portal",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user verifies all the details",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the value count should be 5",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "all the values on the screen should be greater than zero",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "values should be formatted as currencies",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the total balance should be correct based on the listed values",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDemoSteps.user_logs_into_the_portal()"
});
formatter.result({
  "duration": 6184705700,
  "status": "passed"
});
formatter.match({
  "location": "LoginDemoSteps.user_verifies_all_the_details()"
});
formatter.result({
  "duration": 100100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "LoginDemoSteps.the_value_count_should_be(int)"
});
formatter.result({
  "duration": 2888200,
  "status": "passed"
});
formatter.match({
  "location": "LoginDemoSteps.all_the_values_on_the_screen_should_be_greater_than_zero()"
});
formatter.result({
  "duration": 107419000,
  "status": "passed"
});
formatter.match({
  "location": "LoginDemoSteps.values_should_be_formatted_as_currencies()"
});
formatter.result({
  "duration": 40037600,
  "status": "passed"
});
formatter.match({
  "location": "LoginDemoSteps.the_total_balance_should_be_correct_based_on_the_listed_values()"
});
formatter.result({
  "duration": 74334400,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat com.mm.qa.stepDefinitions.LoginDemoSteps.the_total_balance_should_be_correct_based_on_the_listed_values(LoginDemoSteps.java:57)\r\n\tat ✽.Then the total balance should be correct based on the listed values(src/test/resources/Features/login.feature:9)\r\n",
  "status": "failed"
});
});