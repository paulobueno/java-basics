package org.example.arrays;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> someNumbers = new ArrayList<>();
        someNumbers.add(0);
        someNumbers.add(1);
        someNumbers.add(2);
        someNumbers.add(3);

        for (int number : someNumbers) {
            System.out.println(number);
        }

        String someValue = "123";
        int numericNumber = Integer.parseInt(someValue);
        numericNumber += 10;
        System.out.println(numericNumber);

        String piValue = "3.14159";
        double piDoubleValue = Double.parseDouble(piValue);
        System.out.println(piDoubleValue);

    }
}
