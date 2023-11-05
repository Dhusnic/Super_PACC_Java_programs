package simple_problems;

import java.util.*;

public class Rotating_Array {
    public static void main(String[] args) {
        Array ar = new Array();
        ar.creating_Array();
        try (Scanner inp = new Scanner(System.in)) {
            int k = inp.nextInt();

        }
    }

}

/**
 * creating_Array
 */
class Array {
    int size;

    public int[] creating_Array() {
        System.out.println("Enter the size of array");
        try (Scanner inpScanner = new Scanner(System.in)) {
            size = inpScanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter the elements of Array");
            for (int i = 0; i < size; i++) {
                arr[i] = inpScanner.nextInt();
            }
            return arr;

        }
    }

    public int[] Ro_ar(int[] arr1, int k) {

        int[] arr2 = new int[size];
        if (k > size) {
            k = k % size;
        }
        for (int i = 0; i < k; i++) {
            int temp = arr1[size - 1];

        }
        return arr2;

    }

}