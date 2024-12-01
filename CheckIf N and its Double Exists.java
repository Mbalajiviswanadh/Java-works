import java.util.*;
class Solution {
    public boolean checkIfExist(int[] arr) {
        
        // Using hash set
        // while checking, check if the curr 2*curr is int the set -> true
        // check if the curr is even if so check curr/2 in the set -> true


        HashSet<Integer> set = new HashSet<>();

        for(int curr: arr){

            if(set.contains(curr*2) || (curr%2==0 && set.contains(curr/2)))
            return true;

            set.add(curr);
        }
        return false;
        
        
        
        
        
        
        
        // broot force 
        // checking everyting that multiplies with 2 and equals to i


        // for(int i=0;i<arr.length;i++){
        //     int icheck = 2*arr[i];
        //     for(int j=i;j<arr.length;j++){

        //         int check  = 2* arr[j];

        //         if(arr[i]==check || icheck==arr[j])
        //         return true;
        //     }
        // }
        // return false;
    }
}