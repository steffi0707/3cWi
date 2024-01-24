package at.steffi.examples.cars;

public class Engine {
    private int maxSpeed;
    private int basisConsumption;
    public enum TYPE {DIESEL, GAS}
    private int Achievement;
    private TYPE gastype; //Diesel oder Benzin

    public Engine(int maxSpeed, TYPE gastype, int basisConsumption, int Achievement) {
        this.maxSpeed = maxSpeed;
        this.gastype = gastype;
        this.basisConsumption = basisConsumption;
        this.Achievement = Achievement;
    }

    public void Consumption(){

    }

    public TYPE getGastype() {
        return gastype;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public int getBasisConsumption(){
        return basisConsumption;
    }

    public int getAchievement(){
        return Achievement;
    }
}
