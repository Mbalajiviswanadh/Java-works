package Recuression;
import java.util.*;
class String_reverse {
    
    public static void PrintReverse(String str, int index){

        //base case
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }


        //recursion
        System.out.print(str.charAt(index));
        PrintReverse(str,index-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write any thing.. :");
        String str = sc.nextLine();

        //calling function 
        PrintReverse(str,str.length()-1);
    }
}
