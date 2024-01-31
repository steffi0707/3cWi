package at.steffi.examples.cars;

public class Engine {
    private int maxSpeed;


    private int basisConsumption;

    public enum TYPE {DIESEL, GAS}
    private int Achievement;
    private TYPE gastype; //Diesel oder Benzin

    public Engine(int maxSpeed, TYPE gastype, int Achievement, int basisConsumption) {
        this.maxSpeed = maxSpeed;
        this.gastype = gastype;
        this.Achievement = Achievement;
        this.basisConsumption = basisConsumption;
    }

    public int getBasisConsumption(){
        return basisConsumption;
    }

    public TYPE getGastype() {
        return gastype;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }




    public int getAchievement(){
        return Achievement;
    }
}
