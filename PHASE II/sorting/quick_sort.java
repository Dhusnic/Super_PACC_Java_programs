package sorting;

import java.util.Scanner;

public class quick_sort {
    static int[] Quick_Sorted_Array(int[] arr, int start_index, int end_index) {
        int n = end_index;
        if (n == 1 || start_index >= end_index)
            return arr;
        int pivot = arr[end_index];
        int left = start_index;
        int right = end_index;
        while (left < right) {
            while (arr[left] <= pivot && left < right) {
                left++;
            }
            while (arr[right] >= pivot && left < right) {
                right--;
            }
            swap(arr, left, right);

        }
        swap(arr, left, end_index);
        Quick_Sorted_Array(arr, start_index, left - 1);
        Quick_Sorted_Array(arr, left + 1, end_index);

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
            s_arr = Quick_Sorted_Array(arr, 0, n - 1);
            print_Array(s_arr);

        }
    }
}
