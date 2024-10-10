package TCS_TRANING.OCT_3_paper_codes;


import java.util.*;

class unique_Diff_inArray {
    
    public static List<List<Integer>> solve(int nums[], int k) {
        List<List<Integer>> res = new ArrayList<>();
        Set<String> uniquePairs = new HashSet<>(); // To store unique pairs as strings
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int diff = Math.abs(nums[i] - nums[j]);
                
                // If the absolute difference equals k
                if (diff == k) {
                    String pair1 = nums[i] + "," + nums[j];
                    String pair2 = nums[j] + "," + nums[i];
                    
                    // Ensure the pair is unique by checking if it's already added
                    if (!uniquePairs.contains(pair1) && !uniquePairs.contains(pair2)) {
                        uniquePairs.add(pair1);
                        uniquePairs.add(pair2);
                        
                        // Add the valid pair to the result list
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        res.add(list);
                    }
                }
            }
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        int n = sc.nextInt();
        
        int nums[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Input k
        int k = sc.nextInt();
        
        // Call the solve method to get unique pairs
        List<List<Integer>> res = solve(nums, k);
        
        // Print the result pairs
        for (List<Integer> pair : res) {
            System.out.println(pair);
        }
        System.out.print(res.size());
    }
}
