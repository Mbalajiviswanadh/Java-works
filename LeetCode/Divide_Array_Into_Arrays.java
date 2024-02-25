import java.util.*;;
public class Divide_Array_Into_Arrays {
    
    public static int[][] divideArray(int numsarr[], int n ,int k){

        Arrays.sort(numsarr);
        
        List<int[]> new_array = new ArrayList<>(); 
        for(int i=2;i<numsarr.length;i+=3){

            if(numsarr[i] - numsarr[i-2] >k)
            return new int[][] {};

            new_array.add(new int[]{numsarr[i-2] , numsarr[i-1] , numsarr[i]});
        }
        return new_array.toArray(new int[new_array.size()] []);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int numsarr[]= new int[n];
        System.out.println("Enter the values inside:");
        for(int i=0;i<n;i++){
            numsarr[i]=sc.nextInt();
        }
        System.out.println("Enter the difference (K) value :");
        int k = sc.nextInt();
        int result[][]= divideArray(numsarr, n,k);
        System.out.println("result :");
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result.length;j++){
                System.out.print(result[i][j]+" ");
            }
        }
    }
}
