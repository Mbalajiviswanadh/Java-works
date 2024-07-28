import java.util.*;

class SmallestPositive_Missing{

    public static int solve(int nums[]){

        Set<Integer> set = new HashSet<>();

        for(int i: nums){
            if(i>0)
            set.add(i);
        }

        int check=1;
        while(set.contains(check))
        check++;

        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int nums[]= new int[n]  ;
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        
        System.out.println();
        System.out.println(solve(nums));
    }
}