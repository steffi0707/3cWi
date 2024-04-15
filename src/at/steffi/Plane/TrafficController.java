package at.steffi.Plane;

public class TrafficController {

    public static String printAllPlanes(){
        return Plane.printName();
    }

    public static String informPeopleOnAllPlanes(){
        System.out.println("We sent the massage");
        return informPeopleOnAllPlanes();
    }
}
