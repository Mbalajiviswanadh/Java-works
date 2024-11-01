import java.util.*;
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        // method 1
        // Map<Integer, Integer> map = new HashMap<>();

        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i], i);
        // }

        // int maxval=arr[0];
        // for(Map.Entry<Integer, Integer> val: map.entrySet() ) {

        //     maxval=Math.max(maxval, val.getKey());
        // }

        // return map.get(maxval);


        // method 2
        /*
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i] && arr[i+1]<arr[i])
            return i;
        }
        return 0;

        */

        // method 3

        // using Binary Search Algo

        int l=1;
        int r=arr.length-2;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(arr[mid-1] < arr[mid] && arr[mid]> arr[mid+1])
            return mid;
            
            if(arr[mid-1]<arr[mid])
            l=mid+1;
            else
            r=mid-1;
        }
        return 0;



    }
}