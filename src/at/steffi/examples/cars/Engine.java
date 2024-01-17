package at.steffi.examples.cars;

public class Engine {
    private int maxSpeed;
    private int basisConsumption;
    public enum TYPE {DIESEL, GAS}
    private int Achievement;
    private TYPE gastype; //Diesel oder Benzin

    public Engine(int maxSpeed, TYPE gastype) {
        this.maxSpeed = maxSpeed;
        this.gastype = gastype;
    }

    public TYPE getGastype() {
        return gastype;
    }
}
