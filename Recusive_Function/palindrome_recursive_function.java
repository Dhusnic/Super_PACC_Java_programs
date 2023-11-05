package Recusive_Function;

import java.util.Scanner;

public class palindrome_recursive_function {
    public static boolean palindrome(int r, int number) {
        if (r == number) {
            return true;
        } else {
            return false;
        }
    }

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
            if (palindrome(reversed, number)) {
                System.out.println("It is a palindrome");
            } else {
                System.out.println("It is not a Palindrome");
            }
        }
    }
}
