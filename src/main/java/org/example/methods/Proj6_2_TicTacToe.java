package org.example.methods;

import java.util.Objects;
import java.util.Scanner;

public class Proj6_2_TicTacToe {

    private static String BOARD_PLACE_HOLDER = "   ";

    public static void main(String[] args) {
        String[][] board = createBoard();
        int round = 0;
        int[] move = new int[2];
        String player;

        showBoard(board);
        while (!isGameFinished(board)) {
            round++;
            player = getPlayer(round);
            move = getMove();
            insertMoveIntoBoard(board, move, player);
            showBoard(board);
        }

        System.out.println("GAME FINISHED!");

    }

    public static String[][] createBoard() {
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = BOARD_PLACE_HOLDER;
            }
        }
        return board;
    }

    public static String getPlayer(int roundNumber) {
        if (roundNumber % 2 == 0) {
            return "X";
        } else {
            return "O";
        }
    }

    public static void insertMoveIntoBoard(String[][] board,
                                                 int[] move,
                                                 String player) {

        if (isValidMove(board, move)) {
            board[move[0]][move[1]] = " " + player + " ";
        }
    }

    public static boolean isValidMove(String[][] board,
                                      int[] move) {
        if ( move[0] > board.length - 1 && move[1] > board[0].length -1 ) {
            System.out.println("Move not valid. Try again.");
            return false;
        }
        if (Objects.equals(board[move[0]][move[1]], BOARD_PLACE_HOLDER)) {
            return true;
        }
        System.out.println("Move not valid. Try again.");
        return false;
    }

    public static int[] getMove() {
        int[] movement = new int[2];
        String[] move;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Insert the row and collum as x,y format: ");
        move = keyboard.nextLine().split(",");

        for (int i = 0; i < movement.length; i++) {
            movement[i] = Integer.parseInt(move[i].trim());
        }

        return movement;
    }


    public static void showBoard(String[][] board) {

        for (int i = 0; i < board.length; i++) {
            if (i > 0) {
                System.out.println("-".repeat(15));
            }
            System.out.println(String.join(" | ", board[i]));
        }

    }

    public static boolean isGameFinished(String[][] board) {
        return checkDiagonalFinish(board) ||
                checkHorizontalFinish(board) ||
                checkVerticalFinish(board);
    }

    public static boolean checkHorizontalFinish(String[][] board) {
        boolean finished = true;
        for (String[] row : board) {
            for (int j = 1; j < row.length; j++) {
                if (Objects.equals(row[j - 1], BOARD_PLACE_HOLDER) ||
                        Objects.equals(row[j], BOARD_PLACE_HOLDER) ||
                        !Objects.equals(row[j - 1], row[j])) {
                    finished = false;
                    break;
                }
            }
            if (finished) {
                return finished;
            }
        }
        return finished;
    }

    public static boolean checkVerticalFinish(String[][] board) {
        boolean finished = true;
        for (int j = 0; j < board[0].length; j++) {
            for (int i = 1; i < board.length; i++) {
                if (Objects.equals(board[i - 1][j], BOARD_PLACE_HOLDER) ||
                        Objects.equals(board[i][j], BOARD_PLACE_HOLDER) ||
                        !Objects.equals(board[i - 1][j], board[i][j])) {
                    finished = false;
                    break;
                }
            }
            if (finished) {
                return true;
            }
        }
        return finished;
    }

    public static boolean checkDiagonalFinish(String[][] board) {
        boolean finished = true;
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[i].length; j++) {
                if ( i == j) {
                    if (Objects.equals(board[i - 1][j - 1], BOARD_PLACE_HOLDER) ||
                            Objects.equals(board[i][j], BOARD_PLACE_HOLDER) ||
                            !Objects.equals(board[i - 1][j - 1], board[i][j])
                    ) {
                        finished = false;
                        break;
                    }
                }
            }
            if (!finished) {
                break;
            }
        }
        return finished;
    }

}
