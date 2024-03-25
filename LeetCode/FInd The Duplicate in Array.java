import java.util.*;
class FInding_DUplicate{
    public static List<Integer> findg_duplicates(int nums[],int n){

        List<Integer> result = new ArrayList<>();
        Set<Integer> s = new HashSet<>();

        for(int i : nums){
            if(!s.add(i))
            result.add(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of an array:");
        int n =sc.nextInt();

        System.out.println("ENter the values insdie :");
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }


        // calling the function 

        List<Integer> res=findg_duplicates(nums, n);
        System.out.println("Result : "+res);
    }
}