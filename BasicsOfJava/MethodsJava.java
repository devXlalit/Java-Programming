package BasicsOfJava;

public class MethodsJava {

    static void sum1(int a, int b) { // parameters
        System.out.println("The sum of a and b and c is: " + (a + b));
    }

    static int sum2(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 12;

        sum1(a, b); // Arguments
        int result = sum2(a, b); // 17
        System.out.println("The result is : " + result);

        // Assignment -
        // Q - 1 Write a java method to take username input from user and great him
        // input - lalit
        // output - Hello lalit

        // Q - 2 Write a java method to create a calculater when user enters 2 integer
        // and an operator program must return sum according to the operator user passed

    }
}
