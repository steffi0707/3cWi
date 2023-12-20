package at.steffi.OO;

public class Tank {
    private double capacity;
    private double fuelAmount;
    private String material;
    private double fuelUsed;

    public Tank(double capacity, double fuelAmount, String material) {
        this.capacity = capacity;
        this.fuelAmount = fuelAmount;
        this.material = material;
        this.fuelUsed = 30;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
