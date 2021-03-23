$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MainMenuPage.feature");
formatter.feature({
  "name": "Main Menu WebElements",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Main menu logo and texts verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mainMenu"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "proqa.stepDef.MainMenuStepDef.userIsOnHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies the logo and texts on main menu",
  "keyword": "Then "
});
formatter.match({
  "location": "proqa.stepDef.MainMenuStepDef.verifiesTheLogoAndTextsOnMainMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});