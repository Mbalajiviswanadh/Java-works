import java.util.*;

class RateInMaze{
    static char res[][] ;

    public static boolean mazeSolve(int[][] maze, int x, int y){
        // base case
        // when the x and y reaches the end of the maze it should store 'X' which represents the END and return true

        if(x==maze.length-1 && y==maze[0].length-1){
            res[x][y]='X';
            return true;
        }


        // solving 
        // Rate will take action only the if it possible
        if(isPossible(maze, x, y)){

            // recursion
            // Moving right
            if(mazeSolve(maze, x, y+1)){
                res[x][y]='R';
                return true;
            }

            // moving Down
            if(mazeSolve(maze, x+1,y)){
                res[x][y]='D';
                return true;
            }

            // either of those two dont work 

            // Backtaracking will takes place
            res[x][y]='.';
        }
        return false;
    }

    static boolean isPossible(int [][]maze, int x, int y){
        if(x>=0 && y>=0 && x<maze.length && y<maze[0].length && maze[x][y]==1)
        return true;
        else
        return false;
    }

    public static void main(String[] args) {
        
        int maze[][]={
            {1, 1, 1, 1, 0} , 
                        {0, 0, 0, 1, 1} ,
                        {1, 1, 1, 1, 1} ,
                        {1, 0, 0, 0, 1} ,
                        {1, 1, 1, 1, 1}
        };

        res= new char[maze.length][maze[0].length];

        for(int i=0;i<maze.length;i++){
            Arrays.fill(res[i], '.');
        }

        
        if(mazeSolve(maze, 0, 0)){
            for(char i[] : res){
                for(char j: i){
                    System.out.print(" "+j+" ");
                }
                System.out.println();
            }

        }
        else
        System.out.println("NOT POSSIBLE");

    }
}