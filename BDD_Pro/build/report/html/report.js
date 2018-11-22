$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("first.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login Functionality",
  "description": "",
  "id": "test-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Test with valid credentials",
  "description": "",
  "id": "test-login-functionality;test-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter username",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "TC1.user_is_on_login_page()"
});
formatter.result({
  "duration": 20137674964,
  "status": "passed"
});
formatter.match({
  "location": "TC1.user_enter_username()"
});
formatter.result({
  "duration": 588332658,
  "status": "passed"
});
formatter.match({
  "location": "TC1.user_enter_password()"
});
formatter.result({
  "duration": 106530683,
  "status": "passed"
});
formatter.match({
  "location": "TC1.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 3371145355,
  "status": "passed"
});
});