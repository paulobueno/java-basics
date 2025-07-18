package org.example.arrays;
import java.util.Scanner;

public class Proj4_1_Arrays {

     public static void main(String[] args) {
         int[] numbersList = new int[5];
         Scanner keyboard = new Scanner(System.in);
         int userNumber;

         System.out.println("Insert five integers.");
         for (int i = 0; i < 5; i++) {
             System.out.print("# ");
             userNumber = keyboard.nextInt();
             numbersList[i] = userNumber;
         }

         System.out.println("Your numbers, multiplied by 2 are:");

         for (int number : numbersList) {
             number *= 2;
             System.out.println("# " + number);
         }

     }

}
