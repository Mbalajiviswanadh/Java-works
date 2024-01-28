package Recuression;
import java.util.*;
 class Printnumbers_n_to_1 {
    
    public static void printnumber(int n ){

        //base case
        if(n==0){
            return;
        }

        //work
        System.out.println(n);


        //recurison
        printnumber(n-1);  //here we are printint the number n,n-1,n-2....1 {n to 1}

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entern the nth number:");
        int  n = sc.nextInt();

        //calling the function 

        printnumber(n);


    }
}
