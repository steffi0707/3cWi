package at.steffi.procects;
import java.util.Random;

public class Würfelspiel {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1,7);
        System.out.println(randomNumber);


    }
}
