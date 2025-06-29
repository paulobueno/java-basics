package org.example.controlstatement;
import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int userInput;
        int baseCost;
        int includedMonthlyCourses;
        int variableFee;
        int totalCost;

        System.out.print("Select a Learning Package (1, 2 or 3): ");
        userInput = keyboard.nextInt();

        if (userInput == 1) {
            baseCost = 10;
            includedMonthlyCourses = 2;
            variableFee = 6;
        } else if (userInput == 2) {
            baseCost = 12;
            includedMonthlyCourses = 4;
            variableFee = 4;
        } else  {
            baseCost = 15;
            includedMonthlyCourses = 6;
            variableFee = 3;
        }

        System.out.print("Set monthly number of courses: ");
        userInput = keyboard.nextInt();

        if (userInput > includedMonthlyCourses) {
            totalCost = baseCost + (userInput - includedMonthlyCourses) * variableFee;
        } else {
            totalCost = baseCost;
        }

        System.out.println("Total cost: " + totalCost);

    }

}
