package BasicsOfJava;

public class PrimeNum {
    public static void main(String[] args) {
        int n = 16;
        int i = 2;
        boolean isPrime = true;
        while (i < n) {
            if (n % i == 0) {
                // System.out.println("Entered number is Non-prime!");
                isPrime = false;
                break;
            }
            i++; // i = i+1;
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Non-prime");
        }
    }
}
