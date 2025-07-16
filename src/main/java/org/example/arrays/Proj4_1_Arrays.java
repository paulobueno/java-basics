package org.example.arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_1_Arrays {

     public static void main(String[] args) {
         ArrayList<Integer> numbersList = new ArrayList<>();
         Scanner keyboard = new Scanner(System.in);
         int userNumber;

         System.out.println("Insert five integers.");
         for (int i = 0; i < 5; i++) {
             System.out.println("# ");
             userNumber = keyboard.nextInt();
             numbersList.add(userNumber);
         }

         System.out.println("Your numbers, multiplied by 2 are:");

         for (int number : numbersList) {
             number *= 2;
             System.out.println("# " + number);
         }

     }

}
