package sorting;

import java.util.*;

public class selection_sort {
    static int[] Selection_Sorted_Array(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minj = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minj = j;
                }

            }
            // temp = arr[i];
            // arr[i] = arr[minj];
            // arr[minj] = temp;
            swap(arr, i, minj);
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
            s_arr = Selection_Sorted_Array(arr);
            print_Array(s_arr);

        }
    }

}
