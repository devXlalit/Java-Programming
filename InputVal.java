import java.util.Scanner;

public class InputVal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value");
        int a = input.nextInt();
        System.out.println("Entered value by user is: " + a);

        System.out.println("Enter a charecter");
        // char op = input.next();
        char op = input.next().charAt(0);
        System.out.println("Entered operator by user is: " + op);
    }
}
