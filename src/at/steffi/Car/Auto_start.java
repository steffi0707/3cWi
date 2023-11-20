package at.steffi.Car;

public class Auto_start {
    public static void main(String[] args) {
        int car1FuelConsumption = 7;
        String car1Brand = "Audi";
        String car1SerialNumber = "A1234";

        int car2FuelConsumption = 5;
        String car2Brand = "Audi";
        String car2SerialNum = "A1235";

        String[] cars = {"7;Audi;A1234","5;Audi;A1235"};
        String[] car1 = cars[0].split(";");
    }
}
