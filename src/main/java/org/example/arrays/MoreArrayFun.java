package org.example.arrays;

public class MoreArrayFun {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        for (int i=0; i < 10; i++) {
            myArray[i] = i + 1;
        }

        for (int num : myArray) {
            System.out.println(num);
        }

        System.out.println("===");

        for (int i=0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
