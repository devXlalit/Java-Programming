package BasicsOfJava.OOPS;

public class Encapsulation {
    private String carName = "mustang";

    public String getName() {
        return carName;
    }

    public void setName(String newCarName) {
        this.carName = newCarName;
    }

    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();
        System.out.println(myObj.carName);

    }
}
