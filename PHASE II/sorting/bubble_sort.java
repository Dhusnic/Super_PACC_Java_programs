package sorting;

import java.util.*;

public class bubble_sort {
    static int[] Bubble_Sorted_Array(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // int temp = arr[j];
                    // arr[j] = arr[j + 1];
                    // arr[j + 1] = temp;
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void print_Array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int n = inp.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = inp.nextInt();
            }
            int[] s_arr = new int[n];
            s_arr = Bubble_Sorted_Array(arr);
            print_Array(s_arr);

        }
    }

}
