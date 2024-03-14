package UNI_STS.Queues;

import java.util.*;

class Sorting_Using_Queues{

    public static void sorting(Queue<Integer> qu){
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Queue <Integer> qu=new LinkedList<>();
        System.out.println("Enter the size of the queue");
        
        int n =sc.nextInt();
        System.out.println("Enter the values inside :");
        for(int i=0;i<n;i++){
            qu.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){

            System.out.print(qu.peek() +" ");
            qu.poll(); //deleted 
        }
    }
}