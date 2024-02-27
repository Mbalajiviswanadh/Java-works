import java.util.*;
public class Three_Sum_Closest {

    public static int threeSumClosest(int nums[], int n, int target ){
        Arrays.sort(nums);
        int closest_sum= nums[0]+nums[1]+nums[2];

        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;

            while(l<r){
                int sum = nums[i] +nums[l]+nums[r];

                if(Math.abs(target-sum)< Math.abs(target-closest_sum)){
                    closest_sum=sum;
                }
                else if(sum<target) l++;
                else r--;
            }
        }
        return closest_sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("Enter the arget value :");
        int target = sc.nextInt();

        // calling the function 
        int result = threeSumClosest(nums, n, target);
        System.out.println("The closest sum for target value is : "+result);
    }
}
