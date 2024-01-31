package backtracking;

import java.util.Scanner;

 class NQueens {

 
    
    private static boolean solveNQueens(int[][] board, int col) {
        int N = board.length;

        //base case
        if (col >= N) {
            return true;
        }
        
        
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                if (solveNQueens(board, col + 1)) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }

    //function for safe
    //conditions for topleft, same column , bottom left
    private static boolean isSafe(int[][] board, int row, int col) {
        int N = board.length;
   
        
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int j = col; j>=0; j--) {
            if (board[row][j] == 1) {
                return false;
            }
        }
        
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    private static void printBoard(int[][] board) {
        int N = board.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Queens :");
        int N = scanner.nextInt();
        int[][] board = new int[N][N];
        
        if (solveNQueens(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
