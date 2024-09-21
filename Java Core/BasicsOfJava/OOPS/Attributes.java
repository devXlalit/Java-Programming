package BasicsOfJava.OOPS;

public class Attributes {
    static int a = 12;
    static int b = 24;

    public static void hello1() {
        System.out.println("Hello world from 1");
    }

    public void hello2() {
        System.out.println("Hello world from 2");
    }

    int x = 45;
    int y = 54;

    public static void main(String[] args) {
        System.out.println("Accessing values by using static keyword");
        System.out.println(a);
        System.out.println(b);
        System.out.println("Accessing values by creating objects:");
        Attributes myObj = new Attributes();
        // myObj.x = 100;
        System.out.println(myObj.x);
        System.out.println(myObj.y);

        hello1();
        myObj.hello2();
    }
}
