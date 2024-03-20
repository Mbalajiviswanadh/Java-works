package UNI_STS.Queues;
import java.util.*;
class Main{
    public static int findMin(Queue<Integer> q,int n,int tidx){
        int mv = Integer.MAX_VALUE,midx = 0;
        for(int i = 0; i < n; i++){
            int curr = q.poll();
            if(i <= tidx && curr<mv){
                mv = curr;
                midx = i;
            }
            q.offer(curr);
        }
        return midx;
    }
    public static void insertAtEnd(Queue<Integer> q,int n,int midx){
        int mv = 0;
        for(int i = 0; i < n; i++){
            int curr = q.poll();
            if(i == midx){
                mv = curr;
                continue;
            }
            q.offer(curr);
        }
        q.offer(mv);
    }
    public static void display(Queue<Integer> q,int n){
        for(int i = 0; i < n; i++){
            int curr = q.poll();
            System.out.print(curr+" ");
            q.offer(curr);
        }
        System.out.println();
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.offer(4);
        q.offer(3);
        q.offer(1);
        q.offer(2);
        int n = q.size();
        System.out.println("Before sorting:");
        display(q,n);
        for(int i = 0; i < n; i++){
            int midx = findMin(q,n,n-i-1);
            insertAtEnd(q,n,midx);
        }
        System.out.println("After sorting:");
        display(q,n);
    }
}