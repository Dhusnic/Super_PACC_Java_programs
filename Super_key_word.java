public class Super_key_word {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.displayDetails();
        myDog.makeSound();
    }
}



class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Calls the constructor of the superclass 'Animal'
        this.breed = breed;
    }

    void makeSound() {
        super.makeSound(); // Calls the 'makeSound' method of the superclass 'Animal'
        System.out.println("Dog barks");
    }

    void displayDetails() {
        System.out.println("Name: " + super.name); // Accesses the 'name' field of the superclass 'Animal'
        System.out.println("Breed: " + this.breed);
    }
}


