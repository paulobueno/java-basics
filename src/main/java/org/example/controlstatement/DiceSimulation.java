package org.example.controlstatement;
import java.util.Random;

public class DiceSimulation {

    public static void main(String[] args) {
        var random = new Random();
        for (int i = 1; i <= 10; i++) {
            int diceValue = random.nextInt(6) + 1;
            System.out.printf("Round %d, dice value: %d\n", i, diceValue);
        }
    }

}
