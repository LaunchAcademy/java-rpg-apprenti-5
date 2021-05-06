import java.util.ArrayList;
import java.util.List;

public class Character {
  private String name;

  private String currentWeapon;
  private int maxHitpoints;

  private int currentHitpoints;

  public Character(String name, int maxHitpoints, String currentWeapon) {
    this.name = name;
    this.maxHitpoints = maxHitpoints;
    this.currentHitpoints = maxHitpoints;
    this.currentWeapon = currentWeapon;
  }

  public String getStatus() {
    StringBuilder sb = new StringBuilder();
    sb.append(name);
    sb.append("\n");
    sb.append("Health: ");
    sb.append(this.currentHitpoints);
    sb.append(" / ");
    sb.append(this.maxHitpoints);
    sb.append("\nCurrent Weapon: ");
    sb.append(this.currentWeapon);
    return sb.toString();
  }

  public String getName() {
    return this.name;
  }

  public int getMaxHitpoints() {
    return this.maxHitpoints;
  }

  public void setMaxHitpoints(int newMaxHitpoints) {
    this.maxHitpoints = newMaxHitpoints;
  }

  public int getCurrentHitpoints() {
    return currentHitpoints;
  }

  public String getCurrentWeapon() {
    return currentWeapon;
  }

  public void setCurrentWeapon(String currentWeapon) {
    this.currentWeapon = currentWeapon;
  }

  public static void main(String[] args) {
    Character zelda = new Character("Zelda", 100, "Staff");
    Character link = new Character("Link", 50, "Sword");
    NonplayerCharacter gannon = new NonplayerCharacter("Gannon", 200, "Staff");
    Wizard gandalf = new Wizard("Gandalf", 300, "Staff");

    List<Character> party = new ArrayList<Character>();
    party.add(zelda);
    party.add(link);
    party.add(gannon);
    party.add(gandalf);

    for(Character character : party) {
      character.takeDamage(20);
      System.out.println(character.getStatus());
    }

  }

  public void takeDamage(int damageAmount) {
    this.currentHitpoints = this.currentHitpoints - damageAmount;
  }
}
