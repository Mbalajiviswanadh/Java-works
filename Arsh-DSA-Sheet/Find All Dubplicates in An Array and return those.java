import java.util.*;

class FindAll_Duplicates{
    public static List<Integer> solve(int nums[] ){

        List<Integer> res = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            if(!set.contains(i))
            set.add(i);
            else
            res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int nums[]= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }


        List<Integer> res= solve(nums);
        System.out.println();
        for(int i: res){
            System.out.print(i+" ");
        }
    }
}