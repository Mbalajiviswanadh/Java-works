package TCS_TRANING.OCT_3_paper_codes;
import java.util.*;

class Avg_and_Sum{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str=sc.nextLine();
        String s[]= str.split("\\s+");
        
        int nums[]= new int[s.length];
        
        for(int i=0;i<s.length;i++){
            nums[i]=Integer.parseInt(s[i]);
        }
        
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        double avg=(double)sum/nums.length;
        
        System.out.print("sum: "+sum+"\n"+"Avg: "+avg);
        
    }
}