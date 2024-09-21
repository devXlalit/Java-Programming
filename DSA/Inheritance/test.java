package Inheritance;

class A{
    int a = 12;
    int b = 43;
    protected static void greet(){
        System.out.println("Hello");
    }
}
public class test extends A {
    public static void main(String[] args) {
        A ob = new A();
    System.out.println(ob.a);
    System.out.println(ob.b);
        greet();

    }
}
