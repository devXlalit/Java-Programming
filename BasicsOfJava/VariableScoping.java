package BasicsOfJava;

public class VariableScoping {
    public static void main(String[] args) {
        int r = 12;
        // int a = 45;
        // System.out.println(a);

        for (int a = 1; a <= 5; a++) {
            int t = 2;

            System.out.println(a + t);
        }
        for (int a = 1; a <= 5; a++) {
            int t = 2;
            System.out.println(a * t);
        }
    }
}
