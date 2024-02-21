package at.steffi.Phone.parts;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;

    private List<PhoneFile> phoneFiles;


    public SDCard(int capacity){
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }

    public void saveFile(PhoneFile phoneFile) {
        this.phoneFiles.add(phoneFile);
    }

    public List<PhoneFile> getPhoneFiles() {
        return phoneFiles;
    }

    public int getFreeSpace(){
        int phoneFilesSize = 0;
        if(phoneFiles != null){
            for(PhoneFile phoneFile : phoneFiles){
                phoneFilesSize += phoneFile.getSize();
            }
        }
        return capacity-phoneFilesSize;
    }

}
