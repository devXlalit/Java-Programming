package BasicsOfJava.OOPS;

public class favCar {
    public void favCaris(String name) {
        System.out.println("My fav car is: " + name);
    }

    public static void main(String[] args) {
        favCar myFavCar1 = new favCar();
        favCar myFavCar2 = new favCar();
        myFavCar1.favCaris("Lambo");
        myFavCar2.favCaris("mustangs");
    }
}
