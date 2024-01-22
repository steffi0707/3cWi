package at.steffi.examples.cars;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(125, Engine.TYPE.GAS, 12, 140);
        Engine e2 = new Engine(354, Engine.TYPE.DIESEL, 34, 135);

        Manufacturer m1 = new Manufacturer("Rupert", "Austria", "17");
        Manufacturer m2 = new Manufacturer("Eugen", "Germany", "20");
    }
}
