package org.example.methods;
import java.util.ArrayList;

public class Proj6_1_SumOfElements {

    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();

        myArray.add(10);
        myArray.add(20);
        myArray.add(50);

        int result = sumElements(myArray);
        System.out.println("The sum is: " + result);

    }

    public static int sumElements(ArrayList<Integer> array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

}
