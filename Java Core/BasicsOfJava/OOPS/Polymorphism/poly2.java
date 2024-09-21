package BasicsOfJava.OOPS.Polymorphism;

public class poly2 {

    static int sum(int a, int b) {
        return a + b;
    }

    // 1. number of variables
    // 2. change in datatypes
    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result1 = sum(12, 10);
        int result2 = sum(122, 10);
        System.out.println(result1);
        System.out.println(result2);
    }
}
