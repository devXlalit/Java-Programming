package BasicsOfJava.OOPS;

public class DefConstructor {
    int x = 5;

    public DefConstructor() {
        // default constructor
    }

    public static void main(String[] args) {
        DefConstructor myCon = new DefConstructor();
        myCon.x = 12;
        System.out.println(myCon.x);

    }
}
