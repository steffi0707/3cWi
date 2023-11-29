package at.steffi.Car;

public class Car {
    // Instanz / Gedächnisvariablen

    // dont do that later
    public int fuelConsumption;
    public int fuelAmount;
    public int amountOfRepetitions;
    public int getRemainingRange;
    public String brand;
    public String serialNumber;
    private String color;
    double RemainingRange;


    public Car(int fuelConsumption, String brand, String serialNumber, int fuelAmount, int amountOfRepetitions){
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelAmount = fuelAmount;
        this.amountOfRepetitions = amountOfRepetitions;
    }


    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void Break(){
        System.out.println("Ich bremse");
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
}
