package org.example.methods;
import java.util.Scanner;

public class Proj6_2_TicTacToe {
    static int BOARD_SIZE = 3;
    static String FIRST_PLAYER = "X";
    static String SECOND_PLAYER = "O";
    static String DRAW = "D";

    public static void main(String[] args) {
        String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
        int turn = 1;
        int[] move;

        while (!gameOver(board)) {
            showBoard(board);
            move = getMove();
            if (isValidMove(board, move)) {
                insertMove(board, move, turn);
                turn++;
            }
        }

        showBoard(board);
        String winner = getWinner(board, turn - 1);
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
                if (board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean samePlayerInAnyRow(String[][] board) {
        boolean sameInRow;
        String currCell;
        String prevCell;

        for (int i = 0; i < board.length; i++) {
            sameInRow = true;
            for (int j = 1; j < board[0].length; j++) {
                currCell = board[i][j];
                prevCell = board[i][j-1];
                if (currCell == null || !currCell.equals(prevCell) ) {
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
        String currCell;
        String prevCell;
        for (int j = 0; j < board[0].length; j++) {
            sameInColumn = true;
            for (int i = 1; i < board.length; i++) {
                currCell = board[i][j];
                prevCell = board[i-1][j];
                if (currCell == null || !currCell.equals(prevCell) ) {
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
        boolean sameInDiagonal = true;
        String currCell;
        String prevCell;
        for (int i = 1; i < board.length; i++) {
            currCell = board[i][i];
            prevCell = board[i-1][i-1];
            if (currCell == null || !currCell.equals(prevCell) ) {
                sameInDiagonal = false;
            }
        }

        if (sameInDiagonal) {
            return true;
        }

        sameInDiagonal = true;

        for (int i = 1; i < board.length; i++) {
            currCell = board[BOARD_SIZE-1-i][i];
            prevCell = board[BOARD_SIZE-i][i-1];
            if (currCell == null || !currCell.equals(prevCell) ) {
                sameInDiagonal = false;
            }
        }

        return sameInDiagonal;
    }

    public static void insertMove(String[][] board, int[] move, int turn) {
        String player = turn % 2 != 0 ? FIRST_PLAYER : SECOND_PLAYER;
        board[move[0]][move[1]] = player;
    }

    public static void showBoard(String[][] board) {
        String div = "------".repeat(BOARD_SIZE);
        StringBuilder row = new StringBuilder();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                row.append("  ");
                row.append(board[i][j] == null ? " " : board[i][j]);
                row.append("  ");
                if (j < board[0].length - 1) {
                    row.append("|");
                } else {
                    row.append("\n");
                }
            }
            System.out.print(row);
            row.delete(0, row.length() - 1);
            if (i < board.length - 1) {
                System.out.print(div);
            }
        }
    }

    public static String getWinner(String[][] board, int turn) {
        String player = turn % 2 != 0 ? FIRST_PLAYER : SECOND_PLAYER;
        if (samePlayerInAnyColumn(board)
                || samePlayerInAnyRow(board)
                || samePlayerInAnyDiagonal(board)) {
            return player;
        }
        return DRAW;
    }

    public static int[] getMove() {
        int[] move = new int[2];
        System.out.println("Insert your move. " +
                "First row number and then column number");
        Scanner keyboard = new Scanner(System.in);
        move[0] = keyboard.nextInt();
        move[1] = keyboard.nextInt();
        return move;
    }

    public static boolean isValidMove(String[][] board, int[] move) {
        boolean inBound = move[0] >= 0
                && move[1] >= 0
                && move[0] < BOARD_SIZE
                && move[1] < BOARD_SIZE;
        boolean emptyCell;

        if (!inBound) {
            System.out.println("Move outside board. Try again.");
            return false;
        }

        emptyCell = board[move[0]][move[1]] == null;

        if (!emptyCell) {
            System.out.println("Invalid move! Try again.");
            return false;
        }

        return true;
    }
}
