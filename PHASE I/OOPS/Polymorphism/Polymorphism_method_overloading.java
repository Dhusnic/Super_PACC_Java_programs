package OOPS.Polymorphism;
public class Polymorphism_method_overloading {
    public static void main(String[] args) 
    {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 10);
        int sum2 = calculator.add(15, 20, 25);
        double sum3 = calculator.add(3.5, 2.7);

        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
    }

     
}

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

