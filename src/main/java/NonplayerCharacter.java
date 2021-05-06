public class NonplayerCharacter extends Character {
  public NonplayerCharacter(String name, int maxHitpoints, String currentWeapon) {
    super(name, maxHitpoints, currentWeapon);
  }

  public String getStatus() {
    return "(NONPLAYER)\n" + super.getStatus();
  }

  public String evilLaugh() {
    return "muhahahahahahahahaha";
  }
}
