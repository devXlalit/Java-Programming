package BasicsOfJava;

public class MethodOver {
    static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    // Method overloading can be performed when.
    // 1. datatypes changed
    // 2. number of variables

    public static void main(String[] args) {
        sum(2, 3);
    }
}
