import java.util.*;
public class Duplicate_orNot {
    
    public static boolean duplicate_Or_not(int n,int nums[]){
        Arrays.toString(nums);
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
    
    // public static boolean DuplicateOrNot_while(int n,int nums[]){

    //     Arrays.sort(nums);
    //     int i=1;
    //     while (i<n) {
    //         if(nums[i]==nums[i-1]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size fo an array :");
        int n = sc.nextInt();
        int nums[]= new int[n];
        System.out.println("Enter the vales inside:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        // System.out.println("The Result usng while is :"+DuplicateOrNot_while(n, nums));
        System.out.println("The Result is :"+duplicate_Or_not(n, nums));
    }
}
