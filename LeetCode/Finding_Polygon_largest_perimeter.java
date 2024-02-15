import java.util.*;
class Finding_Polygon_largest_perimeter {

    // public static long largestperimeeter(long nums[], int n){

    //     long newarray[] = new long[n];

    //     newarray[0]=nums[0];
    //     for(int i=1;i<n;i++){
    //         newarray[i] =(long)newarray[i-1] +(long)nums[i];
    //     }
    //     for(int i=n-1;i>=2;i--){
    //         if((long)newarray[i-1] > (long)nums[i]){
    //             return (long)newarray[i];
    //         }
    //     }
    //     return -1;

    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum of the array :");
        int n =sc.nextInt();

        long nums[] = new long[n];
        System.out.println("Enter +ve Integers :");
        for(int i=0; i<n;i++){
            nums[i] =sc.nextInt();
        }

        // System.out.print("The Final Result is : " +largestperimeeter(nums,n));
    }
}
