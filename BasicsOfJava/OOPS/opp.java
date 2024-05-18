package BasicsOfJava.OOPS;

public class opp {
    int a = 5; // attribute
    static int b = 12;// attribute

    public static void main(String[] args) { // Method
        opp mereObj = new opp(); // copy

        mereObj.a = 12;
        System.out.println("meraObj call hua: " + mereObj.a);
        // System.out.println("meraObj call hua: " + mereObj.a);

        // Scanner sc = new Scanner();

        // a = 12;
        b = 23;
        // System.out.println("Main method a " + a);
        System.out.println("Main method b " + b);
        sum();
    }

    static void sum() { // Method
        // a = 34;
        b = 45;
        // System.out.println("Sum method a : " + a);
        System.out.println("Sum method b : " + b);
        opp myObject = new opp();
        System.out.println("The myObject a is: " + myObject.a);
    }
}
