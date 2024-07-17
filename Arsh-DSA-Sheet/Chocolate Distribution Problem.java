import java.util.*;

class ChocolateDistributionProblem{


    public static int solve(ArrayList<Integer> nums, int m){

        Collections.sort(nums);

        int res = Integer.MAX_VALUE;
        for(int i=0;i<nums.size()-m+1;i++){
            int minvalue= nums.get(i);
            int maxvalue= nums.get(i+m-1);
            res = Math.min(res,maxvalue-minvalue);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        ArrayList<Integer> nums= new ArrayList<>();

        for(int i=0;i<n ;i++){
            nums.add(sc.nextInt());
        }

        System.out.println("Number of students : ");
        int m=sc.nextInt();

        System.out.print(solve(nums,m));
    }
}
