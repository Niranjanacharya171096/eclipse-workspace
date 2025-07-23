class Animal {
  public void see() {
    System.out.println("Animal See");
  }

  public void run() {
    System.out.println("Animal Run");
    walk(); // first looks for child class walk();
  }

  public void walk() {
    System.out.println("Animal Walk");
    see(); // first looks for child class see();
  }
}

class Dog extends Animal {
  public void bite() {
    System.out.println("Dog Bite");
  }

  @Override
  public void see() {
    System.out.println("Dog See");
  }

  @Override
  public void run() {
    System.out.println("Dog Run");
    super.run();
  }

  @Override
  public void walk() {
    System.out.println("Dog Walk");
    super.walk();
  }
}

class Cat extends Animal {
  @Override
  public void run() {
    System.out.println("Cat Run");
    super.run();
  }

  @Override
  public void walk() {
    System.out.println("Cat Walk");
    super.walk();
  }
}

public class Inheritence {
  public static void main(String[] args) {
    System.out.println("===Animal Object===");
    Animal a1 = new Animal();
    a1.run();

    System.out.println("===Dog Object===");
    Dog d1 = new Dog();
    d1.run();
    d1.see();
    d1.bite();

    System.out.println("===Dog Object upcasted to Animal===");
    Animal a2 = new Dog();
    a2.run(); // overridden run()
    a2.see();
// a2.bite(); //CE: is undefined for the type Animal

    System.out.println("===Animal Object downcasted to Dog===");
    Dog d2 = (Dog) (a2); // must upcast before downcasting
    d2.run();
    d2.bite();
    d2.see();

    System.out.println("============");
    System.out.println(a1 instanceof Animal);
    System.out.println(d1 instanceof Dog);
    System.out.println(a2 instanceof Animal);
    System.out.println(a2 instanceof Dog);
    System.out.println(a2 instanceof Cat);
    System.out.println(d2 instanceof Animal);
    System.out.println(d2 instanceof Dog);
  }
}

//Output:
/*
 * ===Animal Object=== Animal Run Animal Walk Animal See ===Dog Object=== Dog
 * Run Animal Run Dog Walk Animal Walk Dog See Dog See Dog Bite ===Dog Object
 * upcasted to Animal=== Dog Run Animal Run Dog Walk Animal Walk Dog See Dog See
 * ===Animal Object downcasted to Dog=== Dog Run Animal Run Dog Walk Animal Walk
 * Dog See Dog Bite Dog See ============ true true true true false true true
 */