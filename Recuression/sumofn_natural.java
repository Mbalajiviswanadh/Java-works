package Recuression;
import java.util.*;

class sumofn_natural {
    
    public static void sumofn_natural(int i,int n, int sum ){
        //base case
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;

        }
        //work 
        sum+=i;
        //rcursion
        sumofn_natural(i+1,n, sum);



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number : ");
        int n = sc.nextInt();

        //calling the function 
        sumofn_natural(1, n, 0);

    }
}
