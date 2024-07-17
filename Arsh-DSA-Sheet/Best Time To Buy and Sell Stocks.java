import java.util.*;

class BestTimeTOBuyand_SellStock{

    public static int solve(int[] nums){
        int min_profit=nums[0]; // first element
        int max_profit=0;

        for(int i: nums){
            min_profit=Math.min(min_profit,i);

            int curr_profit=i-min_profit;

            max_profit=Math.max(max_profit, curr_profit);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.print(solve(nums));        
    }
}