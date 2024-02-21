package at.steffi.Phone.parts;

import at.steffi.Phone.parts.PhoneFile;

public class Camera {
    private int resolution;


    public Camera(int resolution){
        this.resolution = resolution;
    }

    public PhoneFile makePicture(String extension, String name){
        PhoneFile phoneFile = new PhoneFile(extension, resolution*resolution, name);
        return phoneFile;

    }
}
