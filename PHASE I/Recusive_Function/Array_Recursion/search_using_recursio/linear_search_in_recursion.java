package Recusive_Function.Array_Recursion.search_using_recursio;

import java.util.Scanner;

public class linear_search_in_recursion {
    public static void create_array(int[] arr) {
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
    }

    public static int Search(int[] arr, int index, int target) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }

        else {
            return Search(arr, index + 1, target);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        create_array(arr);
        int target = inp.nextInt();
        int index = Search(arr, 0, target);
        System.out.println(index);

    }

}
