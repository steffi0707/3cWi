package at.steffi.Phone.parts;
public class SIM {
    private String number;
    private int id;

    public SIM(String number, int id){
        this.number = number;
        this.id = id;
    }

    public void doCall(String number){
        System.out.println("Calling number: " + number);
    }

}
