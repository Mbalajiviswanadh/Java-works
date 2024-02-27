package backtracking;

// import java.util.Scanner;

//  class NQueens {

 
    
//     private static boolean solveNQueens(int[][] board, int col) {
//         int N = board.length;

//         //base case
//         if (col >= N) {
//             return true;
//         }
        
        
//         for (int i = 0; i < N; i++) {
//             if (isSafe(board, i, col)) {
//                 board[i][col] = 1;
//                 if (solveNQueens(board, col + 1)) {
//                     return true;
//                 }
//                 board[i][col] = 0;
//             }
//         }
//         return false;
//     }

//     //function for safe
//     //conditions for topleft, same column , bottom left
//     private static boolean isSafe(int[][] board, int row, int col) {
//         int N = board.length;
   
        
//         for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 1) {
//                 return false;
//             }
//         }

//         for (int j = col; j>=0; j--) {
//             if (board[row][j] == 1) {
//                 return false;
//             }
//         }
        
//         for (int i = row, j = col; i < N && j >= 0; i++, j--) {
//             if (board[i][j] == 1) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     private static void printBoard(int[][] board) {
//         int N = board.length;
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < N; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter Number of Queens :");
//         int N = scanner.nextInt();
//         int[][] board = new int[N][N];
        
//         if (solveNQueens(board, 0)) {
//             printBoard(board);
//         } else {
//             System.out.println("No solution exists.");
//         }
//     }
// }




import java.util.*;

class N_Queens{

    //  findng the safe place 

    public static boolean isSafe(int board[][],int row, int col,int n){
        int i,j;

        for( j=col;j>=0;j--){
            if(board[row][j] ==1){
                return false;
            }
        }
        for( i=row , j=col; i>=0 && j>=0; i--, j--){
            if(board[i][j]==1){
                return false;
            }
        }

        for(i=row,j=0;i<n && j>=0 ;i++,j--){
            if(board[i][j] ==1){
                return false;
            }
        }

        return true;
    }


    // sloving the N_queesn

    public static boolean Solve_N_Queens(int board[][],int col,int n){

        if(col>=n){
            return true;
        }

        for(int i=0;i<n;i++){
            if(isSafe(board,i,col,n)){
                
                board[i][col]=1;
                if(Solve_N_Queens(board,col+1,n)){
                    return true;
                }
            }
            board[i][col]=0;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the size of an of CHess Board :");
        int n = sc.nextInt();

        int board[][]= new int[n][n];

        if(Solve_N_Queens(board, 0, n)){
            for(int i=0;i<n;i++){
                for(int j =0;j<n;j++){
                    System.out.print(" "+board[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}