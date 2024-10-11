package Greedy_problems;

import java.util.*;

class Disjoint_Intervals{
    public static int solve(ArrayList<ArrayList<Integer>> nums){
        

        Collections.sort(nums, new Comparator<ArrayList<Integer>>(){
            
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
                return a.get(1)-b.get(1);
            }
        });

        int count=0;
        int last_end=0;

        for(int i=0;i<nums.size();i++){

            if(nums.get(i).get(0) > last_end){
                count++;
                last_end=nums.get(i).get(1);
            }
        }

        return count;


    }
}