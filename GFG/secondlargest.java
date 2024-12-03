import java.util.*;
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        
        
        // can we do this using counting sort
        
        int max= Integer.MIN_VALUE;
        int secondmin = -1;
        
        for(int i: arr){
            max = Math.max(max, i);
        }
        
        for(int i=0;i<arr.length;i++){
            
            
            // if(arr[i] > secondmin && arr[i]!=max){
            //     secondmin= arr[i];
            // }
            
            if(arr[i]<max && arr[i]> secondmin)
            secondmin = arr[i];
        }
        return  secondmin;
        
        
    }
}