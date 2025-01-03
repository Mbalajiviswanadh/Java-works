import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq= new PriorityQueue<>(
            (a,b)-> b.getValue()-a.getValue()
        );

        pq.addAll(map.entrySet());

        StringBuilder res = new StringBuilder();

        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> element= pq.poll();

            for(int i=0;i<element.getValue();i++){
                res.append(element.getKey());
            }
        }

        return res.toString();
    }
}