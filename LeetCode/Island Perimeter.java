import java.util.*;

class Isaland_Perimeneter{


    public static int perimeterLength(int grid[][],int n){
        int count=0;

        int row=n;
        int col=grid[0].length;

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(grid[r][c]==1){
                    count+=4;
                    if(r>0&& grid[r-1][c]==1)
                    count-=2;
                    if(c>0&& grid[r][c-1]==1)
                    count-=2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size for grid:");
        int n =sc.nextInt();

        int grid[][]=new int[n][n];
        System.out.println("Enter 0 and 1 :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            grid[i][j]=sc.nextInt();
        }
        sc.close();
        System.out.println("Result : "+perimeterLength(grid, n));

    }
}