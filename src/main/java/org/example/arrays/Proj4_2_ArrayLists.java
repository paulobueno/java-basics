package org.example.arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Proj4_2_ArrayLists {

    public static void main(String[] args) {
        ArrayList<Double> numbersList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        double userNumber;

        System.out.println("Enter non-negative numbers: ");

        do {
            System.out.print("# ");
            userNumber = keyboard.nextDouble();
            if (userNumber >= 0) {
               numbersList.add(userNumber);
            }
        }
        while (userNumber >= 0);

        for (int i = numbersList.size(); i > 0; i--) {
            System.out.println(numbersList.get(i - 1));
        }

    }

}
