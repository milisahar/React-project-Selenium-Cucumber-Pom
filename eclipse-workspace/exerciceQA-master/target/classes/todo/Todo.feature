@todo
Feature: Ajout ToDo
  en tant que utilisateur je veux modifier la status d'une tache et la supprimer

  Background: 
    Given j'ouvre l'application todolist
    When Je saisie le mail "test@test.com"
    And Je saisie le mot de passe "test"
    And Je clique sur le bouton Envoyer
    Then Redirection vers la page tasks "http://localhost:3000/tasks"
    When Je saisie le nom de la tâche "task1"
    And Je saisie la description de la tâche en une ligne "todoTask"
    And Je clique sur le bouton Ajouter la tâche
    Then une tache doit etre ajouter dans la liste des taches

  @modiftodo
  Scenario: Modifier la status d'une tache
    When Je clique sur le bouton Non completee
    Then La statut de la tache doit etre modifier

  @deletetodo
  Scenario: Supprimer une tache
    When Je clique sur le bouton Supprimer
    Then Je verifie que la tache est bien supprimee
