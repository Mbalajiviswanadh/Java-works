package TCS_TRANING.Previous_Questions;


import java.util.*;

class main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        
        int sum=0;
        
        for(int i=1;i<=n/2;i++){
            
            if(n%i==0)
            sum+=i;
        }
        
        if(sum==n)
        System.out.print("True");
        else
        System.out.print("False");
        
    }
}