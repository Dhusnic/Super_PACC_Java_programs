package Recusive_Function;

import java.util.*;

public class Factorial_Recursive_Function {
    public static long facto(int n) {
        if (n != 0 && n != 1) {
            return n * facto(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("ENTER THE INTEGER :   ");
            int b = inp.nextInt();
            long c = facto(b);
            System.out.print("THE FACTORIAL VALUE OF INTEGER IS : ");
            System.out.println(c);
        }

    }
}
