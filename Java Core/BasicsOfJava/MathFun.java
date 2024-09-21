package BasicsOfJava;
import java.util.Scanner;

public class MathFun {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("The greatest value between both is: " + Math.max(a, b));
        System.out.println("The minimum value between both is: " + Math.min(a, b));

        System.out.println((int) Math.sqrt(16));

        // System.out.println((int) (Math.random() * 9999));
        int random = (int) (Math.random() * 9999);
        System.out.println("Random number is: " + random);
        // Scanner input = new Scanner(System.in);

        // System.out.println("Guess a integer: ");
        // int value = input.nextInt();

        // if (random == value) {
        // System.out.println("Your guess it right.");
        // } else {
        // System.out.println("Try again.");
        // }
        // boolean a = true;
        // if (a) {
        // System.out.println("yes");
        // System.out.println("yes");
        // System.out.println("yes");
        // } else {
        // System.out.println("no");
        // }
    }
}