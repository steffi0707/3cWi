package at.steffi.procects;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static boolean isGameOnAndStarted = false;
    static int roundCounter;
    static int pointCounterPlayer = 0;
    static int pointCounterComputer = 0;
    static int randomNumber1;
    static int randomNumber2;

    public static void main(String[] args) {
        showMenu();
        while (isGameOnAndStarted) {
            for (roundCounter = 1; roundCounter <= 6; roundCounter++) {
                randomNumber1 = random.nextInt(1, 6);
                randomNumber2 = random.nextInt(1, 6);
                showRoundDialogs();
                calculateWinnerOfRound();
                pressEnterForNextRound();

            }

            /*showWinnerOfGame();
            boolean result = showFinishDialog();
            if (!result) {
                roundCounter = 0;
            } else {
                break;
            }*/
        }
    }
    public static void showMenu() {
        System.out.println("Bitte schreibe 'Start' um das Spiel zu beginnen");
        if (scanner.next().equalsIgnoreCase("Start")) {
            isGameOnAndStarted = true;
        }
    }
    public static void showRoundDialogs() {
        System.out.println("---------Round " + roundCounter + "---------");
        System.out.println("You rolled: " + randomNumber1);
        System.out.println("The Computer rolled: " + randomNumber2);
        System.out.println("---------------------------");
    }
    public static void calculateWinnerOfRound() {
        if (randomNumber1 > randomNumber2) {
            System.out.println("You won Round " + roundCounter + "!");
            pointCounterPlayer++;
        }
        if (randomNumber1 < randomNumber2) {
            System.out.println("The Computer won Round " + roundCounter + "!");
            pointCounterComputer++;
        }
        if (randomNumber1 == randomNumber2) {
            System.out.println("It's a tie!");
        }
    }

    public static void pressEnterForNextRound(){
        public static void pressEnterForNextRound() {
            if (roundCounter == 1) {


                scanner.nextLine();
                scanner.nextLine();
            }
            if (roundCounter <= 5 && roundCounter != 1) {
                scanner.nextLine();
            }
            if (roundCounter == 6) {
                System.out.println(" ");
            }
        }

        public static void showWinnerOfGame() {
            if (pointCounterPlayer > pointCounterComputer) {
                int pointsLead = pointCounterPlayer - pointCounterComputer;
                System.out.println("Congrats! You won with total amount of " + pointCounterPlayer +
                        " points and a lead of " + pointsLead + " points!");
            } else {
                int pointsLead = pointCounterComputer - pointCounterPlayer;
                System.out.println("The Computer won with a total amount of " + pointCounterComputer + " points and a lead of " + pointsLead + " points!");
            }
        }
        public static boolean showFinishDialog() {
            while (true) {
                System.out.println("If you wish to play again please type 'Again' otherwise type 'Vanish'");
                String codeWord = scanner.next();
                if (codeWord.equalsIgnoreCase("Again")) {
                    return false;
                } else if (codeWord.equalsIgnoreCase("Vanish")) {
                    return true;
                } else {
                    System.out.println("invalid try again");
                }
            }
        }
    }


}


    }
}
