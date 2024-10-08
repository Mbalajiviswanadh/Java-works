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
        
        System.out.printf("sum: "+sum+"\n"+"Avg: %.1f",avg);
        System.out.println();
        
        System.out.println("Sum: "+sum);
        System.out.printf("Avg: %.1f",avg);
    }
}