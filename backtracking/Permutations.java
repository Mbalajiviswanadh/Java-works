package backtracking;

import java.util.*;

class Permutations{

    public static void PrintPermutaion(String str, String perm,int n , int idx){
        //base case
        if(n == 0){
            System.out.println(perm);
            return;
        }



        for(int i =0; i<n;i++){

            //getting the 1st value of index i at each itration 
            char ch=str.charAt(i);
            //stroing remaning characters in new string
            String newString = str.substring(0,i) + str.substring(i+1);

            PrintPermutaion(newString,perm+ch,idx+1, i);
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        int n =str.length();

        //intialising the perm as empty string, beacuse we can store new string here
        String perm ="";

        PrintPermutaion(str,perm,n,0);


    }
}