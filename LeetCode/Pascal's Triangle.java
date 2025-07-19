import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<numRows;i++){

            List<Integer> inlist = new ArrayList<>();

            for(int j=0;j<=i;j++){

                if(j==0 || j==i){

                    inlist.add(1);
                }
                else{

                    int insum = res.get(i-1).get(j-1)+ res.get(i-1).get(j);
                    inlist.add(insum);
                }

            }

                res.add(inlist);
        }
        return res;
    }
}