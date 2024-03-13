import java.util.*;

class Find_pivotValue{
    public static int finding_pivot(int n){
        int leftSum =0;
        int rightSum=0;

        for(int i=1;i<=n;i++){

            leftSum=i*(i+1)/2;
            rightSum = n* (n+1)/2 - i*(i-1)/2;
            if(leftSum == rightSum)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt();

        System.out.println("Pivot Value is : "+finding_pivot(n));
    }

}