package BasicsOfJava;

public class TypeCastin {
    public static void main(String[] args) {
        // Automatic Type Casting(Widening Casting)
        int a = 12;
        float fl = a;
        System.out.println(a);
        System.out.println(fl);
        // Manual Type Casting (Narrowing Casting)
        double dl = 3232;
        int in = (int) dl;
        System.out.println(dl);
        System.out.println(in);
    }
}
