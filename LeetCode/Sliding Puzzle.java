import java.util.*;
class Solution {

    public String swap(String curr, int i, int j){
        char arr[] = curr.toCharArray();
        char temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        return new String(arr);
    }
    public int slidingPuzzle(int[][] board) {
        int m = board.length;
        int n =board[0].length;

        // target string
        String target  = "123450";

        // geting the board avlues in string formate
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){
                sb.append(board[i][j]);
            }
        }

        int[][] possibleMoves = {

            {1, 3},
            {0, 2, 4},
            {1, 5},
            {0, 4},
            {1, 3, 5},
            {4, 2}
        };



        Queue<String> q = new LinkedList<>();
        // for verifing whether the value is visited or not
        Set<String> set = new HashSet<>();

        q.add(sb.toString());
        set.add(sb.toString());

        int count =0;
        while(!q.isEmpty()){

            int size = q.size();

            for(int i=0;i<size;i++){
                String curr= q.poll();
                if(curr.equals(target))
                return count;

                int indexof_0 = curr.indexOf('0');
                for(int x: possibleMoves[indexof_0]){
                    String temp = swap(curr, x, indexof_0);

                    if(!set.contains(temp)){
                        q.add(temp);
                        set.add(temp);
                    }
                }
            }
            count++;
        }
        return -1;

    }
}