package at.steffi.procects;

import java.util.Scanner;

public class TicTacToe {
    static int[][] field = new int[3][3];
    static Scanner scanner = new Scanner(System.in);
    static boolean isPlayer1 = true;

    public static void main(String[] args) {
        showMenu();
        run();
    }
    public static void showMenu() {
        System.out.println("Please write 'Start' to start the game");
        if (scanner.next().equalsIgnoreCase("Start")) {
            boolean isGameOnAndStarted = true;
        }
    }
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[3][3];
        boolean game_is_running = true;

        int player = 2;

        printPlayBoard(board);


        while (game_is_running) {

            if (player == 1) {
                player = 2;
            } else player = 1;

            System.out.println("Player" + player + ": ");
            int[] position = getPosition(scanner);
            while (!checkPositionIsFree(board, position)) {
                System.out.println("Position is already taken");
                System.out.println("Please choose a new position: ");
                position = getPosition(scanner);
            }
            updateBoard(board, position, player);
            printPlayBoard(board);
            if (checkWinner(board, player)) {
                System.out.println("Player " + player + " is the winner! Congratulation!!");
                game_is_running = false;
            }
        }

    }

    public static void printPlayBoard(int[][] board) {
        for (int[] row : board) {
            for (int state : row) {
                if (state == 1) {
                    System.out.print("|o");
                } else if (state == 2) {
                    System.out.print("|x");
                } else {
                    System.out.print("| ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static int[] getPositionFromInput(String input) {
        String[] input_list = input.split(",");

        return new int[]{Integer.parseInt(input_list[1]), Integer.parseInt(input_list[0])};
    }

    public static int[] getPosition(Scanner scanner) {
        return getPositionFromInput(scanner.next());
    }

    public static void updateBoard(int[][] board, int[] position, int state) {
        board[position[0]][position[1]] = state;
    }

    public static boolean checkPositionIsFree(int[][] board, int[] position) {
        return board[position[0]][position[1]] == 0;
    }

    public static boolean checkWinner(int[][] place, int player) {
        boolean winner = place[0][0] == player && place[0][1] == player && place[0][2] == player;

        if (place[1][0] == player && place[1][1] == player && place[1][2] == player) {
            winner = true;
        }
        if (place[2][0] == player && place[2][1] == player && place[2][2] == player) {
            winner = true;
        }
        if (place[0][0] == player && place[1][0] == player && place[2][0] == player) {
            winner = true;
        }
        if (place[0][1] == player && place[1][1] == player && place[2][1] == player) {
            winner = true;
        }
        if (place[0][2] == player && place[1][2] == player && place[2][2] == player) {
            winner = true;
        }
        if (place[0][0] == player && place[1][1] == player && place[2][2] == player) {
            winner = true;
        }
        if (place[0][2] == player && place[1][1] == player && place[2][0] == player) {
            winner = true;
        }


        return winner;


            /*while (true){
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
        return ;*/
    }

}