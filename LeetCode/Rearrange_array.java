import java.util.*;


class Rearrange_array {

    public static int[] rearrange(int nums[]){

        //creating new array to store the rearanged elements

        int answer[] = new int[nums.length];
        

        int pos=0;
        int neg=1;

        // for(int i=0;i<answer.length;i++){
        //     if(nums[i]>0){
        //         nums[pos]=nums[i];
        //         pos+=2;
        //     }
        //     else{
        //         nums[neg]=nums[i];
        //         neg+=2;
        //     }
        // }
        // return answer;
        for(int i : nums){
            if(i>0){
                answer[pos]=i;
                pos+=2;
            }
            else{
                answer[neg] =i;
                neg+=2;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter the values inside: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        
        int result[] = rearrange(nums);
        System.out.print("The Final Result :");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
}
