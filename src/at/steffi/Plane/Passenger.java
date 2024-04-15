package at.steffi.Plane;

public class Passenger {
    private String firstName;
    private String lastName;


    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static String inform (){
        if(Plane.informPassengers() == true){
            System.out.println("We got the massage");
        }
        return inform();
    }
}
