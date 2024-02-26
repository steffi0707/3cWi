package at.steffi.camera;

import at.steffi.Phone.parts.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private static int capacity;
    private static List<CameraFile> cameraFiles;

    public SDCard(int capacity){
        this.capacity = capacity;
        this.cameraFiles = new ArrayList<>();
    }

    public static void saveFile(CameraFile cameraFile){
        cameraFiles.add(cameraFile);
    }

    public List<CameraFile> getCameraFiles() {
        return cameraFiles;
    }


    public static int getFreeSpace(){
        int cameraFilesSize = 0;
        if(cameraFiles != null){
            for(CameraFile cameraFile : cameraFiles){
                cameraFilesSize += cameraFile.getSize();
            }
        }
        return capacity-cameraFilesSize;
    }
}
