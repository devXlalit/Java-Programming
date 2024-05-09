package BasicsOfJava.Recursion;

public class test {
    static void numbers(int a) {
        if (a <= 0) {
            return;
        }
        numbers(a - 1);
        System.out.println(a);
    }

    // Recursion
    // base case / condition
    // Iteration
    // Repeated task

    public static void main(String[] args) {
        numbers(5);
    }

    // Assignment
    // Q 1 - Write a Recursion program in java to print the factorial of a given
    // number by user

    // Q 2 - Write a Recursion program in java to print the fibonacci seris of a
    // given number by user

    // Q 3 - Write a Recursion program in java to print the mulitplication table of
    // a given number by user
}
