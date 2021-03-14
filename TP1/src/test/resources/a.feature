@tag
Feature: US_00003
 Scenario Outline : Breaker joins a game
    Given un animal
    And avec <poids> et <vitesse>
    Then verifiee
 Examples:
   | poids | vitesse |
   | 15    | 20      |

