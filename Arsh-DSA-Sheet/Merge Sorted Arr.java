import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

    int i=m-1;
    int j=n-1;
    int k=m+n-1;

    while(i>=0 && j>=0){

        if(nums1[i] > nums2[j])
        nums1[k--]=nums1[i--];
        else
        nums1[k--]=nums2[j--];
    }

    while(j>=0)
    nums1[k--]=nums2[j--];
    
    
    //    int i=m-1;
    //    int j=n-1;
    //    int k=m+n-1;

    //    while(i>=0 && j>=0){
    //         //if the element is largest then we are storing it in the last of the new array
    //        if(nums1[i] > nums2[j])
    //        nums1[k--]=nums1[i--];
    //        else
    //        nums1[k--]=nums2[j--];
    //     }
    //     // if there are remaning elemnts in nums2 then just insert them into nums1

    //     while(j>=0)
    //     nums1[k--]=nums2[j--];
    // int size=nums1.length-nums2.length;
    // int idx=0;
    // int n1=0;
    // int n2=0;
    // while(n1<size && n2<nums2.length){
    //     if(nums1[n1]<nums2[n2] || nums1){
    //         nums1[idx++]=nums1[n1++];
    //     }
    //     else{
    //         nums1[idx++]=nums2[n2++];
    //     }
    // }
    // while(n2<nums2.length){
    //     nums1[idx++]=nums2[n2++];
    // }

    // // return nums1;

       
    }
}