package at.steffi.Car;

public class Auto_start {
    public static void main(String[] args) {
        Car c1  = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        c1.fuelAmount = 70;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialNumber = "M1234";
        c2.fuelAmount = 20;

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);

        System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);

        c1.Break();
        c1.turboBoost();

        c2.honk();
    }
}
