import java.util.*;
class Two_Sum_II  {

    public static int[] fidningTwoSum(int numbers[],int n, int target){
        int i=0;
        int j=n-1;
        int ans[]=new int[2];

        while(j>i){
            int sum = numbers[i]+numbers[j];

            if(sum==target){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }else if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }


        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();

        int numbers[]= new int[n];

        System.out.println("Enter the values inside :");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the target value :");
        int target=sc.nextInt();

        // calling the funtion 
        int result[]=fidningTwoSum(numbers, n, target);
        System.out.println("Result :");
        for(int i=0;i<result.length;i++){
           

                System.out.print(result[i]+" ");
            

        }
        
    }
}
