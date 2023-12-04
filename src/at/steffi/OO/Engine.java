package at.steffi.OO;

public class Engine {
    private enum TYPE {DIESEL, GAS}
    private int horsePower;
    private String type; //Diesel oder Benzin

    //amount schould be between 0 and 100

    public void drive(int amount){
        System.out.println("the motor is running with" + amount);
    }

    public int getHorsePower(){
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }
}
