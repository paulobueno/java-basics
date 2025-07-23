package org.example.strings;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        String fullName;
        String firstName;
        String lastName;
        int splitIn;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name and last name.");
        fullName = keyboard.nextLine();
        splitIn = fullName.indexOf(" ");
        firstName = fullName.substring(0, splitIn);
        lastName = fullName.substring(splitIn + 1);

        System.out.println("First name: " + firstName.toUpperCase());
        System.out.println("Last name: " + lastName.toLowerCase());

    }

}
