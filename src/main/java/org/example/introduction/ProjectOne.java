package org.example.introduction;
import java.util.Scanner;

/*
This class gets three numbers from user's input, separated by space, and returns their average value.
 */
public class ProjectOne {

    public static void main(String[] args) {
        double numberOne;
        double numberTwo;
        double numberThree;
        double averageOfThree;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me three numbers:");
        numberOne = keyboard.nextDouble();
        numberTwo = keyboard.nextDouble();
        numberThree = keyboard.nextDouble();
        keyboard.nextLine();

        averageOfThree = (numberOne + numberTwo + numberThree) / 3.0;
        System.out.println("The average of these three numbers is: " + averageOfThree);

    }

}
