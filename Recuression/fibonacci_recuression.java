package Recuression;
import java.util.*;
class FibonacciSeries{
    
    public static void Fbseries(int a, int b, int n){

        //base case
        if(n==0){

            return;
        }


        //for the 3rd value
        int c = b+a;
        System.out.println(c);


        Fbseries(b, c, n-1);   //here we are doing recurission 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth Number: ");
        int n= sc.nextInt();

        int a =0; // 1st number
        int b= 1; // 2nd number
        System.out.println(a);
        System.out.println(b);

        Fbseries(a, b, n-2);


    }
}