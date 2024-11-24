class Solution {
    public long maxMatrixSum(int[][] matrix) {
        // finding the sum of all values in matrix
        // while traversing we also find the small value and also neg-values count
        // if the neg-values count = even then just return sum
        // else is neg-values count= odd return the sum - 2* min


        int minvalue =Integer.MAX_VALUE;

        long sum =0;

        int negcount=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){

                if(matrix[i][j] < 0)
                negcount++;
                
                int val = Math.abs(matrix[i][j]);
                
                minvalue = Math.min(minvalue, val);

                sum+=val;
            }
        }
        if(negcount%2==0)  //even
        return sum;
        else
        return sum -2*minvalue;
    }
}