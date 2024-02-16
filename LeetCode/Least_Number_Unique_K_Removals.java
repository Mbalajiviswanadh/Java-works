import java.util.*;

class Least_Number_Unique_K_Removals {

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int nums: arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }

        PriorityQueue<Integer> pq= new PriorityQueue<>(map.values());

        while(k>0){
            k-=pq.poll();
        }
        return k<0 ? pq.size() +1:pq.size();
        
    }    

    public static void main(String[] args) {
        
    }
}
