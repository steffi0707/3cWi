package at.steffi.OO;

import java.util.ArrayList;
import java.util.List;

public class Car {
    // Instanz / Gedächnisvariablen

    // dont do that later
    private Engine engine;
    private Tank tank;
    private List<RearMirror> mirrors;
    private List<Wheel> wheels;
    private int fuelConsumption;

    private int amountOfRepetitions;
    private int getRemainingRange;
    private String brand;
    private String serialNumber;
    private String color;
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
        this.wheels = new ArrayList<>();
    }


    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void addWheel(Wheel wheel){
        this.wheels.add(wheel);
    }

    public List<Wheel> getWheels() {
        return wheels;
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


    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setGetRemainingRange(int getRemainingRange) {
        this.getRemainingRange = getRemainingRange;
    }

    public void setRemainingRange(double remainingRange) {
        RemainingRange = remainingRange;
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

    public void setWheels(List<Wheel> wheels){
        this.wheels = wheels;
    }
}


