package BasicsOfJava.OOPS;

public class test {
    public static void main(String[] args) {
        // Modifiires.hello();
        Encapsulation myEncap = new Encapsulation();
        // System.out.println(myEncap.carName);
        String str = myEncap.getName();

        System.out.println(str);

        myEncap.setName("lambo");
        String newStr = myEncap.getName();
        System.out.println(newStr);
    }
}
