package at.steffi.examples.cars;

import at.steffi.OO.RearMirror;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private Engine engine;
    private List<Manufacturer> manufacturer;
    private String color;
    private int basisPrize;

    public Cars(Engine engine, String color, int basisPrize) {
        this.engine = engine;
        this.color = color;
        this.basisPrize = basisPrize;

        this.manufacturer = new ArrayList<>();

    }

    public void addManufacturer(Manufacturer manufacturer){
        this.manufacturer.add(manufacturer);
    }

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setManufacturer(List<Manufacturer> manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getBasisPrize() {
        return basisPrize;
    }

    public String getColor() {
        return color;
    }
}
