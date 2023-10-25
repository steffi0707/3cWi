package at.steffi.procects;

import java.util.Scanner;

public class TicTacToe {
    static int[][] field = new int[3][3];
    static Scanner scanner = new Scanner(System.in);
    static boolean isPlayer1 = true;

    public static void main(String[] args) {
        run();
    }

    public static void run(){
            while (true){
                if (isPlayer1){
                    System.out.println("Player1");
                } else {
                    System.out.println("Player 2");
                }
                String inputOfPlayer = scanner.next();
                String [] input = inputOfPlayer.split(",");
                int input1 = Integer.parseInt(input[0]);
                int input2 = Integer.parseInt(input[1]);
                if (isPlayer1){
                    field[input1][input2] = 1;
                }else {
                    field[input1][input2] = 2;
                }

                System.out.println(input1 + "-" + input2);
                isPlayer1 = !isPlayer1;
            }
    }

    public static boolean hasWinner(){
        return
    }
}
