import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        // taking a hashmap key = arr[i] ; value = number of times repeated
        // taking set and adding values of the map
        // checking there sizes

        Map<Integer, Integer> map = new HashMap<>();

        for(int i: arr){
            map.put(i, map.getOrDefault(i,0)+1);

        }

        Set<Integer> set = new HashSet<>();

        for(int i: map.values()){

            set.add(i);
        }

        return set.size()==map.size();


    }
}