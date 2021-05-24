@authmsg
Feature: Ajout ToDo
  en tant que utilisateur je  souhaite m'authantifier

  @authmsg1
  Scenario: Ajouter une tache- cas passant
    Given j'ouvre l'application todo
    When Je saisie l'addresse email "test222@test.com"
    And Je saisie le mtp "test22"
    And Je clique sur Envoyer
    Then Je verifie la presence de message d'erreur
