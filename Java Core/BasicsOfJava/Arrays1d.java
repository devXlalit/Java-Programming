package BasicsOfJava;

/**
 * test
 */
public class Arrays1d {

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

        // Q - Write a program in java to print the index of a key value.  
        // arr{1,2,4,6,7,8}
        // key = 4
        // sout(key->index)
        // The index of that value is = 

    }
}