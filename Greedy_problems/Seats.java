package Greedy_problems;

import java.util.*;
class Solution {
   
    public int seats(String A) {
        List<Integer> pos= new ArrayList<>();
        
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='x')
            pos.add(i);
        }
        if(pos.size()==0 || pos.size()==1)
        return 0;
        int medianIdx=pos.size()/2;
        
        int median=pos.get(medianIdx);
        
        int targetPos= median-medianIdx;
        long mod=10000003;
        long hops=0;
        for(int i: pos){
            hops+=Math.abs(i-targetPos);
            targetPos++;
        }
        
        return (int) (hops%mod);
    }
}
