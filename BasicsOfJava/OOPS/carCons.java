package BasicsOfJava.OOPS;

public class carCons {
    String modelName;
    int year;

    public carCons(String carName, int year) {
        modelName = carName;
        this.year = year;
    }

    public static void main(String[] args) {
        carCons myCar1 = new carCons("scorpio", 1887);
        carCons myCar2 = new carCons("Thar", 1998);
        carCons myCar3 = new carCons("Tesla", 2012);

        System.out.println(myCar1.modelName);
        System.out.println(myCar1.year);

        System.out.println(myCar2.modelName);
        System.out.println(myCar2.year);

        System.out.println(myCar3.modelName);
        System.out.println(myCar3.year);
    }
}
