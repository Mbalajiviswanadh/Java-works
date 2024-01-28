package Recuression;
import java.util.*;
public class n_factorial {
    
    public static int factorial(int  n ){

        //base case
        if( n==1 || n==0){
            return 1;
        }

        //work


        //recursion
        // factorial(n-1);
        int factorial_n_mins_1 =factorial(n-1);
        int factorial_actual_n= n*factorial_n_mins_1;
        return factorial_actual_n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number to faactorial:");
        int n = sc.nextInt();

        int ans = factorial(n);
        System.out.println(ans);



    }
}
