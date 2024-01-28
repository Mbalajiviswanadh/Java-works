package Recuression;
import java.util.*;

public class x_power_n_height_n {

    public static int calpower(int x, int n){

        //base case
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        //recursin
        int x_powerof_n_mins_1 = calpower(x, n-1);
        int x_power_n = x*x_powerof_n_mins_1;
        return x_power_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x number :");
        int x = sc.nextInt();
        System.out.println("Enter the n number :");
        int n = sc.nextInt();

        //calling the function 
        int ans = calpower(x, n);
        System.out.println(ans);


        
    }
}
