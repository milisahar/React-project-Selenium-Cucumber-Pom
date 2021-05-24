@navbar
Feature: Navbar
  en tant que utilisateur je souhaite vérifier que es liens Tâches et Déconnexion apparaissent.

  @navbar1
  Scenario: Je souhaite vérifier que es liens Tâches et Déconnexion apparaissent- cas passant
    Given j'ouvre l'application todolist
    When Je saisie le mail "test@test.com"
    And Je saisie le mot de passe "test"
    And Je clique sur le bouton Envoyer
    Then Redirection vers la page tasks "http://localhost:3000/tasks"
    And les liens Tâches et Déconnexion sont bien affiches

  @navbar2
  Scenario: Je souhaite vérifier que es liens Tâches et Déconnexion apparaissent- cas passant
    Given j'ouvre l'application todolist
    Then les liens Tâches et Déconnexion ne sont pas affiches
