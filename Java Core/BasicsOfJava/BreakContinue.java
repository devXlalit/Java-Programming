package BasicsOfJava;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                // break; - It break(ends) the loop from that instance.
                // continue; - It escapes the iteration of that loop 
            }
            System.out.println(i);
        }
    }
}
