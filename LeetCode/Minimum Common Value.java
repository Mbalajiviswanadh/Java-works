import java.util.*;

class Mini_common_values{

    public static int  findCommon(int nums1[],int nums2[],int n1,int n2){
        int i=0;
        int j=0;

        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums1[i]>nums2[j])
            j++;
            else
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array 1 :");
        int n1=sc.nextInt();

        int nums1[]=new int[n1];
        System.out.println("Enter the values inside :");
        for(int i=0;i<n1;i++){
            nums1[i]=sc.nextInt();
        }
        
        System.out.println("Enter the size of the array 2 :");
        int n2=sc.nextInt();

        int nums2[]=new int[n2];
        System.out.println("Enter the values inside :");
        for(int i=0;i<n2;i++){
            nums2[i]=sc.nextInt();
        }

        System.out.println("The Minimin COmmaon value from both arrays is : "+findCommon(nums1, nums2, n1, n2));


    }
}