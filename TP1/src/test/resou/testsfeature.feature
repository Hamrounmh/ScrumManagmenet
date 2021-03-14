Feature: US_00003
  Scenario Outline : Breaker joins a game
    Given un animal
    And avec <poids> et <vitesse>
    And On donne la nouriture <nomNouriture> <TauxDeGras>
    When l'animal mange nouriture
    Then le poids de l'animal devient <nouveauPoids> et la vitesse devient <nouvelleVitesse>
    Examples:
      | poids | vitesse | nomNouriture |TauxDeGras|nouveauPoids|nouvelleVitesse
      | 15    | 20      | "viande"     |5         |15          |25