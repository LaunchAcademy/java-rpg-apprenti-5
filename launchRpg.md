# Launch RPG

## Characters

- Characters have:
  * A character name
  * Hitpoints
  * A default weapon
  * a `getStatus`
  * a `takeDamage` method
- Nonplayer Characters have:
  * a `getStatus` that indicates it's a non player character
- A wizard has:
  * Magic Points
  * a `getStatus` that includes their magic points
  * a `takeDamage` method that has a 25% change of healing
