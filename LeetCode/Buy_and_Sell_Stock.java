import java.util.*;
public class Buy_and_Sell_Stock {

    public static int bestTimetoBuyandSell(int nums[], int n){
        int max_pro=0;
        int min_price=nums[0];
        int day_pro=0;

        for(int i=0;i<n;i++){
            min_price=Math.min(min_price, nums[i]);
            day_pro = Math.max(day_pro,nums[i]-min_price);

            max_pro=Math.max(max_pro, day_pro);
        }
        return max_pro;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("ENter the values:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int result = bestTimetoBuyandSell(nums, n);
        System.out.println("The Max Profect will be: "+ result);
    }
}
