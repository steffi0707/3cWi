package at.steffi.Plane;

public class Main {
    public static void main(String[] args) {


        Passenger passenger1 = new Passenger("Sarah", "Wolf");
        Passenger passenger2 = new Passenger("Lukas", "Wagner");

        Position position1 = new Position(10, 10);
        Position position2 = new Position(15, 15);

        TrafficController trafficController1 = new TrafficController();

        Plane plane1 = new Plane("Boing 747", passenger1, trafficController1, position1);
        Plane plane2 = new Plane("Airplane 123", passenger2, trafficController1, position2);


        Plane.informPassengers();
        Passenger.inform();
        TrafficController.informPeopleOnAllPlanes();
    }
}
