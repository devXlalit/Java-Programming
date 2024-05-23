package BasicsOfJava.OOPS.Polymorphism;

class parent {
    public static void sound() {
        System.out.println("Sound from parent");
    }
}

public class polyCLass extends parent {
    public static void sound() {
        System.out.println("Sound from poly class");
    }

    public static void main(String[] args) {
        sound();
    }
}
