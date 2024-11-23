import java.util.*;
class Solution {
    public char[][] rotateTheBox(char[][] box) {
        // we are noting the index which comes just beofre '*'
                // which is dropPos
        // if we find '#' we are swapping the value which is in dropPos with the currpos
        // if we find '.' we are not doing anything 

        // for rotating 90 degree we are getting the value of original box and placing it in [j][m-1-i] position


        int m =box.length;
        int n =box[0].length;

        for(char[] row : box){

            int dropPos = n-1;

            for(int i=n-1;i>=0;i--){

                if(row[i]=='*'){
                    dropPos = i-1; // position just before the * 
                }
                else if(row[i]=='#'){
                    char temp = row[dropPos];
                    row[dropPos]=row[i];
                    row[i]=temp;
                    dropPos--;  //decreasing to the left-next position after swapping 
                }
            }
        }
        // rotating
        char[][] resBox = new char[n][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                resBox[j][m-1-i]=box[i][j];
            }
        }
        return resBox;
    }
}