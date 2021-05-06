import java.util.Random;

public class Wizard extends Character {
  public Wizard(String name, int maxHitpoints, String currentWeapon) {
    super(name, maxHitpoints, currentWeapon);
  }

  public void takeDamage(int damageAmount) {
    Random randomGenerator = new Random();
    int roll = randomGenerator.nextInt(4);
    //wizard has a 25% shot at not taking damage / healing from the damage
    if(roll != 0) {
      super.takeDamage(damageAmount);
    }
  }
}
