import java.util.*;
class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        backtrack(0, res, path, nums);
        return res;


    }
    public static void backtrack(int idx, List<List<Integer>> res, List<Integer> path, int nums[] ){
                res.add(new ArrayList<>(path));

                for(int i=idx; i<nums.length;i++){
                    path.add(nums[i]);
                    backtrack(i+1, res, path, nums);
                    path.remove(path.size()-1);
                }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of nums: ");
        int n=sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the values inside :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }


        // calling fucntion 
        System.out.println("Result :");
        List<List<Integer>> res = subsets(nums);
        for(List<Integer>  i : res){
            System.out.print(i+" ");
        }
    }
}