package Assignments Lab 4;

// Superclass Animal
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class to test the overriding
public class AnimalSoundTest {
    public static void main(String[] args) {
        // Create objects of each class
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Display the sounds each animal makes
        genericAnimal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}

