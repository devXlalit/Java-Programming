package BasicsOfJava;
public class Conditionals {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        int n = 12;
        if (n % 2 == 0) {
            System.out.println("Divisible!");
        } else {
            System.out.println("Not divisible!");
        }

        // Q - Write a program in java to compare 3 integers and find the largest
        // integet between them

        // Solution:
        int q = 2;
        int p = 40;
        int r = 23;

        if (q > p && q > r) {
            System.out.println("Q is greater!");
        } else if (p > q && p > r) {
            System.out.println("P is greater!");
        } else {
            System.out.println("R is greater!");
        }

        // Nested
        // if (q > p) {
        // if (q > r) {
        // System.out.println("Q is greater!");
        // }
        // } else if (p > q) {
        // if (p > r) {
        // System.out.println("P is greater");
        // }
        // } else {
        // System.out.println("R is greater!");
        // }
    }
}
