Feature: US_0003

   Scenario Outline: Mon animal doit augmenter son poids et ça vitesse d'un taux de gras en  mangeant une quantite de nourriture avec un taux de gras connue
      Given un animal
      And avec <poids> et <vitesse>
      And On donne la nouriture <nomNouriture> et <TauxDeGras>
      When l'animal mange une <quantite> de nouriture
      Then le poids de l'animal devient <nouveauPoids> et la vitesse devient <nouvelleVitesse>

      Examples:
        | poids | vitesse | nomNouriture |TauxDeGras|quantite|nouveauPoids|nouvelleVitesse|
        |99      |7       |viande        |9         |10      |8910          |8             |
        |5      |56       |herbe         |2         |99      |990          |67            |
        |3      |10       |poivre        |2         |78      |468          |12             |
        |8      |18       |patate        |1         |18      |144         |21             |



  Scenario Outline: Mon animal doit augmenter son poids et ça vitesse d'un taux de gras en  mangeant plusieurs nourriture avec un taux de gras connue
    Given un animal
    And avec <poids> et <vitesse>
    And On donne la nouriture <nomNouriture> et <TauxDeGras>
    And On donne la nouriture <nomNouriture1> et <TauxDeGras1>
    When l'animal mange une <quantite> de nouriture
    Then le poids de l'animal devient <nouveauPoids> et la vitesse devient <nouvelleVitesse>

    Examples:
      | poids | vitesse | nomNouriture |nomNouriture1|TauxDeGras|TauxDeGras1|quantite|nouveauPoids|nouvelleVitesse|
      |99      |7       |viande        |herbe        |9         |2         |10      |10890          |8             |

  Scenario Outline: On donne a l'animal une liste vide de nourriture. quandl'animal mange on doit avoir le message d'erreur Nourriture indisponible
    Given un animal
    When l'animal mange
    Then on a le message d'erreur suivant <message>
    Examples:
     |message          |
     |pas_de_nourriture|

  Scenario: S1
    Given  une nourriture
    And un <nom> et un <TauxDeGras>





