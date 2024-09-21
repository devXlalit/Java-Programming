package BasicsOfJava;

public class Reverse {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5 };
        int a = 12;
        int b = 24;
        int temp = 0;
        System.out.println("Before swap:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
