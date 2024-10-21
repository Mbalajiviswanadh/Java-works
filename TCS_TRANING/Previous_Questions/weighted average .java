package TCS_TRANING.Previous_Questions;

import java.util.*;


class main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        
        
        float topsum=0;
        float dem=0;
        
        for(int i=0;i<n;i++){
            
            int s=sc.nextInt();
            float w= sc.nextFloat();
            
            topsum+=s*w;
            dem+=w;
        }
        
        float res = topsum/dem;
        
        System.out.printf("%.2f",res);
    }
}