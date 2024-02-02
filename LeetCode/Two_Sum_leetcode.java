import java.util.Scanner;

class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){

                    int[] result = {i,j};
                    
                    return result;                
                }
            }
            
        }
        return nums;       

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr the size of array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the num values:");
        for(int i =0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the targer value:");
        int target =sc.nextInt();
            

        
        int[] result = twoSum(nums, target);


        System.out.println("The final Result is : " +result[0] +"," +result[1]);
        
        

        

    }
}

