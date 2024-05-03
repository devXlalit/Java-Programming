package BasicsOfJava;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        String car1 = "ford";
        String car2 = "lambo";
        String car3 = "alto";

        String cars[] = { "ford", "lambo", "alto", "mustang" };

        int i = 0;
        int Carlen = cars.length;
        while (i < Carlen) {
            System.out.println("The values of cars is: " + cars[i]);
            i++;
        }
        // System.out.println("The cars is: " + cars[0]);
        // System.out.println("The cars is: " + cars[1]);
        // System.out.println("The cars is: " + cars[2]);

    }
}