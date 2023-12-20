package at.steffi.OO;

public class RearMirror {
    private int size;
    private int position; // 0 netrual, -10 nach Links, +10 nach Rechts gerichtet

    public RearMirror(int size, int position) {
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public int getPosition() {
        return position;
    }
}
