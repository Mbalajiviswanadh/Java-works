import java.util.*;
class Solution {
    public int[][] merge(int[][] in) {
        
        if(in.length<=1)
        return in;

        Arrays.sort(in, (a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();

        int temp[]= in[0];

        for(int a=1;a<in.length;a++){

            if(temp[1] >=in[a][0]){
                temp[1]= Math.max(temp[1], in[a][1]);
            }
            else{
                list.add(temp);
                temp=in[a];
            }
        }

        list.add(temp);

        int  res[][] = list.toArray(new int[0][]);
        return res;
    }
}