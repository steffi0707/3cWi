package at.steffi.OO.RemoteControl;

public class Battery {
    private int status;

    public Battery(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void turnOn() {
        System.out.println("Verbraucher angeschlossen");
        this.status -= 5;
    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }
}
