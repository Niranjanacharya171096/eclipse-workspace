/*Write java program for the below [write code in notepad: complete in given time]

Create an abstract Character Class:
- create a private variable NAME
- create a protected variable MAX_HEALTH, default it to 10.
- create a protected variable HEALTH, default it to MAX_HEALTH.
- create a constructor that takes one parameter and assign it to NAME.
- create getters/setters for NAME.
- create a public abstract method named examine.
 
Create a Warrior class that inherits Character Class:
- create a private variable STRENGTH_NUM
- create 2 constructors:
- Default constructor that sets the name to "Vannaka"
- A constructor that takes in 3 parameters:
- NAME and assign it to NAME
- HEALTH and assign it to HEALTH.
- STRENGTH and assign it to STRENGTH.
 
- create 2 methods:
- create a public void heal method that takes in an int parameter named hpHealed
- add hpHealed to HEALTH
- create a public void takeDamage method that takes in an int parameter named dmgTaken
- subtract dmgTaken from HEALTH
 
- Create examine method to print out "My name is [NAME]":
- NAME should be the character's NAME variable
 
 
Create a Game Class:
- create a main method:
- Instantiate a Warrior class with a name, health set at 100 and strength set at 50
- Have the warrior take 99 damage
- Have the warrior heal 20 health
- Have the warrior call examine*/



abstract class Character {
  private String name;
  protected int MAX_HEALTH = 10;
  protected int health = MAX_HEALTH;

  public Character(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void examine();
}

class Warrior extends Character {
  private int strength;

  public Warrior() {
    super("Vannaka");
  }

  public Warrior(String name, int health, int strength) {
    super(name);
    this.health = health;
    this.strength = strength;
  }

  public void heal(int hpHealed) {
    this.health += hpHealed;
    System.out.println(getName() + " healed by " + hpHealed + " points. Current health: " + health);
  }

  public void takeDamage(int dmgTaken) {
    this.health -= dmgTaken;
    System.out.println(getName() + " took " + dmgTaken + " damage. Current health: " + health);
  }

  @Override
  public void examine() {
    System.out.println("My name is " + getName());
  }
}

public class Abstraction {
  public static void main(String[] args) {
    Warrior warrior = new Warrior("Arthas", 100, 50);
    warrior.takeDamage(99);
    warrior.heal(20);
    warrior.examine();
  }
}
