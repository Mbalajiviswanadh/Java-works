import java.util.*;

class Least_Number_Unique_K_Removals {

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int nums: arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }

        PriorityQueue<Integer> pq= new PriorityQueue<>(map.values());

        while(k>0){
            k-=pq.poll();
        }
        return k<0 ? pq.size() +1:pq.size();
        
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the values inside :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the K {no of removels} value :");
        int k= sc.nextInt();

        // findLeastNumOfUniqueInts(arr, k);
        System.out.println("The FInal Result :"+ findLeastNumOfUniqueInts(arr, k)    );
    }
}
