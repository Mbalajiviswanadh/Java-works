import java.util.*;
class FindPeakElement {

    public static int solve(int nums[]){

        int res =0;

        for(int i=1;i<nums.length;i++){
            if(nums[res] <nums[i])
            res=i;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[]= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println(solve(nums));
        sc.close();
    }
}
