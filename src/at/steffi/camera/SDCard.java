package at.steffi.camera;

import at.steffi.Phone.parts.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<CameraFile> cameraFiles;

    public SDCard(int capacity){
        this.capacity = capacity;
        this.cameraFiles = new ArrayList<>();
    }

    public void saveFile(CameraFile cameraFile){
        this.cameraFiles.add(cameraFile);
    }

    public List<CameraFile> getCameraFiles() {
        return cameraFiles;
    }


    public int getFreeSpace(){
        int cameraFilesSize = 0;
        if(cameraFiles != null){
            for(CameraFile cameraFile : cameraFiles){
                cameraFilesSize += cameraFile.getSize();
            }
        }
        return capacity-cameraFilesSize;
    }
}
