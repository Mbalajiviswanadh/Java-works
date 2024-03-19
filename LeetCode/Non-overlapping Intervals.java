import java.util.*;
class Non_Overlapping_intervals{

    public static int findingTheInerval(int intervals[][],int n){
        Arrays.sort(intervals,Comparator.comparingInt(a -> a[1]));

        int count=1;
        int prev_num=intervals[0][1];

        for(int i=1;i<n;i++){
            if(intervals[i][0]<prev_num)
            continue;

            count++;
            prev_num=intervals[i][1];
        }
        return n-count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows :");
        int n = sc.nextInt();

        System.out.println("Enter the values inside :");
        int intervals[][]=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                intervals[i][j]=sc.nextInt();
            }
        }
        List<int[]> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(intervals[i]);
        }
        System.out.println("INput :");
        for(int val[]:l){
            System.out.print(Arrays.toString(val) +" ");
        }
        System.out.println();

        System.out.println("Result : "+findingTheInerval(intervals, n));
    }
}