package BasicsOfJava;

public class Startp2 {
    // Pattern
    // Right andgled - Triangle Pattern
    // *
    // * *
    // * * *
    // * * * *
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
