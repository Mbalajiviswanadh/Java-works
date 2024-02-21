import java.util.*;
public class Bitwise_And {
    public static int bitwise_And(int left , int right){

        /* -----------Recursion----------- 
        // base case 
        // if(left==right)
        //     return left;

        // int mid = (left+right)/2;

        // int left_Side_AND =bitwise_And(left, mid);
        // int right_Side_AND = bitwise_And(mid+1, right);

        // return left_Side_AND & right_Side_AND;
        */

        int bitwiseANDResult=left;

        for(int i=left+1;i<=right;i++){
           return  bitwiseANDResult &=i;
        }
        return bitwiseANDResult;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the left and right values:");
        int left = sc.nextInt();
        int right = sc.nextInt();

        int result = bitwise_And(left, right);

        System.out.println("The Result of Bitwse AND is :"+result);
        
    }
}
