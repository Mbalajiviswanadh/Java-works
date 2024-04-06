import java.util.Scanner;

class Best_Time_to_Buy_and_Sell_Stock_II {
    public static int findingProfit(int prices[],int n){
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter he size of an array: ");
        int n=sc.nextInt();

        int prices[]=new int[n];
        System.out.println("Enter the values inside :");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        // calling the funtion 

        System.out.println("Result is : "+findingProfit(prices, n));
        sc.close();

        
    }
}
