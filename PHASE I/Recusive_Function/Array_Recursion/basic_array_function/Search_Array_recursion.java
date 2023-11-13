package Recusive_Function.Array_Recursion;

import java.util.*;

public class Search_Array_recursion {

    static void createArray(int n, int[] arr) {
        if (n <= 0) {
            return;
        }
        Scanner inp = new Scanner(System.in);
        createArray(n - 1, arr);
        int temp = inp.nextInt();
        arr[n - 1] = temp;
    }

    static boolean search(int[] arr, int k, int i) {
        if (i == arr.length - 1) {
            return false;
        }
        return arr[i] == k || search(arr, k, i + 1);
    }

    static int search_Index(int arr[], int k, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == k) {
            return i;
        } else {
            return search_Index(arr, k, i + 1);
        }
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
        System.out.print("Enter The Element want to be searched = ");
        int k = inp.nextInt();
        System.out.println(search(arr, k, 0));
        if (search(arr, k, 0)) {
            System.out.println(search_Index(arr, k, k) + 1);
        }
    }

}
