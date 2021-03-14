Feature: US_00003
# The second example has three steps
  Scenario Outline : Breaker joins a game
    Given un animal avec <poids> et  <vitesse>


    Examples:
      | poids | vitesse |
      | 5     | 7       |