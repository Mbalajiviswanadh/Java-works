import java.util.*;

class Three3Sum {
    
    public static List<List<Integer>> solve(int[] nums){
        
        if(nums.length<3 || nums==null)
        return new ArrayList<>();
        
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                
                if(sum==0){
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                }
                else if(sum<0)
                l++;
                else
                r--;
            }
        }
        return new ArrayList<>(res);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int nums[]= new int[n];
        
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        
        List<List<Integer>> res = solve(nums);
        
        for(List<Integer> i : res){
            System.out.print(i+" ");
        }
    }
}
