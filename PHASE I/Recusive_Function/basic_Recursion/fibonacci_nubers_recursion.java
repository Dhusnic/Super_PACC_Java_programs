import java.util.*;

public class fibonacci_nubers_recursion {
    static int fibonacci(int a) {
        if (a < 2) {
            return a;
        }
        // System.out.println(a);

        return fibonacci(a - 1) + fibonacci(a - 2);
        // factorial recurtion
        // return a*fibonacci(a-1);
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int a = inp.nextInt();
            int b = fibonacci(a);
            System.out.println(b);
        }
    }
}
