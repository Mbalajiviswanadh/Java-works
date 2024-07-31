import java.util.*;
class Countingstairs {
    public static int solve(int n){
        if(n<=3)
        return n;

        int prev1=3;
        int prev2=2;

        int count=0;
        for(int i=3;i<n;i++){
            count=prev1+prev2;
            prev2=prev1;
            prev1=count;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println();
        System.out.println(solve(n));
    }
}
