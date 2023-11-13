package Recusive_Function.Array_Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Return_Array_Recursion {
    static void createArray(int n, int[] arr) {
        if (n <= 0) {
            return;
        }
        Scanner inp = new Scanner(System.in);
        createArray(n - 1, arr);
        int temp = inp.nextInt();
        arr[n - 1] = temp;
    }

    static ArrayList<Integer> find_element(int[] arr) {
        Scanner inp = new Scanner(System.in);
        int target = inp.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                arr1.add(i + 1);
            }
        }
        return arr1;
    }

    // return arr1;
    // }

    // static ArrayList<Integer> find_element(int[] arr, int index, int target,
    // ArrayList<Integer> list) {
    // if (index == arr.length) {
    // return list;
    // }
    // if (arr[index] == target) {
    // list.add(index);
    // }
    // return find_element(arr, index + 1, target, list);
    // }

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
        // System.out.println(find_element(arr, 0, 5, new ArrayList<>()));
        System.out.println(find_element(arr));
    }
}
