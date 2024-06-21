import java.util.*;

class Subsets2{

    public static List<List<Integer>> subset2(int nums[]){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        Arrays.sort(nums);
        backtrack(nums, 0, res, path);
        return res;
    }

    public static void backtrack(int nums[], int idx, List<List<Integer>> res , List<Integer> path){
        res.add(new ArrayList<>(path));

        for(int i=idx;i<nums.length;i++){
            if(i != idx && nums[i]==nums[i-1])
            continue;

            path.add(nums[i]);
            backtrack(nums, i+ 1, res, path);
            path.remove(path.size()-1);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n =sc.nextInt();

        int nums[]=new int[n];

        System.out.println("Enter the values inside :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        // caling the fun
        List<List<Integer>> res = subset2(nums);
        for(List<Integer> num : res){
            System.out.print(num +" ");
        }
    }
}