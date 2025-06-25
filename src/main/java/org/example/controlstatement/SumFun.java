package org.example.controlstatement;

import java.util.Scanner;

public class SumFun {


    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a non-negative to add to sum");
        System.out.println("Enter a negative number to exit!");
        System.out.print("Enter a number: ");
        number = keyboard.nextInt();

        while(number >= 0) {
            System.out.print("Enter a number: ");
            sum += number;
            number = keyboard.nextInt();
        }

        System.out.println("Your sum is: " + sum);
    }

}
