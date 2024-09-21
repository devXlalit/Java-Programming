package BasicsOfJava.OOPS.Interfaces;

interface Animal {
    public void animalSound();

    public void sleep();
}

// class Pig implements Animal {
// public void animalSound() {
// System.out.println("The pig says: wee wee");
// }

// public void sleep() {
// System.out.println("Zzz..");
// }
// }

public class first implements Animal {
    public void animalSound() {
        System.out.println("animal sound is called");
    }

    public void sleep() {
        System.out.println("sleep is called");
    }

    public static void main(String[] args) {
        first myfirst = new first(); // Create a Pig object
        myfirst.animalSound();
        myfirst.sleep();
    }
}
