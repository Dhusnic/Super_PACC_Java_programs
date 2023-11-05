package simple_problems;

import java.util.*;

public class self_dividing_number {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Enter the Starting Value  :   ");
            int left = inp.nextInt();
            System.out.print("Enter the Ending Value    :   ");
            int right = inp.nextInt();
            Solution obj = new Solution();
            List<Integer> selfdivnum = obj.selfDividingNumbers(left, right);
            System.out.println(selfdivnum);
        }

    }
}

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        int i;
        for (i = left; i <= right; i++) {
            int f = 0, a = i, ii = i;
            while (ii > 0) {
                int r = ii % 10;
                if (r == 0) {
                    f = 1;
                    break;
                }
                if (a % r == 0) {
                    ii = ii / 10;
                    continue;
                } else {
                    f = 1;
                    break;
                }

            }

            if (f == 0) {
                res.add(i);
            }
        }
        return res;
    }
}