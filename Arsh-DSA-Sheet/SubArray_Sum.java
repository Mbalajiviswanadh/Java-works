import java.util.*;
class SubArray_Sum {
    
    public static int solve(int nums[], int k){
        
        int count=0;

        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[]= new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        System.out.println();
        System.out.println(solve(nums, k));
    }
}
