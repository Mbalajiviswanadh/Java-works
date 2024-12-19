class Solution {
    public int maxChunksToSorted(int[] arr) {
        // keep tracking of maxvalue in the arr
        // keep on checking if the idx i == maxval 
        // increase count

        int count=0;
        int maxval=0;

        for(int i=0;i<arr.length;i++){

            maxval = Math.max(maxval, arr[i]);

            if(maxval ==i )
            count++;
        }
        return count;
    }
}