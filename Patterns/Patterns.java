package Patterns;

import java.util.*;
// pattens ----> checking
class main{
    
    static void pattern1(int n){
        
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern2(int n){
        
       for(int i=1;i<=n;i++){
           
           for(int j=1;j<=i;j++){
               System.out.print(j+" ");
           }
           System.out.println();
       }
    }
    static void pattern3(int n){
        
       for(int i=1;i<=n;i++){
           
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       for(int i=1;i<n;i++){
           for(int j=1;j<=n-1-i+1;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       
       System.out.println();
       
       for(int i=1;i<(2*n);i++){
           
           if(i>n){
               for(int j=1;j<=2*n-i;j++){
                   System.out.print("*");
               }
           }
           else{
               for(int c=1;c<=i;c++){
                   System.out.print("*");
               }
           }
           System.out.println();
       }
       
    }
    
    static void pattern4(int n){
        
        for(int i=1;i<=2*n;i++){
            
            int totalc=i>n ? 2*n-i : i;
            
            int spaces=n-totalc;
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
            
            
            for(int j=1;j<=totalc;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern5(int n){
        
        for(int i=1;i<=n;i++){
            
            int spaces=n-i;
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        
        for(int i=1;i<2*n;i++){
            int totalc=i>n ? 2*n-i : i;
            
            int spaces=i>n ? n : n-totalc;
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=totalc;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
    
    public static void main(String[] args){
        int n=5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);

        
    }
}