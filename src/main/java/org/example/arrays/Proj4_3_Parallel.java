package org.example.arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Give the name and the age of 5 persons.");

        for (int i = 0; i < 5; i++) {
            System.out.print("Insert the name: ");
            name = keyboard.nextLine();
            names.add(name);
            System.out.print("Insert the age: ");
            age = keyboard.nextInt();
            keyboard.nextLine();
            ages.add(age);
        }

        System.out.println("==========");
        for (int i = 0; i < names.size(); i++) {
            name = names.get(i);
            age = ages.get(i);
            System.out.printf("%s is %d years old\n", name, age);
        }

    }

}
