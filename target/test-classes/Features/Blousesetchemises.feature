#Author:Syrine
Feature: Chemises&Blouses mabrouk

  Scenario: Cliquer sur un produit
    Given utilsateur est sur la page "Chemises & Blouses"
    When utilisateur clique sur un produit "CHEMISE ISRA"
    Then la page de produit est affiche "CHEMISE ISRA"
    And le produit "CHEMISE ISRA" ajouté au panier
