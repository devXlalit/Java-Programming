package BasicsOfJava.OOPS;

public class ParameterCons {
    int x = 12;

    public ParameterCons(int y) {
        x = y;
    }

    public static void main(String[] args) {
        ParameterCons myObj = new ParameterCons(24);
        System.out.println(myObj.x);
    }
}
