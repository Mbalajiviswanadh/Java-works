import java.util.*;

class Intersection_of_TwoArrays{
    public static int[] getTheCommonValu(int nums1[],int nums2[]){

        HashSet<Integer> hs1= new HashSet<>();
        HashSet<Integer> common_val= new HashSet<>();

        for(int nums_1 : nums1){
            hs1.add(nums_1);
        }

        for(int nums_2 : nums2){
            if(hs1.contains(nums_2))
            common_val.add(nums_2);
        }

        int res[]= new int[common_val.size()];
        int i=0;
        for(int val : common_val){
            res[i++] = val;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array 1 :");
        int n1 = sc.nextInt();
        int nums1[]=new int[n1];
        System.out.println("Enter the values inside :");
        for(int i=0;i<n1;i++){
            nums1[i]=sc.nextInt();
        }

        System.out.println("Enter the size of the array 2 :");
        int n2 = sc.nextInt();
        int nums2[]=new int[n2];
        System.out.println("Enter the values inside :");
        for(int i=0;i<n2;i++){
            nums2[i]=sc.nextInt();
        }

        int result[] =getTheCommonValu(nums1, nums2);
        System.out.println("Result Common value is :");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();

    }
}