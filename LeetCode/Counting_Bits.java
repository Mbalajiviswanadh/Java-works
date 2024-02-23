import java.util.*;
public class Counting_Bits {

    public static int[] couningBits(int n){

        //creating new array 
        int new_nums[] = new int[n+1];

        for(int i=0;i<=n;i++){
            new_nums[i] = new_nums[i/2] +i%2;
        }
        return new_nums;

    }



    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int result[]= couningBits(n);
        System.out.println("The new number array after cointing the bits(1) is : ");

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        
    }    
}
