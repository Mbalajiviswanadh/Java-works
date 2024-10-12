import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set  = new HashSet<>();

        for(int i: candyType){
            if(!set.contains(i))
            set.add(i);
        }

        int size=set.size();

        int eat=candyType.length/2;

        if(size>=eat)
        return eat;
        else
        return size;
    }
}