package org.example.controlstatement;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int userInput;
        System.out.println("Insert a number: ");
        userInput = keyboard.nextInt();
        if (userInput % 3 == 0) {
            System.out.println(userInput + " is divisible by 3");
        } else {
            System.out.println(userInput + " is NOT divisible by 3");
        }
    }
}
