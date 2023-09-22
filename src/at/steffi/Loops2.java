package at.steffi;

public class Loops2 {
    public static void main(String[] args) {
        int katho = 0;
        for (int i = 2; i <= 1000; i= i+2) {
            katho += i;
            System.out.println(katho);
        }
    }
}
