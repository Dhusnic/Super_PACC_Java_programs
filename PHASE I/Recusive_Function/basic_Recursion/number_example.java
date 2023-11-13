
public class number_example {
    static void message(int a) {
        if (a <= 5) {
            System.out.println("Hello World :   " + a);
            // recursive function
            message(a + 1);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        int a = 1;
        message(a);

    }
}
