
import java.util.Scanner;

public class decending_numbers_till_1 {
    static void decen(int n) {
        System.out.println(n);
        if (n <= 1) {
            return;

        }
        decen(n - 1);
    }

    static void accen(int n) {
        if (n < 1) {
            return;

        }
        accen(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        int n;
        try (Scanner inp = new Scanner(System.in)) {
            n = inp.nextInt();
        }
        System.out.println("---------------------------");
        decen(n);
        System.out.println("---------------------------");
        accen(n);
    }
}
