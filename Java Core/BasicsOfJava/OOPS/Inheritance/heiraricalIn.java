package BasicsOfJava.OOPS.Inheritance;

class parent {
    static String name = "somename";
}

class child1 extends parent {
    static void child1R() {
        System.out.println("Calling from child1: " + name);
    }
}

class child2 extends parent {
    static void child2R() {
        System.out.println("Calling from child2: " + name);
    }
}

public class heiraricalIn extends parent {
    public static void main(String[] args) {
        System.out.println(name);
    }
}
