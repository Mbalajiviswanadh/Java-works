import java.util.*;
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // for(int i=0;i<matrix.length;i++){

        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==target)
        //         return true;
        //     }
        // }
        // return false;


        int l=0;
        int r=matrix[0].length-1;

        while(l<matrix.length && r>=0){

            // int mid= l+(r-l)/2;

            // if(matrix[mid][0]==target)
            // return true;
            // else if(matrix[mid][0] > target)
            // r=mid-1;
            // else
            // l=mid+1;

            if(matrix[l][r]==target)
            return true;
            else if(matrix[l][r]>target)
            r--;
            else 
            l++;
        }
        return false;
        


    }
}