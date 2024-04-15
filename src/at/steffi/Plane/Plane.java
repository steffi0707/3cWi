package at.steffi.Plane;

public class Plane {
    private static String name;
    private String Name;
    Passenger passenger;
    TrafficController trafficController;
    Position position;


    public Plane(String Name, Passenger passenger, TrafficController trafficController, Position position){
        this.Name = Name;
        this.passenger = passenger;
        this.trafficController = trafficController;
        this.position = position;
    }

    public static String printName() {
        return name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public static boolean informPassengers(){
        if(TrafficController.informPeopleOnAllPlanes() == String.valueOf(true)){
            System.out.println("We got the massage");
        }
        else{
            System.out.println("We did not get the massage");
        }
        return informPassengers();
    }
}
