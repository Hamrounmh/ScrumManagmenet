Feature: US_0004

  Scenario Outline: mon documentaire est de type animalier si il contient des animaux
    Given  un documentaire
    And un film avec un <nom> et une <horaire>
    And une chaine <chaineDeCreation>
    And un Animal avec <poids> et <vitesse>
    When l'animal est ajouté
    Then le Documentaire devient un Documentaire <Animalier>

    Examples:
      | nom                                       |horaire  |chaineDeCreation  |poids|vitesse|Animalier|
      |Nos Animaux et nous                        | 20h:50  |ARTE              |10   |  75   | true    |
      |les mystres de la vie sur la planete Terre | 13h:30  |TF1               |80   |  50   | true    |

