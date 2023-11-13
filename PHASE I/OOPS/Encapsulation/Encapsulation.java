package OOPS.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alice", 20);

        // Access and modify private variables using getter and setter methods
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());

        student.setName("Bob");
        student.setAge(22);

        System.out.println("Updated student name: " + student.getName());
        System.out.println("Updated student age: " + student.getAge());

        // Demonstrate encapsulation by trying to set an invalid age
        student.setAge(-5);
    }
}
class Student {
    private String name; // Private instance variable
    private int age;     // Private instance variable

    // Constructor to initialize the student object
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to access the 'name' variable
    public String getName() {
        return name;
    }

    // Setter method to modify the 'name' variable
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to access the 'age' variable
    public int getAge() {
        return age;
    }

    // Setter method to modify the 'age' variable
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}


