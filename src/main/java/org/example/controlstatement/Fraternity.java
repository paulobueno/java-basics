package org.example.controlstatement;
import java.util.Scanner;

public class Fraternity {

    public static void main(String[] args) {
        int age;
        char gender;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = keyboard.nextInt();

        System.out.print("Enter you gender letter: ");
        gender = keyboard.next().charAt(0);

        // single quote must be used for literals. If double quote is used, it will be considered as String
        if(age >= 19 && gender == 'M') {
            System.out.println("You can join the fraternity!");
        } else {
            System.out.println("Sorry, you cannot join the fraternity.");
        }

    }

}
