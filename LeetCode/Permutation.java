import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public void backtrack(List<List<Integer>> res, ArrayList<Integer> temp, int[] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i : nums){
            if(temp.contains(i))
            continue;

            temp.add(i);

            backtrack(res,temp,nums);

            temp.remove(temp.size()-1);
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums);
        return res;
    }
    
}
