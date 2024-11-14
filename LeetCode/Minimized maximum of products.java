import java.util.*;
class Solution {
    public int minimizedMaximum(int n, int[] q) {
        int l =1;
        int r = Arrays.stream(q).max().getAsInt();
        while(l<r){
            int mid = (l+r)/2;
            int needed=0;

            for(int i: q){
                needed +=(i+mid-1) /mid;
            }
                if(needed<=n)
                r=mid;
                else
                l=mid+1;
        }
        return l;
    }
}