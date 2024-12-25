#Author: Syrine
Feature: HomePage Mabrouk

  Scenario: selectionner un menu de la page dacceuil
    Given utilisateur est sur la page dacceuil
    When utilisateur survole la souris sur le menu "Femme"
    And utilisateur clique sur le submenu "Chemises & Blouses"
    Then utilisateur est derige vers la page produit "Chemises & Blouses"
