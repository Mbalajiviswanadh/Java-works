import java.util.*;
class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        Map<String,Integer> map = new HashMap<>();

        for(String i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<String> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                list.add(arr[i]);
            }
        }

        if(k<=list.size())
        return list.get(k-1);
        
        return "";
  
    }
}