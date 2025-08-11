package org.example.methods;

public class Proj6_2_TicTacToe {
    static int BOARD_SIZE = 3;
    static char FIRST_PLAYER = 'X';
    static char SECOND_PLAYER = 'O';

    public static void main(String[] args) {
        String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
        int turn = 1;

        while (!gameOver(board)) {
            showBoard(board);
            insertMove(board, turn);
            turn++;
        }

        String winner = getWinner(board);
        if (!winner.isBlank()) {
            System.out.println("Congratulations! the winner is " + winner);
        }  else {
            System.out.println("Too bad. It is a DRAW");
        }

    }

    public static boolean gameOver(String[][] board) {
        return allCellsPopulated(board)
                || samePlayerInAnyRow(board)
                || samePlayerInAnyColumn(board)
                || samePlayerInAnyDiagonal(board);
    }

    public static boolean allCellsPopulated(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].isBlank()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean samePlayerInAnyRow(String[][] board) {
        boolean sameInRow;
        for (int i = 0; i < board.length; i++) {
            sameInRow = true;

            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].isBlank()) {
                    sameInRow = false;
                    break;
                }
                if (j > 0 && !board[i][j-1].equals(board[i][j])) {
                    sameInRow = false;
                    break;
                }
            }

            if (sameInRow) {
                return true;
            }

        }

        return false;

    }

    public static boolean samePlayerInAnyColumn(String[][] board) {
        boolean sameInColumn;

        for (int j = 0; j < board[0].length; j++) {
            sameInColumn = true;
            for (int i = 0; i < board.length; i++) {
                if (board[i][j].isBlank()) {
                    sameInColumn = false;
                    break;
                }
                if (i > 0 && !board[i-1][j].equals(board[i][j])) {
                    sameInColumn = false;
                    break;
                }
            }

            if (sameInColumn) {
                return true;
            }

        }

        return false;
    }

    public static boolean samePlayerInAnyDiagonal(String[][] board) {
        boolean sameInDiagonal = false;

        for (int i = 0; i < board.length; i++) {
            sameInDiagonal = true;
            if (board[i][i].isBlank()) {
                sameInDiagonal = false;
                break;
            }
            if (i > 0 && !board[i-1][i-1].equals(board[i][i])) {
                sameInDiagonal = false;
                break;
            }
        }

        if (sameInDiagonal) {
            return true;
        }

        for (int i = 0; i < board.length; i++) {
            sameInDiagonal = true;
            if (board[i][i].isBlank()) {
                sameInDiagonal = false;
                break;
            }
            if (i > 0 && !board[BOARD_SIZE-i][i-1].equals(board[BOARD_SIZE-1-i][i])) {
                sameInDiagonal = false;
                break;
            }
        }

        return sameInDiagonal;
    }

}
