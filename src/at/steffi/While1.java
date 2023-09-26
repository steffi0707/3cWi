package at.steffi;

import java.util.Random;

public class While1 {
    public static void main(String[] args) {

        boolean isTrue = true;
        int rechnen = 0;

        while (isTrue) {
            Random random = new Random();
            int randomNumber1 = random.nextInt(10, 30);

            if (randomNumber1 == 15 || randomNumber1 == 25) {
                isTrue= false;
            }
            else{
                rechnen += randomNumber1;
                System.out.println("Die Zahl lautet " + rechnen);
            }
        }


    }
}
