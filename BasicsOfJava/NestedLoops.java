package BasicsOfJava;

public class NestedLoops {

    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 3; i++) {   //Outer loop
            for (int j = 1; j <= 3; j++) { // Inner loop
                // System.out.print(" i = " + i);
                // System.out.print(" j = " + j);
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
