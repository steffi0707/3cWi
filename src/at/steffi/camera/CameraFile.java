package at.steffi.camera;

public class CameraFile {
    private String extension;
    private int size;
    private String name;


    public CameraFile(String extension, int size, String name){
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public String[] getInfo(){
        return new String[]{name, String.valueOf(size), extension};
    }

    public int getSize() {
        return size;
    }
}
