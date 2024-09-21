package BasicsOfJava.OOPS.Inheritance;

class Parent { // parent
    protected String name = "kuchbhi";

    public void hello() {
        System.out.println("Hello");
    }
}

// Single inheritance
public class SingleIn extends Parent { // child
    String secondName = "kuch nahi";

    public static void main(String[] args) {
        SingleIn myObj = new SingleIn();
        System.out.println(myObj.name);
        myObj.name = "somename";
        System.out.println(myObj.name);

        myObj.hello();
        System.out.println(myObj.secondName);
    }
}
