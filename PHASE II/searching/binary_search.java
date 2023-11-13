package searching;

import java.util.*;

public class binary_search {
    static void Binary_search(int[] arr, int k) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = ((end - start) / 2) + start;
            if (arr[mid] == k) {
                System.out.println(arr[mid] + " is present in " + (mid + 1) + " th position of the array ");
                break;

            } else if (mid > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
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
            Binary_search(arr, k);
        }
    }

}
