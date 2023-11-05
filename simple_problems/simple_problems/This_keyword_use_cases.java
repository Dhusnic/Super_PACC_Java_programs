package simple_problems;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        // Use 'this' to differentiate between instance variables and constructor
        // parameters.
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

}

public class This_keyword_use_cases {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        person1.displayDetails();
        person2.displayDetails();
    }

}
