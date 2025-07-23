package _01_practicePrograms;
//Define a base class Animal with a method makeSound(). 
// Create subclasses Dog and Cat that override makeSound() to print "Woof" and "Meow" respectively. 
// Demonstrate polymorphic behavior in main.

class Animal {
    public void makeSound() {
        System.out.println("Animal makeSound");
    }
}

class Dog extends Animal {
    @Override 
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal{
    @Override 
    public void makeSound() {
        System.out.println("Meow");
    }
}

class OverrideDemo {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Animal() };
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}