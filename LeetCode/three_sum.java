import java.util.*;
public class three_sum {

    public static List<List<Integer>> threeSum(int nums[],int n){

        if(nums== null || n<3){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        HashSet<List<Integer>> ans = new HashSet<>();

        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right =n-1;

            while(left<right){
                int sum = nums[i] + nums[left] +nums[right];

                if(sum==0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return new ArrayList<>(ans);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();


        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
    }

    
}
