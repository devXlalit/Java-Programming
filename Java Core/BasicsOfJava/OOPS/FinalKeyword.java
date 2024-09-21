package BasicsOfJava.OOPS;

public class FinalKeyword {
    final float PI = 3.14f;
    float pi = 3.14f;

    public void hello(String name) {

        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        FinalKeyword myObj = new FinalKeyword();

        // myObj.PI = 22; // final keyword variable would not change it's value
        myObj.pi = 12; // without final keyword we can change the value of a variable

        System.out.println(myObj.PI);
        System.out.println(myObj.pi);

        myObj.hello("lalit");

    }
}
