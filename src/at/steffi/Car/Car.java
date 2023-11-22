package at.steffi.Car;

public class Car {
    // Instanz / Gedächnisvariablen

    // dont do that later
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;


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

    public void honk(){
        System.out.println("Tuuuuut");
    }
}
