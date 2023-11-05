package Recusive_Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation_Recurcive_function {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(nums, 0, result);
        return result;
    }

    private static void generatePermutations(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) 
        {
            // If we've reached the end of the array, add the current permutation to the result.
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) 
            {
                permutation.add(num);
            }
            result.add(permutation);
        }  
        else 
        {
            for (int i = index; i < nums.length; i++) {
                // Swap the current element with the element at the current index.
                swap(nums, index, i);
                // Recursively generate permutations for the remaining elements.
                generatePermutations(nums, index + 1, result);
                // Swap back to backtrack and explore other possibilities.
                swap(nums, index, i);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("ENTER THE SIZE OF THE ARRAY :   ");
            int n=inp.nextInt();
            System.out.print("ENTER THE ELEMENTS OF THE ARRAY : ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i]=inp.nextInt();
            }
            List<List<Integer>> permutations = permute(nums);

            System.out.print("Permutations of [");
            for (int i = 0; i < n; i++) {
                System.out.print(nums[i]+""+","+"");
            }
            System.out.println("]");
            for (List<Integer> permutation : permutations) {
                System.out.println(permutation);
            }
            //System.out.println(permutations);
        }
    }
}
