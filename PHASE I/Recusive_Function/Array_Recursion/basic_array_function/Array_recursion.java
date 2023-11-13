package Recusive_Function.Array_Recursion;

import java.util.*;

public class Array_recursion {
    static void createArray(int n, int[] arr) {
        if (n <= 0) {
            return;
        }
        Scanner inp = new Scanner(System.in);
        createArray(n - 1, arr);
        int temp = inp.nextInt();
        arr[n - 1] = temp;
    }

    static void print_Array(int n, int[] arr) {
        if (n <= 0) {
            return;
        }
        print_Array(n - 1, arr);
        System.out.println(arr[n - 1]);

    }

    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
        int[] arr = new int[n];
        createArray(n, arr);
        System.out.println("The Array has Obtained");
        print_Array(n, arr);
    }

}
