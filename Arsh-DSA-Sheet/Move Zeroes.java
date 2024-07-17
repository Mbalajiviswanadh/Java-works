import java.util.*;
class MoveZeroes {
    public static void moveZeroes(int[] nums) {
    int idx=0;

        int zerosCount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[idx]=nums[i];
                idx++;
            }
            else if(nums[i]==0)
            zerosCount++;
        }

        for(int i=0;i<zerosCount;i++){
            nums[idx]=0;
            idx++;
        }

    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int nums[]= new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        moveZeroes(nums);

        for(int i: nums){
            System.out.print(i+" ");
        }


    }
}

