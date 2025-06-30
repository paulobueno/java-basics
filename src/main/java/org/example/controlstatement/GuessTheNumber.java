package org.example.controlstatement;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        var randomNumber = new Random();
        int peekedNumber = randomNumber.nextInt(99) + 1;
        var keyboard = new Scanner(System.in);
        int userNumber;
        int guessCount = 0;

        while (true) {
            System.out.print("Guess a number: ");
            userNumber = keyboard.nextInt();
            guessCount++;

            if (userNumber > peekedNumber) {
                System.out.println("Number too high.");
            } else if (userNumber < peekedNumber) {
                System.out.println("Number too low.");
            } else {
                break;
            }

        }

        System.out.println(userNumber + " is the right number!");

    }

}
