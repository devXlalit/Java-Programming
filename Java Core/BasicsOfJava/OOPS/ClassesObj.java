package BasicsOfJava.OOPS;

public class ClassesObj {
    int a = 5; // attribute
    static int b = 12;// attribute

    public static void main(String[] args) { // Method
        ClassesObj mereObj = new ClassesObj(); // copy

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
        ClassesObj myObject = new ClassesObj();
        System.out.println("The myObject a is: " + myObject.a);
    }
}
