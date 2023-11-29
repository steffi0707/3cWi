package at.steffi.Car;

public class Main {
    public static void main(String[] args) {
        Car c1  = new Car(4, "Audi", "A1234", 7, 3);


        Car c2 = new Car(12, "Mercedes", "M1234", 32, 5);


        Car c3 = new Car(5, "Opel", "1234O", 17, 6);

        System.out.println(c3.serialNumber);

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);

        System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);

        c1.Break();
        c1.turboBoost();

        c1.honk(c1.amountOfRepetitions);

        c2.getRemainingRange();

    }
}
