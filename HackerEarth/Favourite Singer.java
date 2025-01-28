package HackerEarth;

import java.util.*;

class TestClass{


    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        int n=sc.nextInt();

        Map<Long, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            long singer= sc.nextLong();

            map.put(singer, map.getOrDefault(singer,0)+1);
        }

        int maxnum=0;
        for(int i: map.values()){
            maxnum=Math.max(maxnum,i);
        }

        int count=0;
        for(int i:map.values()){
            if(maxnum==i)
            count++;
        }
        System.out.print(count);
    }
}