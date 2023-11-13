
public class Hello_world_recursive {
    static int a = 0;

    static void message() {
        a++;
        if (a < 5) {
            System.out.println("Hello World");
            // recursive function
            message();
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        message();

    }
}
