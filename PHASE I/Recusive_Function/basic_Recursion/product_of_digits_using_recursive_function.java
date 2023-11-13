
import java.util.Scanner;

public class product_of_digits_using_recursive_function {
    public static int sum_of_digit(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) * sum_of_digit(n / 10);
        }
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int n = inp.nextInt();
            int a = sum_of_digit(n);
            System.out.println(a);
        }
    }
}