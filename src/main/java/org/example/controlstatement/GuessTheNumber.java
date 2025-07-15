package org.example.controlstatement;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        var randomNumber = new Random();
        int peekedNumber = randomNumber.nextInt(99) + 1;
        var keyboard = new Scanner(System.in);
        int userNumber = 1;
        boolean guessedNumber = false;
        int guessCount = 0;

        while (!guessedNumber) {
            System.out.print("Guess a number: ");
            userNumber = keyboard.nextInt();
            guessCount++;

            if (userNumber < 1 || userNumber > 100) {
                System.out.println("Number have to be between 1 and 100!");
                continue;
            }

            if (userNumber == peekedNumber) {
                guessedNumber = true;
            } else if (userNumber > peekedNumber) {
                System.out.println("Number too high.");
            } else {
                System.out.println("Number too low.");
            }
        }

        System.out.println(userNumber + " is the right number!");
        System.out.println("You guessed " + guessCount + " times!");

    }

}
