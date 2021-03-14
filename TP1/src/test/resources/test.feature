Feature: US_0003

   Scenario Outline: Mon animal doit augmenter son poids et ça vitesse d'un taux de gras en  mangeant une quantite de nourriture avec un taux de gras connue
      Given un animal
      And avec <poids> et <vitesse>
      And On donne la nouriture <nomNouriture> et <TauxDeGras>
      When l'animal mange une <quantite> de nouriture
      Then le poids de l'animal devient <nouveauPoids> et la vitesse devient <nouvelleVitesse>

      Examples:
        | poids | vitesse | nomNouriture |TauxDeGras|quantite|nouveauPoids|nouvelleVitesse|
        |5      |10       |viande        |5         |10      |15          |25             |
        |5      |10       |herbe         |8         |10      |15          |25             |
        |5      |10       |viande        |5         |10      |15          |25             |
        |5      |10       |viande        |5         |10      |15          |25             |
        |5      |10       |viande        |5         |10      |15          |25             |

