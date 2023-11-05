package OOPS.Polymorphism;

public class Polymorphism_method_overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Calls the Animal class's makeSound
        myDog.makeSound();    // Calls the Dog class's makeSound
        myCat.makeSound();    // Calls the Cat class's makeSound
    }
    
}
class Animal {
    void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

