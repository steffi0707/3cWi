package at.steffi.camera;

import at.steffi.Phone.parts.PhoneFile;

public class Camera {
    private int pixel;
    private int weight;
    private String color;

    private int resolution;

    public Camera(int pixel, int weight, String color, int resolution){
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.resolution = resolution;
    }

    public CameraFile makePicture(String extension, String name){
        CameraFile cameraFile = new CameraFile(extension, resolution*resolution, name);
        return cameraFile;

    }


    public void takePicture(String extension, String name){
        CameraFile picture = makePicture(extension, name);
        if (picture.getSize() < SDCard.getFreeSpace()){
            SDCard.saveFile(picture);
        }
        else {
            System.out.println("No more storage space.");
        }



    }
}
