import java.util.*;
class MinimumSwaptosort {

    public static void swapfun(int arr[] , int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static int solve(int nums[]){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);

        int count=0;

        for(int i=0;i<nums.length;i++){
            if(i==map.get(nums[i]))
            continue;
            else{
                count++;
                swapfun(nums,i,map.get(nums[i]));
                i--;
            }
        }
        return count;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int nums[]= new int[n];

        for(int i =0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println();
        System.out.print(solve(nums));
        sc.close();
    }
}
