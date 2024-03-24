import java.util.*;

class Find_Duplicate_nums{

    public static int dulicateValue(int nums[],int n){

        Set<Integer> s = new HashSet<>();

        for(int i:nums){
            if(s.contains(i))
            return i;

            s.add(i);
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        System.out.println("ENter the values inside:");
        int nums[]=new int[n];
        for( int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }



        System.out.println("Result the duplicated value is : "+dulicateValue(nums,  n));

    }
}