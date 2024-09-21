package BasicsOfJava.OOPS.Abstraction;

abstract class car {
    public abstract void brand();

    public abstract void year();

    public abstract void model();
}

class wagonor extends car {
    public void brand() {
        System.out.println("Ford");
    }

    public void year() {
        System.out.println("1896");
    }

    public void model() {
        System.out.println("mustang");
    }
}

public class ab {
    public static void main(String[] args) {
        wagonor mWagonor = new wagonor();
        mWagonor.brand();
        mWagonor.year();
        mWagonor.model();
    }
}
