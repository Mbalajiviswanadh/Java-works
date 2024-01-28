package Recuression;
import java.util.*;
 class printNumbers_1_to_n {

    //function 
    public static void printnumbers(int f_number, int n_number){

        //base case
        if(f_number==n_number){
            return;
        }

        //work
        System.out.println(f_number);
        //recursion
        printnumbers(f_number+1, n_number);   //her we are incrementing +1 means stating from 1 to n {1,2,3,4,....n}

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entern the 1th (starting) number : ");
        int a =sc.nextInt();

        int f_number= a;

        System.out.println("Entern the nth (last) number : ");
        int n= sc.nextInt();

        int n_number=n;

        printnumbers(f_number,n_number);



    }


}
