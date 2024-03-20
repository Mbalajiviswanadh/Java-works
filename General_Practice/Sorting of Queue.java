import java.util.*;
class Soting_Queus{

    public static int find_min_idx(Queue<Integer> q, int n,int tillIdx){

        int min_value = Integer.MAX_VALUE;
        int min_index=0;

        for(int i=0;i<n;i++){
            int curr=q.poll();
            if(i<=tillIdx && curr<min_value){
                min_value=curr;
                min_index=i;
            }
            q.offer(curr);
        }
        return min_index;
    }


    public static void insert_AtEnd(Queue<Integer> q, int n, int min_index){
        int minvalue=0;
        for(int i=0;i<n;i++){
            int curr=q.poll();
            if(i==min_index){
                minvalue=curr;
                continue;
            }
            q.offer(curr);
        }
        q.offer(minvalue);
    }
    public static void display(Queue<Integer> q){

        for(int i=0;i<q.size();i++){
            int curr=q.poll();
            System.out.print(curr+" ");
            q.offer(curr);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Size:");
        int n =sc.nextInt();
        System.out.println("Insert the values inside :");
        for(int i=0;i<n;i++){
            q.offer(sc.nextInt());
        }

        System.out.println("Input before sorting :");
        display(q);

        for(int i=0;i<n;i++){
            int min_idx=find_min_idx(q, n, n-i-1);
            insert_AtEnd(q, n, min_idx);
        }
        System.out.println("After soting :");
        display(q);

    }
}