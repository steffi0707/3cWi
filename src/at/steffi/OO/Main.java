package at.steffi.OO;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        Engine e2 = new Engine(250, Engine.TYPE.GAS);
        Engine e3 = new Engine(310, Engine.TYPE.DIESEL);

        Car c1  = new Car(e1,4, "Audi", "A1234", 7, 3, "red");
        Car c2 = new Car(e2,12, "Mercedes", "M1234", 32, 5, "green");
        Car c3 = new Car(e3,5, "Opel", "1234O", 17, 6, "blue");

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
