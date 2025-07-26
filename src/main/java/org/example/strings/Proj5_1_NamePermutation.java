package org.example.strings;

import java.util.Scanner;
import java.util.ArrayList;

public class Proj5_1_NamePermutation {

    public static void main(String[] args) {
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        String fullName;
        Scanner keyboard = new Scanner(System.in);
        int spaceIndex;
        final int NUMBER_OF_NAMES = 5;

        System.out.println("Enter five full names: ");
        for (int i = 1; i <= NUMBER_OF_NAMES; i++) {
            System.out.print("#" + i + " : ");
            fullName = keyboard.nextLine();
            spaceIndex = fullName.indexOf(" ");
            firstNames.add(fullName.substring(0, spaceIndex));
            lastNames.add(fullName.substring(spaceIndex + 1));
        }

        for (String firstName : firstNames) {
            for (String lastName : lastNames) {
                System.out.println(firstName + " " + lastName);
            }
        }
    }

}
