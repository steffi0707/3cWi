package at.steffi.Plane;

public class Position {
    private int largitude;
    private int latitude;

    public Position(int largitude, int latitude){
        this.largitude = largitude;
        this.latitude = latitude;
    }

    public int getLargitude() {
        return largitude;
    }

    public void setLargitude(int largitude) {
        this.largitude = largitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
}
