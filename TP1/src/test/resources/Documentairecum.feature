Feature: US_0004

  Scenario Outline: mon documentaire est de type animalier si il contient des animaux
    Given  un documentaire
    And avec un film
    And avec <
    Given un
    And avec <poids> et <vitesse>
    And On donne la nouriture <nomNouriture> et <TauxDeGras>
    When l'animal mange une <quantite> de nouriture
    Then le poids de l'animal devient <nouveauPoids> et la vitesse devient <nouvelleVitesse>

    Examples:
      | poids | vitesse | nomNouriture |TauxDeGras|quantite|nouveauPoids|nouvelleVitesse|
      |99      |7       |viande        |9         |10      |8910         |9             |
      |5      |56       |herbe         |2         |99      |990          |72            |
      |3      |10       |poivre        |2         |78      |468          |13             |
      |8      |18       |patate        |1         |18      |144          |23             |
