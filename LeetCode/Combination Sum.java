import java.util.*;

class Combination_SUm{

    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(0, target, res, path, candidates);

        return res;
    }

    public static void backtrack(int idx, int target, List<List<Integer>> res, List<Integer> path, int[] candidates){
        if(idx==candidates.length){
            if(target==0)
            res.add(new ArrayList<>(path));

            return;
        }

        if(candidates[idx] <= target){
            path.add(candidates[idx]);
            backtrack(idx, target-candidates[idx], res, path, candidates);
            path.remove(path.size()-1);
        }
        backtrack(idx+1, target, res, path, candidates);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of the nums :");
        int n=sc.nextInt();
        int candidates[]= new int[n];
        System.out.println("Enter the values inside :");
        for(int i=0;i<n;i++){
            candidates[i]=sc.nextInt();
        }
        System.out.println("ENter the target value :");
        int target = sc.nextInt();
        // calling the function
        List<List<Integer>> res = combinationSum(candidates, target);
        for(List<Integer> num : res){
            System.out.print(num+ " ");
        }
    }
}