package at.steffi;
import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int balance = 0;
        boolean isFinished = true;
        Scanner scanner =new Scanner(System.in);
        int selection = scanner.nextInt();

        while (isFinished) {
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");

            System.out.println("Wähle eine Eingabe");
            selection = scanner.nextInt();
            System.out.println(selection);

            if (selection == 1) {
                System.out.println("Geben sie den Betrag ein den Sie einzahlen möchten");
                selection = scanner.nextInt();
                balance += selection;
            }

            if (selection == 2) {
                System.out.println("Geben sie den Betrag ein den Sie Abheben möchten");
                selection = scanner.nextInt();
                balance -= selection;
            }

            if (selection == 3) {
                System.out.println("Der Kontostand beträgt:" + balance);
            }
            if (selection == 4){
                isFinished = false;
                System.out.println("Machine is stopping!");
            }


        }
    }
}

