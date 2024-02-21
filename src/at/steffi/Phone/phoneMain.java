package at.steffi.Phone;

import at.steffi.Phone.parts.SIM;
import at.steffi.Phone.parts.SDCard;
import at.steffi.Phone.parts.Camera;

public class phoneMain {
    public static void main(String[] args) {
        SIM sim = new SIM("+431234567",12345);
        SDCard sdCard = new SDCard(2048);
        Camera camera = new Camera(30);

        Phone phone = new Phone("Lime", sim, camera, sdCard);

        phone.makeCall("+43456789123");
        System.out.println(phone.getFreeSpace());
        phone.takePicture("jpg", "Friends");
        phone.takePicture("png", "Family");
        phone.printAllFiles();
        System.out.println(phone.getFreeSpace());

    }
}
