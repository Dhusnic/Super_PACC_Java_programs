
public class concept_of_priority_in_recursion {
    static void fun(int n) {
        if (n == 0) {
            return;
        } else {
            fun(n--);
        }
    }

    static void fun1(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            fun1(--n);
        }
    }

    public static void main(String[] args) {
        fun1(5);
        // fun(5);
    }
}
