import java.util.*;

class SortColors{
    public static int[] sortingnums(int nums[],int n){

        int zeros=0,ones=0,twos=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0)
            zeros++;
            else if(nums[i]==1)
            ones++;
            else
            twos++;
        }

        int idx=0;
        for(int i=0;i<zeros;i++){
            nums[idx]=0;
            idx++;
        }
        for(int i=0;i<ones;i++){
            nums[idx]=1;
            idx++;
        }
        for(int i=0;i<twos;i++){
            nums[idx]=2;
            idx++;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arry:");
        int n =sc.nextInt();

        int nums[]= new int[n];
        System.out.println("Enter the values inside:");

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int res[]= sortingnums(nums, n);
        for(int i:res){
            System.out.print(i+" ");
        }
        sc.close();

    }
}