package org.example.methods;
import java.util.Scanner;

public class Proj6_2_TicTacToe {

    public static void main(String[] args) {
        String[][] board = new String[3][3];
    }

    public static String getPlayer(int roundNumber) {
        if (roundNumber % 2 == 0) {
            return "X";
        } else {
            return "O";
        }
    }

    public static String[][] insertMove(String[][] board,
                                        int[] movement,
                                        String player) {
        return board;
    }

    public static int[] getMovement(int[] movement) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert the row and collum as x,y format: ");
        for (int i = 0; i < movement.length; i++) {
            movement[i] = keyboard.nextInt();
        }
        return movement;
    }


    public static void showBoard(String[][] board) {

    }


}
