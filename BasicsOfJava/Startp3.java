package BasicsOfJava;

public class Startp3 {
    // Pattern -
    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) { // Outer loop

            for (int sp = 1; sp <= 4 - row; sp++) { // Inner loop
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) { // Inner loop
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

}