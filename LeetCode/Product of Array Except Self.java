import java.util.*;
class Product_of_Array_Except_Self{

    public static int[] solution(int nums[],int n){
        int left[]=new int[n];
        int right[]=new int[n];
        int ans[]=new int[n];

        // strting index of left
        left[0]=1;
        for(int i=1; i<n;i++){
            left[i]=left[i-1] * nums[i-1];
        }

        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1] * nums[i+1];
        }

        for(int i=0;i<n;i++){
            ans[i]= left[i] * right[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        System.out.println("Enter the values inside :");
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<n;i++){
            int result[] = solution(nums, n);
            res.add(result[i]);
        }

        System.out.println("Result output :");
        System.out.print(res);
    }
}