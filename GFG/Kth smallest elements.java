package GFG;


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int key = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, key));
            out.println("~");
        }
        out.flush();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int kthSmallest(int[] nums, int k) {
        // Your code here
        
        // To find the kth smallest value in the nums
        // without using any inbuilt soring method
        
        // we can do it by using Counting sort
        
        int maxValue = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            
            maxValue = Math.max(maxValue, nums[i]);
        }
        
        
        // frequency array
        
        int freq[] = new int[maxValue+1];
        for(int i: nums)
        freq[i]++;
        
        int count=0;
        for(int i=0;i<freq.length;i++){
            
            count+=freq[i];
            
            if(count>= k)
            return i;
        }
        return -1;
    }
}
