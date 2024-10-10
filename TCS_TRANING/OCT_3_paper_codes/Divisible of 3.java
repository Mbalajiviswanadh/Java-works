package TCS_TRANING.OCT_3_paper_codes;
import java.util.*;

class Divisible_of_3{
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        int n =sc.nextInt();
        
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(sum%3==0)
        System.out.print("TRUE");
        else
        System.out.print("FALSE");
        
    }
}