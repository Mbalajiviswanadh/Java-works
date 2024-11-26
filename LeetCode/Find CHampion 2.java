import java.util.*;
class Solution {
    public int findChampion(int n, int[][] edges) {
        // taking a boolean array of size n 
        // initially all values are TRUE
        // now Traverse throgh the edges and edge[i][1] which means the second value [a,b] b-> loser
        // when we encounter loser, modify that perticual index to false in boolean array
        // after done with above step, set a variable res as champion, count
        // now traverse throgh that boolean array and modify the champion when boolean arry is true and increase count
        // if count =1 return champion else return -1


        boolean[] isUndefeated = new boolean[n];

        Arrays.fill(isUndefeated, true);

        for(int[] x : edges){
            int winner = x[0];
            int loser = x[1];
            isUndefeated[loser] = false;
        }

        int champion = -1;
        int numOfchampion = 0;

        for(int i =0;i<n;i++){

            if(isUndefeated[i]){
                champion = i;
                numOfchampion++;
            }
        }


        return numOfchampion ==1? champion : -1;
    }
}