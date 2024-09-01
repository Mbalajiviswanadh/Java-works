import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res= new ArrayList<>();

        int maxcandies=0;
        for(int i: candies){
            maxcandies=Math.max(maxcandies,i);
        }

        for(int i: candies){
            int x = i+extraCandies;

            if(x < maxcandies)
            res.add(false);
            else
            res.add(true);
        }
        return res;

        // for(int i=0;i<candies.length;i++){

        //     int x= candies[i]+extraCandies;

        //     boolean flag = true;

        //     for(int j=0;j<candies.length;j++){
        //         if(x< candies[j]){
        //             flag=false;
        //             break;
        //         }
        //     }
        //     res.add(flag);
        // }
        // return res;
    }
}