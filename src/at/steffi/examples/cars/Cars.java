package at.steffi.examples.cars;

import at.steffi.OO.RearMirror;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private Engine engine;
    private Manufacturer manufacturer;
    private String color;
    private int basisPrize;


    public Cars(Engine engine, String color, int basisPrize, Manufacturer manufacturer) {
        this.engine = engine;
        this.color = color;
        this.basisPrize = basisPrize;

        this.manufacturer = manufacturer;

    }



    public void Prize(){
        this.manufacturer.setDiscount(basisPrize- this.manufacturer.getDiscount());

        System.out.println("The Prize is");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }



    public Manufacturer getmanufacturer(){
        return (Manufacturer) manufacturer;
    }

    public void setManufacturer(List<Manufacturer> manufacturer) {
        this.manufacturer = (Manufacturer) manufacturer;
    }



    public int getBasisPrize() {
        return basisPrize;
    }

    public String getColor() {
        return color;
    }
}
