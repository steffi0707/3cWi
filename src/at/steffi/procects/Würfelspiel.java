package at.steffi.procects;
import java.util.Random;

public class Würfelspiel {
    public static void main(String[] args) {

        boolean start = false;
        System.out.println("Write 'start' to begin the game");

        if (start == true){
        Random random = new Random();
        int randomNumberPlayer = random.nextInt(1,7);
        System.out.println("Player: " + randomNumberPlayer);

        int randomNumberComputer = random.nextInt(1,7);
        System.out.println("Computer: " + randomNumberComputer);
        }


    }
}
