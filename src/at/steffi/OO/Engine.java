package at.steffi.OO;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE gastype; //Diesel oder Benzin

    public Engine(int horsePower, TYPE gastype) {
        this.horsePower = horsePower;
        this.gastype = gastype;
    }

    //amount should be between 0 and 100

    public void drive(int amount){
        System.out.println("The motor is running with" + amount);
    }

    public int getHorsePower(){
        return horsePower;
    }

    public TYPE getGastype() {
        return gastype;
    }

}
