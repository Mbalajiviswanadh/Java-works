class Solution {
    public int[] minOperations(String boxes) {
        // 1. i need to move all the balls to each idx
        // 2. and stroing the number of operations it takes to move all zeros to each index

        int res[] = new int[boxes.length()];


        int count=0;
        int ops=0;
        //left to right
        for(int i=0;i<boxes.length();i++){
            res[i]+=ops;

            if(boxes.charAt(i)=='1')
            count++;

            ops+=count;
        }

        count=0;
        ops=0;

        //right to left 
        for(int i=boxes.length()-1;i>=0;i--){

            res[i]+=ops;
            if(boxes.charAt(i)=='1')
            count++;

            ops+=count;
        }

        return res;

        /*int left[] =new int[boxes.length()];
        int right[] =new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            
            for(int j=i+1;j<boxes.length();j++){

                if(boxes.charAt(j)=='1'){
                    left[i]+=Math.abs(j-i);
                }
            }
        }

        for(int i=boxes.length()-1;i>=0;i--){

            for(int j=i-1;j>=0;j--){
                if(boxes.charAt(j)=='1')
                right[i]+=Math.abs(j-i);
            }
        }

        int res[]= new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            res[i]=left[i]+right[i];
        }
        
        return res;

        */

    }
}