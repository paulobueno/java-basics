package org.example.controlstatement;
import java.util.Random;

public class RandomFun {

    public static void main(String[] args) {
        var random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println("My random number: " + myRandomNumber);

        myRandomNumber = random.nextInt(1000); // 0 to 999
        System.out.println("0 through 999: " + myRandomNumber);

        myRandomNumber = random.nextInt(1000) + 1; // 1 to 1000
        System.out.println("1 through 1000: " + myRandomNumber);
    }

}
