import java.util.*;
public class MaxSUb_product {

        public static  int finding_maxProduct(int nums[],int n){

            int ans=nums[0];
            int leftProduct=1;
            int rightProduct=1;

            for(int i=0;i<n;i++){

                if(leftProduct==0 && rightProduct==0){
                    leftProduct=1;
                    rightProduct=1;
                }
                /*
                 * or
                 * leftProduct= leftProduct==0?1:leftProduct;
                 * rightProduct=rightProduct==0?1:rightProduct;
                 */


            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter the values inside:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
    }
}
