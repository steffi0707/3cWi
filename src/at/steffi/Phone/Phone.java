package at.steffi.Phone;
import at.steffi.Phone.parts.Camera;
import at.steffi.Phone.parts.PhoneFile;
import at.steffi.Phone.parts.SDCard;
import at.steffi.Phone.parts.SIM;

public class Phone {
    String color;
    SIM sim;
    Camera camera;
    SDCard sdCard;

    public Phone(String color, SIM sim, Camera camera, SDCard sdCard) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdCard = sdCard;
    }


    public void takePicture(String extension, String name){
        PhoneFile picture = camera.makePicture(extension, name);
        if (picture.getSize() < sdCard.getFreeSpace()){
            sdCard.saveFile(picture);
        }
        else {
            System.out.println("No more storage space.");
        }



    }

    public void makeCall(String number){
        sim.doCall(number);

    }

    public int getFreeSpace(){
        return sdCard.getFreeSpace();
    }

    public void printAllFiles(){
        for (PhoneFile phoneFile : sdCard.getPhoneFiles()) {
            for (String info : phoneFile.getInfo()){
                System.out.print(info + " ");

            }
            System.out.println();
        }

    }
}
