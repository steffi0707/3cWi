package at.steffi.procects;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Woerter_raten {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        boolean GameRunning = true;
        String[] words = {"Sarah", "Eduard", "Maurice", "Alfredo", "Elina", "Fabian"};
        Scanner scanner = new Scanner(System.in);

        while (GameRunning) {
            String randomWord = words[randomNumberGenerator.nextInt(words.length)];
            boolean isGuessing = true;
            String visibleLetters = getVisibleLetters(randomWord, 3);

            printWord(randomWord, visibleLetters);
            System.out.println();

            while (isGuessing){
                System.out.print("Input: ");
                String input = scanner.nextLine();
                visibleLetters += input.toLowerCase();
                printWord(randomWord, visibleLetters);
                System.out.println();
                isGuessing = isGameRunning(randomWord, visibleLetters);
            }
        }

  }

    public static String getVisibleLetters(String word, int amount) {
        Random randomNumberGenerator = new Random();
        String visibleLetters = new String();
        String[] letter_list = word.split("");
        for (int i = 0; i < amount; i++) {
            visibleLetters += letter_list[randomNumberGenerator.nextInt(letter_list.length)].toLowerCase();
        }
        return visibleLetters;
    }

    public static void printWord (String word, String visibleLetters) {
        String[] word_list = word.split("");
        for (String character : word_list) {
            if (visibleLetters.contains(character.toLowerCase())) {
                System.out.println(character);
            } else {
                System.out.println("*");
            }
        }

    }

    public static boolean isGameRunning(String word, String visibleLetters) {
        boolean gameRunning = false;
        String[] word_list = word.split("");
        for (String character : word_list) {
            if (!visibleLetters.contains(character.toLowerCase())) {
                gameRunning = true;
                break;
            }
        }
        return gameRunning;
    }
}