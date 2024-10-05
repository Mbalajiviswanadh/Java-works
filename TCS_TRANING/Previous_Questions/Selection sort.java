package TCS_TRANING.Previous_Questions;

import java.util.*;
class Solution
{
    int  select(int arr[], int i)
    {
        // code here such that selectionSort() sorts arr[]
        int min=i;
        
        for(int j=i+1;j<arr.length;j++){
            
            if(arr[j]< arr[min])
            min=j;
        }
        return min;
        
    }
    
    void selectionSort(int arr[], int n)
    {
        for(int i=0;i<arr.length;i++){
            int minval =select(arr,i);
            
            int temp=arr[minval];
            arr[minval]=arr[i];
            arr[i]=temp;
        }
    }
}