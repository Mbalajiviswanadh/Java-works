import java.util.*;

class COmbinationsSUmTwo{
    public static List<List<Integer>> combinationSum(int[] candi, int target){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        // Sort the array to handle duplicates easily
        Arrays.sort(candi);
        backtrack(0, target, candi, path, res);
        return res; 
    
    }
    public static void backtrack(int idx, int target, int[] candi,  List<Integer> path,List<List<Integer>> res ){
        if(target==0){

            res.add(new ArrayList<>(path));
            return;
        }

        for(int i=idx;i<candi.length;i++){
            // avoiding duplicates
            if( i> idx && candi[i]==candi[i-1])
            continue;

            if(candi[i]> target)
            break;
            
            path.add(candi[i]);
            backtrack(i+1, target-candi[i], candi, path, res);
            path.remove(path.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size :");
        int n = sc.nextInt();

        int[] candi= new int[n];
        System.out.println("ENter the values inside :");
        for(int i=0;i<n;i++){
            candi[i]=sc.nextInt();
        }

        System.out.println("Enter the target values :");
        int target = sc.nextInt();

        // calling the funtion 
        List<List<Integer>> res = combinationSum(candi, target);
        for(List<Integer> num : res){
            System.out.print(num +" ");
        }
        sc.close();
    }
}