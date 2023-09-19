package at.steffi;
import java.util.Random;
public class IfBedingung1 {
    public static void main(String[] args) {
        //Random Number between 0 and 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
        if (randomNumber<20){
            System.out.println("Mini");
        }
        else if (randomNumber>50) {
            System.out.println("Large");
        }
        else {
            System.out.println("Medium");
        }
    }
}
