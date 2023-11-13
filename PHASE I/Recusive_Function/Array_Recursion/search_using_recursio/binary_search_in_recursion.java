package Recusive_Function.Array_Recursion.search_using_recursio;

import java.util.Scanner;

public class binary_search_in_recursion {
    public static void create_array(int[] arr) {
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
    }

    public static int binary_search(int[] arr, int indexs, int indexe, int target) {

        int mid = arr.length / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] >= target) {
            return binary_search(arr, 0, mid - 1, target);
        }
        if (arr[mid] < target) {
            return binary_search(arr, mid + 1, arr.length - 1, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        create_array(arr);
        int target = inp.nextInt();
        int index = binary_search(arr, 0, arr.length - 1, target);
        System.out.println(index);

    }

}
