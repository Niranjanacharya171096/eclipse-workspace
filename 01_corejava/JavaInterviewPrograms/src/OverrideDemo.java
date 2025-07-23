//Define a base class Animal with a method makeSound().
// Create subclasses Dog and Cat that override makeSound() to print "Woof" and "Meow" respectively.
// Demonstrate polymorphic behavior in main.

class Animal1 {
  public void makeSound() {
    System.out.println("Animal makeSound");
  }
}

class Dog1 extends Animal1 {
  @Override
  public void makeSound() {
    System.out.println("Woof");
  }
}

class Cat1 extends Animal1 {
  @Override
  public void makeSound() {
    System.out.println("Meow");
  }
}

class OverrideDemo {
  public static void main(String[] args) {
    Animal1[] animals = { new Dog1(), new Cat1(), new Animal1() };
    for (Animal1 animal : animals) {
      animal.makeSound();
    }
  }
}
