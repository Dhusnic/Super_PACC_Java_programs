package sorting;

import java.util.*;

public class merge_sort {
    static int[] Merge_Sorted_Array(int[] arr) {
        int inputlength = arr.length;
        if (inputlength < 2) {
            return arr;

        }
        int midi = inputlength / 2;
        int[] left_half = new int[midi];
        int[] right_half = new int[inputlength - midi];
        for (int i = 0; i < midi; i++) {
            left_half[i] = arr[i];
        }
        for (int i = midi; i < inputlength; i++) {
            right_half[i - midi] = arr[i];
        }
        Merge_Sorted_Array(left_half);
        Merge_Sorted_Array(right_half);
        merge(arr, left_half, right_half);
        return arr;

    }

    private static void merge(int[] arr, int[] left_half, int[] right_half) {
        int left_half_size = left_half.length;
        int right_half_size = right_half.length;
        int i = 0, j = 0, k = 0;
        while (i < left_half_size && j < right_half_size) {
            if (left_half[i] <= right_half[j]) {
                arr[k] = left_half[i++];
            } else {
                arr[k] = right_half[j++];
            }
            k++;
        }
        while (i < left_half_size) {
            arr[k++] = left_half[i++];
        }
        while (j < right_half_size) {
            arr[k++] = right_half[j++];

        }
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
            s_arr = Merge_Sorted_Array(arr);
            print_Array(s_arr);

        }
    }

}
