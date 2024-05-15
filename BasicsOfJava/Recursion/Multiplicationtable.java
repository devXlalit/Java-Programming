package BasicsOfJava.Recursion;

public class Multiplicationtable {
    static void mulitplicationT(int n, int count) {
        if (count > 10) {
            return;
        }
        System.out.println(n * count);
        mulitplicationT(n, count + 1);
    }

    public static void main(String[] args) {
        int n = 2;
        mulitplicationT(n, 1);
    }
}

// Assignements -
// Q - Write a java program using Recursion to print the factorial of a number
// given by user
// Q - Write a java program using Recursion to print the n fibonnaci series
// given by user