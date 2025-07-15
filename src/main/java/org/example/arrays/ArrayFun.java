package org.example.arrays;

public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[5];

        myArray[0] = 11;
        myArray[1] = 12;
        myArray[2] = 13;
        myArray[3] = 14;
        myArray[4] = 15;

        for (int i = 0; i < myArray.length; i++) {
           System.out.println(myArray[i]);
        }

        System.out.println("=====");

        // unpacking the array
        for (int num : myArray) {
            System.out.println(num);
        }

    }
}
