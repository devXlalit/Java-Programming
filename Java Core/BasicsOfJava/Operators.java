package BasicsOfJava;
public class Operators {
    public static void main(String[] args) {
        int a = 12;
        int b = 24;

        // Arithmetic Operators
        System.out.println("Sum +: " + (a + b));
        System.out.println("Sub -: " + (a - b));
        System.out.println("Mul *: " + (a * b));
        System.out.println("Div /: " + (a / b));
        System.out.println("Rem %: " + (a % b));

        // a = a + 1;

        // Increment ++
        // a++; // Postincrement
        // ++a; // Preincrement

        // int a = 12;
        System.out.println("Post increment: " + a++); // a += 1;
        System.out.println(a);
        System.out.println("Pre increment: " + (++a));

        // Decrement --
        // a--;
        int o = 1;
        System.out.println("Post Decrement: " + o--);
        System.out.println("Print: " + o);

        // Assignment Operators
        int x = 2;

        System.out.println("Adding 5 in x = " + (x += 5)); // 7
        System.out.println("Substractin 5 from x = " + (x -= 5));
        System.out.println("Muliplying x with 5: " + (x *= 5));
        System.out.println("Divide x with 5: " + (x /= 5));
        System.out.println("Remeder if x to 5: " + (x %= 5));
        System.out.println("The default value of x is: " + x);

        // Logical Operators
        // and = &&
        // or = ||
        // not = !

        System.out.println(3 > 1 && 1 > 2);

        System.out.println(3 > 1 || 1 > 2);
        System.out.println((!(3 > 1 || 1 > 2))); // output -

        // Non-primitive datatype String
        String str = "pRee Ti";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("i"));

        // Concatanation
        String f = "12";
        String g = "12";
        System.out.println(f + g);

        String s = "12";
        int t = 12;
        System.out.println(s + t);

    }
}
