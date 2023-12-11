package at.steffi.OO;

public class Car {
    // Instanz / Gedächnisvariablen

    // dont do that later
    private Engine engine;
    public int fuelConsumption;
    public int fuelAmount;
    public int amountOfRepetitions;
    public int getRemainingRange;
    public String brand;
    public String serialNumber;
    public String color;
    double RemainingRange;




    public Car(Engine engine, int fuelConsumption, String brand, String serialNumber, int fuelAmount, int amountOfRepetitions, String color){
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelAmount = fuelAmount;
        this.amountOfRepetitions = amountOfRepetitions;
        this.color = color;
    }


    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void Break(){
        System.out.println("I'm putting the brakes on");
    }

    public void turboBoost(){
        if (this.fuelAmount >fuelAmount/10){
            System.out.println("Not enough fuel to go to Superboost");
        }
        else{
            System.out.println("SuperBoostMode");
        }
    }

    public void honk(int amountOfRepetitions){
       for (int counter = 0; counter < amountOfRepetitions; counter ++) {
           System.out.println("Tuuuuut");
       }
    }

    public void getRemainingRange() {
        RemainingRange = 100.0 / this.fuelConsumption * this.fuelAmount;
        System.out.println(RemainingRange);
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}


