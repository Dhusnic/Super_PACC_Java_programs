package OOPS.Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        Circle circle = new Circle( 5.0);
        Rectangle rectangle = new Rectangle( 4.0, 6.0);

       
        System.out.println("Area of Circle: " + circle.calculateArea());

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
    
}
// Abstract class
abstract class Shape {

    // Abstract method (no implementation)
    public abstract double calculateArea();

    // Concrete method
    public void display() {
        System.out.println("This is a " + " shape.");
    }
}

// Concrete subclass
class Circle extends Shape {
    private double radius;

    public Circle( double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}


