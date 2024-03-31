import java.util.*;
class InsertValues_twoArrays{

    public static int[] intersect(int[] nums1, int[] nums2){
        Map<Integer,Integer> map= new HashMap<>();

        for(int i:nums1)
        map.put(i,map.getOrDefault(i, 0)+1);

        List<Integer> values = new ArrayList<>();
        for(int j:nums2){
            if(map.containsKey(j) && map.get(j)>0){
                values.add(j);
                map.put(j,map.get(j)-1);
            }
        }

        int res[]= new int[values.size()];
        for(int i=0;i<values.size();i++){
            res[i]=values.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1st array :");
        int n1=sc.nextInt();

        System.out.println("Ener the values :");
        int nums1[]=new int[n1];
        for(int i=0;i<n1;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of 2st array :");
        int n2=sc.nextInt();

        System.out.println("Ener the values :");
        int nums2[]=new int[n2];
        for(int i=0;i<n2;i++){
            nums2[i]=sc.nextInt();
        }

        System.out.println("Result :");
        int res[]= intersect(nums1, nums2);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}