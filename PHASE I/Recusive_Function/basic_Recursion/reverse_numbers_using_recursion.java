
import java.util.Scanner;

public class reverse_numbers_using_recursion {
    public static int reverse(int number, int reversed) {
        if (number == 0) {
            return reversed;
        }
        reversed = reversed * 10 + number % 10;
        return reverse(number / 10, reversed);
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int number = inp.nextInt(); // Replace this with your desired number
            int reversed = reverse(number, 0);
            System.out.println("Reversed number: " + reversed);
        }
    }
}
