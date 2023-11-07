package Dynamic_Programing_in_java;

import java.util.*;

public class fibonaci_series_java_Rf_Dp {
    private static HashMap<Integer, Long> memoization = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memoization.containsKey(n)) {
            return memoization.get(n);
        }

        long result = fibonacci(n - 1) + fibonacci(n - 2);
        memoization.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int n = inp.nextInt(); // Change this to compute Fibonacci(n)
            long result = fibonacci(n);
            System.out.println("Fibonacci(" + n + ") = " + result);
        }
    }

}
