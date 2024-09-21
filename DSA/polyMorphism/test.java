package polyMorphism;


class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}


public class test {

    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.animalSound();

        Pig mypig = new Pig();

        mypig.animalSound();

        Dog mydog = new Dog();
        mydog.animalSound();

        System.out.println(sum(10, 12));
        System.out.println(sum(10, 12,4));


        

    }
}
