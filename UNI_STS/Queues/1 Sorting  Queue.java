package UNI_STS.Queues;
import java.util.*;
 class Sorting_Queue {

    public static int findMinx_Idx(Queue<Integer> q, int n, int tilIdx){

        int min_val=Integer.MAX_VALUE;
        int min_idx=0;

        for(int i=0;i<n;i++){
            int curr=q.poll();
            if(i<=tilIdx && curr<min_val){
                min_val=curr;
                min_idx=i;
            }q.offer(curr);
        }
        return min_idx;
    }


    

    public static void insert_at_the_end(Queue<Integer>q,int n,int min_idx){
        int minval=0;
        for(int i=0;i<n;i++){
            int curr=q.poll();
            if(i==min_idx){
                minval=curr;
                continue;
            }
            q.offer(curr);
        }
        q.offer(minval);
    }

    public static void display(Queue<Integer> q, int n){
        for(int i=0;i<n;i++){
            int curr=q.poll();
            System.out.print(curr+" ");
            q.offer(curr);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n =sc.nextInt();
        System.out.println("Enter the values inside :");
        for(int i=0;i<n;i++){
            q.offer(sc.nextInt());
        }

        System.out.println("Before : ");
        
        display(q, n);

        for(int i=0;i<n;i++){
            int midx=findMinx_Idx(q, n, n-i-1);
            insert_at_the_end(q, n, midx);  
        }

        System.out.println("Result : ");
        display(q, n);
    }
}
