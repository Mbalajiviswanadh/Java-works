import java.util.*;
class Count_max_freq{

    public static int findngthe_count(int arr[],int n){

        int max_freq=0;
        int count=0;

        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int num:arr){
            int freq=hm.getOrDefault(num, 0)+1;
            hm.put(num, freq);
            max_freq=Math.max(max_freq, freq);
        }

        for(int fr : hm.values()){
            if(fr==max_freq)
            count++;
        }
        return count*max_freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of an array:");
        int n =sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the values inside:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Result : "+findngthe_count(arr, n));

    }
}