package searching;

import java.util.Scanner;

public class linear_search {
    static void Linear_search(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println(arr[i] + " is present in " + (i + 1) + " th position of the array ");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int n = inp.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = inp.nextInt();
            }
            int k = inp.nextInt();
            Linear_search(arr, k);
        }
    }

}
