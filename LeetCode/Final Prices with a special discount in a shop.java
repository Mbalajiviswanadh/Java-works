import java.util.*;
class Solution {
    public int[] finalPrices(int[] prices) {
        // 1. new array for res
        // 2. we have to find the discount:
        //   a) if p[i] where i = curr idx, and j > i and j should be min idx but > i
        //   b) and p[i] >= p[j]
        //   c) while finding discount make sure p[i] curr value should be greater then discounr_idx_vaue

        int res[] = new int[prices.length];
        int k =0;
        
        for(int i=0;i<prices.length;i++){

            res[i]=prices[i];

            for(int j=i+1;j<prices.length;j++){

                if(prices[i]>=prices[j]){
                    res[i] = prices[i]-prices[j];
                    break;
                }
            }

        }
        return res;


        /*
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            
            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = prices[idx] - prices[i];
            }
            stack.push(i);
        }
        
        // Remaining indices in the stack have no discounts
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            res[idx] = prices[idx];
        }
        
        return res;
        */
        
    }
}