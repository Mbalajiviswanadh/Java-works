package Recuression;
import java.util.*;
public class x_power_n_height_logn {


    public static int calpower(int x , int n){

        //base case
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
    
    
        //recursion 
        if(n % 2 ==0){
            int x_power_n_even = calpower(x, n/2) * calpower(x, n/2);
            return x_power_n_even;
        }
        else{
            int x_power_n_odd = calpower(x,n/2) * calpower(x, n/2) * x;
            return x_power_n_odd;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value:");
        int x = sc.nextInt();
        System.out.println("Enter n value:");
        int n = sc.nextInt();

        //calling the function 
        int ans = calpower(x, n);
        System.out.println(ans);



    }
}
