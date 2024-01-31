package at.steffi.examples.cars;

import at.steffi.OO.RearMirror;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private Engine engine;
    private Manufacturer manufacturer;
    private String color;
    private int basisPrize;
    private int distance;
    private int price;

    private int Consumption;


    public Cars(Engine engine, String color, int basisPrize, Manufacturer manufacturer, int distance) {
        this.engine = engine;
        this.color = color;
        this.basisPrize = basisPrize;

        this.manufacturer = manufacturer;
        this.distance = distance;

        this.price = (int) (this.basisPrize - (this.manufacturer.getDiscount() * this.basisPrize));

        if (this.distance < 50000) {
            this.Consumption = this.engine.getBasisConsumption();
        } else {
            this.Consumption = (int) (this.engine.getBasisConsumption() * 1.098);
        }

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
