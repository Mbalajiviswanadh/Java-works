class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int s1 = nums1.length;

        int s2 = nums2.length;

        int n1=0;
        int n2=0;

        if( s1%2!=0){
            for(int i: nums2){
            n2^=i;

            }
        }

        if( s2%2!=0){
            for(int i: nums1){
            n1^=i;

            }
        }


        return n1^ n2;
    }
}