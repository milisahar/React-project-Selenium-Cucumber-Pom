$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("navbar/Navbar.feature");
formatter.feature({
  "line": 2,
  "name": "Navbar",
  "description": "en tant que utilisateur je souhaite vérifier que es liens Tâches et Déconnexion apparaissent.",
  "id": "navbar",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@navbar"
    }
  ]
});
formatter.before({
  "duration": 2390262100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Je souhaite vérifier que es liens Tâches et Déconnexion apparaissent- cas passant",
  "description": "",
  "id": "navbar;je-souhaite-vérifier-que-es-liens-tâches-et-déconnexion-apparaissent--cas-passant",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@navbar1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "j\u0027ouvre l\u0027application todolist",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le mail \"test@test.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisie le mot de passe \"test\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le bouton Envoyer",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Redirection vers la page tasks \"http://localhost:3000/tasks\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "les liens Tâches et Déconnexion sont bien affiches",
  "keyword": "And "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jOuvreLApplicationTodolist()"
});
formatter.result({
  "duration": 1695343600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 19
    }
  ],
  "location": "AuthentificationStepDefinition.jeSaisieLeMail(String)"
});
formatter.result({
  "duration": 513095500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 27
    }
  ],
  "location": "AuthentificationStepDefinition.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "duration": 56572600,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBoutonEnvoyer()"
});
formatter.result({
  "duration": 66696800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:3000/tasks",
      "offset": 32
    }
  ],
  "location": "AuthentificationStepDefinition.redirectionVersLaPageTasks(String)"
});
formatter.result({
  "duration": 6851300,
  "status": "passed"
});
formatter.match({
  "location": "NavbarStepDef.lesLiensTchesEtDconnexionSontBienAffiches()"
});
formatter.result({
  "duration": 47921900,
  "status": "passed"
});
formatter.after({
  "duration": 1396217400,
  "status": "passed"
});
formatter.before({
  "duration": 1772775400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Je souhaite vérifier que es liens Tâches et Déconnexion apparaissent- cas passant",
  "description": "",
  "id": "navbar;je-souhaite-vérifier-que-es-liens-tâches-et-déconnexion-apparaissent--cas-passant",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@navbar2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "j\u0027ouvre l\u0027application todolist",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "les liens Tâches et Déconnexion ne sont pas affiches",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jOuvreLApplicationTodolist()"
});
formatter.result({
  "duration": 1929296500,
  "status": "passed"
});
formatter.match({
  "location": "NavbarStepDef.lesLiensTchesEtDconnexionNeSontPasAffiches()"
});
formatter.result({
  "duration": 29107600,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertFalse(Assert.java:64)\r\n\tat org.junit.Assert.assertFalse(Assert.java:74)\r\n\tat com.exercice.e2eTests.navbar.stepDef.NavbarStepDef.lesLiensTchesEtDconnexionNeSontPasAffiches(NavbarStepDef.java:35)\r\n\tat ✽.Then les liens Tâches et Déconnexion ne sont pas affiches(navbar/Navbar.feature:17)\r\n",
  "status": "failed"
});
formatter.write("Current page url is http://localhost:3000/");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1415530400,
  "status": "passed"
});
});