import java.util.*;

class Main{
    
    public static int gcd_euclidean(int x, int y){
        while(y!=0){
            int temp=y;
            
            y = x% y;
            x=temp;
        }
        return x;
    }
    
    public static int gcd_recursion(int x, int y){
        if(y==0)
        return x;
        
        return gcd_recursion(y, x%y);
    }
    
    public static void main(String[] args){
        System.out.println("GCD using Euclidean algo: "+gcd_euclidean(9,28));
        System.out.println("GCD using Recursion algo: "+gcd_recursion(9,28));
    }
}