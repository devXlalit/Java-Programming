package BasicsOfJava;

public class javaScope {
    static void hello() {
        int a = 5;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 12;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
