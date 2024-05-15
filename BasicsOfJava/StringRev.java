package BasicsOfJava;

public class StringRev {
    public static void main(String[] args) {
        String str = "nayan";
        String rstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rstr = ch + rstr;
        }
        System.out.println("Original string: " + str);
        System.out.println("Reverse string: " + rstr);

        if (str == rstr) {
            System.out.println("Given string is a palindrome");
        } else {
            System.out.println("Given string is not a palindrome");
        }
    }
}
