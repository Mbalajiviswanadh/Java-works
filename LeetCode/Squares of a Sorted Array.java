import java.util.*;
class Squares_SortedArray {

    public static int[] SquaringandSorting(int nums[], int n){
        // creating the new array for storing the answer

        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            // doing squaring 
            ans[i]=nums[i]*nums[i];
            
        }
        Arrays.sort(ans);
        return ans;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n =sc.nextInt();

        int nums[]=new int[n];
        System.out.println("insert the values insde :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        // calling the function 
        int result[]=SquaringandSorting(nums, n);

        System.out.println("Result :");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
