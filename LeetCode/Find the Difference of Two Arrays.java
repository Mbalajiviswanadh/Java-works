import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res  = new ArrayList<>();


        List<Integer> list1= new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i: nums1){
            set1.add(i);
        }
        for(int i: nums2){
            set2.add(i);
        }

        for(int i:set1){
            if(!set2.contains(i))
            list1.add(i);
        }

        for(int i: set2){
            if(!set1.contains(i))
            list2.add(i);
        }


        res.add(list1);

        res.add(list2);

        return res;

    }
}