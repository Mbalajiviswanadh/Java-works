

class MedianOfTwoSortedArrays{


    public static double findMedian(int nums1[], int nums2[]){

        int n1=nums1.length;
        int n2=nums2.length;

        int i=0;
        int j=0;
        int idx=0;

        int res[]= new int[n1+n2];
        
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j])
            res[idx++]=nums1[i++]
            else
            res[idx++]=nums2[j++];
            
        }

        while(i<n1)
        res[idx++]=nums1[i++];

        while(j<n2)
        res[idx++]=nums2[j++];


        double mid;

        int m=res.length;

        if(m%2==0)
        mid=(res[m/2-1] + res[m/2])/2.0;
        else
        mid=(res[m/2]);

        return Math.round(mid*1e5)/1e5;
    }

}