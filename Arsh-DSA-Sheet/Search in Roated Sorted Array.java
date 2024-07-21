import java.util.*;
class SearchinRoatedSortedArray {

    public static int solve(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i : nums){
            if(i==target)
            return map.get(i);
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int nums[]= new int[n];

        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }

        System.out.println("Enter the Target value :");
        int target=sc.nextInt();

        System.err.println(solve(nums,target));
        sc.close();
    }
}
