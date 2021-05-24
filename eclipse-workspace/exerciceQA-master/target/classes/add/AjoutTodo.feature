@ajouttodo
Feature: Ajout ToDo
  en tant que utilisateur je veux ajouter une tache

  Background: 
    Given j'ouvre l'application todolist
    When Je saisie le mail "test@test.com"
    And Je saisie le mot de passe "test"
    And Je clique sur le bouton Envoyer
    Then Redirection vers la page tasks "http://localhost:3000/tasks"

  @ajouttodo0
  Scenario: Ajouter une tache- cas passant
    When Je saisie le nom de la tâche "task1"
    And Je saisie la description de la tâche en une ligne "todoTask"
    And Je clique sur le bouton Ajouter la tâche
    Then une tache doit etre ajouter dans la liste des taches

  @failedajouttodo
  Scenario: Ajouter une tache- cas non passant
    When Je ne remplis aucun champ
    Then verifier que le bouton ajouter n'est pas activé

  @failedajouttodo1
  Scenario: Ajouter une tache- cas non passant
    When Je ne saisie pas le nom de la tache
    And Je saisie la description de la tâche en une ligne "todoTask"
    Then verifier que le bouton ajouter n'est pas activé

  @failedajouttodo2
  Scenario: Ajouter une tache- cas non passant
    When Je saisie le nom de la tâche "task1"
    And Je ne saisie pas la description de la tâche en une ligne
    Then verifier que le bouton ajouter n'est pas activé
