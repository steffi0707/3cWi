package at.steffi.OO;

import java.util.ArrayList;
import java.util.List;

public class Car {
    // Instanz / Gedächnisvariablen

    // dont do that later
    private Engine engine;
    private Tank tank;
    private List<RearMirror> mirrors;
    public int fuelConsumption;

    public int amountOfRepetitions;
    public int getRemainingRange;
    public String brand;
    public String serialNumber;
    public String color;
    double RemainingRange;


    public Car(Engine engine, int fuelConsumption, String brand, String serialNumber, Tank tank, int amountOfRepetitions, String color) {
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.tank = tank;

        this.amountOfRepetitions = amountOfRepetitions;
        this.color = color;
        this.mirrors = new ArrayList<>();
    }


    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void drive(int speed) {
        this.tank.setFuelAmount(this.tank.getFuelAmount()- fuelConsumption);

        System.out.println("I am driving");
        engine.drive(speed);
    }

    public void Break() {
        System.out.println("I'm putting the brakes on");
    }

    public void turboBoost() {
        if (this.getTank().getFuelAmount() >  40) {
            System.out.println("Not enough fuel to go to Superboost");
        } else {
            System.out.println("SuperBoostMode");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int counter = 0; counter < amountOfRepetitions; counter++) {
            System.out.println("Tuuuuut");
        }
    }

    public void getRemainingRange() {
        RemainingRange = 100.0 / this.fuelConsumption * this.getTank().getFuelAmount();
        System.out.println(RemainingRange);
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
        this.getTank().setFuelAmount(fuelAmount);
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public void setMirrors(List<RearMirror> mirrors) {
        this.mirrors = mirrors;
    }
}


