@tag
Feature: US_0003: En tant que développeur, je souhaite que mon objet animal gagne en vitesse et en poids en mangeant une quantitee de nourriture.

  Scenario Outline : Mon animal doit augmenter son poids et ça vitesse d'un taux de gras en  mangeant une quantite de nourriture avec un taux de gras connue
    Given un animal
    And avec <poids> et <vitesse>
    And On donne la nouriture <nomNouriture> <TauxDeGras>
    When l'animal mange une <quantite> de nouriture
    Then le poids de l'animal devient <nouveauPoids> et la vitesse devient <nouvelleVitesse>
    Examples:
      | poids | vitesse | nomNouriture |TauxDeGras|quantite|nouveauPoids|nouvelleVitesse
      | 15    | 20      | "viande"     |5         | 10     |15          |25


  Scenario Outline :je souhaite que mon animal manges toutes les nourritures dans la liste de nourriture qu'il dispose.
    Given un animal
    And avec <poids> et <vitesse>
    And On donne la nouriture <nomNouriture> <TauxDeGras>
    And On ajoute la nouriture <nomNouriture2> <TauxDeGras2>
    When l'animal mange une <quantite> de nouriture
    Then le poids de l'animal devient <nouveauPoids> et la vitesse devient <nouvelleVitesse>
    Examples:
      | poids | vitesse | nomNouriture |TauxDeGras|quantite|nouveauPoids|nouvelleVitesse
      | 15    | 20      | "viande"     |5         | 10     |15          |25

  Scenario Outline : je souhaite que ma classe animal m'indique qu'il nya pas de nourriture quand mon animal mange.
    Given un animal
    And avec <poids> et <vitesse>
    When l'animal mange une <quantite> de nouriture
    Then l'animal me signale qu'il ne dispose pas de nourrriture
    Examples:
      | poids | vitesse |quantite
      | 15    | 20      | 10