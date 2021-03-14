Feature: US_00003 En tant que développeur, je souhaite que mon objet animal gagne en vitesse et en poids en mangeant une quantitee de nourriture.
  Scenario Outline : Breaker joins a game
    Given un animal
    And avec <poids> et <vitesse>
    And On donne la nouriture <nomNouriture> <TauxDeGras>
    When l'animal mange une <quantite> de nouriture
    Then le poids de l'animal devient <nouveauPoids> et la vitesse devient <nouvelleVitesse>
    Examples:
      | poids | vitesse | nomNouriture |TauxDeGras|quantite|nouveauPoids|nouvelleVitesse
      | 15    | 20      | "viande"     |5         | 10     |15          |25



Feature: US_00004: En tant que testeur, je souhaite que mon animal manges toutes les nourritures dans la liste de nourriture qu'il dispose.
  Scenario Outline : Breaker joins a game
    Given un animal
    And avec <poids> et <vitesse>
    And On donne la nouriture <nomNouriture> <TauxDeGras>
    When l'animal mange une <quantite> de nouriture
    Then le poids de l'animal devient <nouveauPoids> et la vitesse devient <nouvelleVitesse>
    Examples:
      | poids | vitesse | nomNouriture |TauxDeGras|quantite|nouveauPoids|nouvelleVitesse
      | 15    | 20      | "viande"     |5         | 10     |15          |25

Feature: US_00004, En tant que développeur, je souhaite que ma classe animal m'indique qu'il nya pas de nourriture quand mon animal mange.
  Scenario Outline : Breaker joins a game
    Given un animal
    And avec <poids> et <vitesse>
    And On donne la nouriture <nomNouriture> <TauxDeGras>
    When l'animal mange une <quantite> de nouriture
    Then le poids de l'animal devient <nouveauPoids> et la vitesse devient <nouvelleVitesse>
    Examples:
      | poids | vitesse | nomNouriture |TauxDeGras|quantite|nouveauPoids|nouvelleVitesse
      | 15    | 20      | "viande"     |5         | 10     |15          |25