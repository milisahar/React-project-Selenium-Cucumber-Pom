@connexion
Feature: Authentification
  En tant que utilisateur je souhaite m'authantifier

  @cnx
  Scenario: Vérifier l'authentification- cas passant
    Given j'ouvre l'application todolist
    When Je saisie le mail "test@test.com"
    And Je saisie le mot de passe "test"
    And Je clique sur le bouton Envoyer
    Then Redirection vers la page tasks "http://localhost:3000/tasks"

  @failedcnx
  Scenario: Vérifier l'authentification- cas non passant
    Given j'ouvre l'application todolist
    When Je ne saisie pas le mail
    And Je ne saisie pas le mot de passe
    Then verifier que le bouton Envoyer n'est pas activé

  @failedcnx1
  Scenario: Vérifier l'authentification- cas non passant
    Given j'ouvre l'application todolist
    When Je saisie le mail "test@test.com"
    And Je ne saisie pas le mot de passe
    Then verifier que le bouton Envoyer n'est pas activé

  @failedcnx2
  Scenario: Vérifier l'authentification- cas non passant
    Given j'ouvre l'application todolist
    When Je ne saisie pas le mail
    And Je saisie le mot de passe "test"
    Then verifier que le bouton Envoyer n'est pas activé
    
