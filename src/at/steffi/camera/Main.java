package at.steffi.camera;

public class Main {
    public static void main(String[] args) {
        Lens lens = new Lens("Sarah", 23);
        SDCard sdCard = new SDCard(230);
        Manufacturer manufacturer = new Manufacturer("Simon", "Austria");

        Camera camera = new Camera(123, 23, "Blue", 8);

        camera.takePicture("jpg", "Mountains");

    }
}
