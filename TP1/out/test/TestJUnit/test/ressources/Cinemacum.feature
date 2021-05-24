@tag
Feature: Creer un cinema
  En tant que gestionnaire du cinema
  je veux ajouter de nouvelles salles avec un nombre de places connu.
  Et aussi calculer le nombre total de places du cinema.


  Scenario Outline: ajouter des salles
    Given un cinema
    And une salle de <n1> places et une autre de <n2> places
    When les salles sont ajoutees
    Then le total des places de cinema est <total>

    Examples:
      | n1 | n2 | total |
      | 60 | 40 | 100 |



















