
import java.util.Scanner;

public class count_number_zeros_recursive {
    static int count = 0;

    static int zeros(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            count++;
        }
        return zeros(n / 10, count);
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int n = inp.nextInt();
            int a = zeros(n, 0);
            System.out.println(a);
        }

    }

}
