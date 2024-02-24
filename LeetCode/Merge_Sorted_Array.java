import java.util.*;

class Merge_sorted_array{

    public static int[] merge(int nums1[],int nums2[],int m,int n){
        // initilizing the idexes at end of arrays
        int i=m-1;
        int j=n-1;
        // new 
        int k=m+n-1;

        while (i>=0 && j>=0) {
            if(nums1[i] > nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }

        // if there are remaning elemnts in nums2, just insert them into the nums1
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
        return nums1;
        // System.out.println("The result Merged Array is: "+nums1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1st array:");
        int a =sc.nextInt();

        int nums1[] = new int[a];
        System.out.println("Enter the values inside:");
        for(int i=0;i<a;i++){
            nums1[i]=sc.nextInt();
        }

        System.out.println("Enter the length for nums1 to for merging:");
        int m=sc.nextInt();
        // ---------------------------------
        System.out.println("Enter the size of 2nd array:");
        int b =sc.nextInt();

        int nums2[] = new int[b];
        System.out.println("Enter the values inside:");
        for(int i=0;i<b;i++){
            nums2[i]=sc.nextInt();
        }

        System.out.println("Enter the length for nums2 to for merging:");
        int n=sc.nextInt();


        //calling the function 
        int result[] = merge(nums1, nums2, m, n);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}