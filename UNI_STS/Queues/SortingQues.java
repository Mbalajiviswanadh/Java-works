package UNI_STS.Queues;

// import java.util.LinkedList;
// import java.util.Queue;

// public class SortingQues {

//     public static int find_Min_val(Queue<Integer> q, int tillIdx,int n){
//         int min_val=Integer.MAX_VALUE,min_idx=0,curr;
//         for(int i =0;i<n;i++){
//              curr=q.poll();

//             if(i<=tillIdx && curr < min_val){
//                 min_val=curr;
//                 min_idx=i;
//             }
//             q.offer(curr);
//         }
//         return min_idx;
//     }

//     public static insertAt_ENd(Queue<Integer> q, int min_idx,int n, int curr){
//         int minvalue;
//         for(int i =0;i<n;i++){
//             curr=q.poll();
//             if(i==min_idx)
//             minvalue=curr;
//             else
//             q.offer(curr);
//         }
//         return q.offer(minvalue);
//     }

    


//     public static void main(String[] args) {
//         Queue<Integer> q =new LinkedList<Integer>();
//         q.offer(4);
//         q.offer(3);
//         q.offer(1); 
//         q.offer(2);
//         int n =q.size();


//     }
// }

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