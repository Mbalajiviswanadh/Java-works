import java.util.*;

import javax.print.attribute.standard.PrintQuality;


public class Priority_Queues{

    public static void printvalues_ascending(PriorityQueue<Integer> pq){
        PriorityQueue<Integer> temp = new PriorityQueue<>();
        temp.addAll(pq);

        System.out.println("values in sorted order:");
        while(!temp.isEmpty()){
            System.out.print(temp.poll()+" ");
        }
        System.out.println();
    }

    public static void printvalues_descending(PriorityQueue<Integer> pq){
        PriorityQueue<Integer> dpq= new PriorityQueue<>(Comparator.reverseOrder());
        
        dpq.addAll(pq);
        System.out.println("Values in sorted-descending order:");

        while(!dpq.isEmpty()){
            System.out.print(dpq.poll()+" ");
        }
        System.out.println();
    }


    public static void funcs(PriorityQueue<Integer> pq){

        PriorityQueue<Integer> temp =new PriorityQueue<>();

       
        

        temp.addAll(pq);
        System.out.println();
        // System.out.println(temp.poll());

        // System.out.println(temp.poll());
        // System.out.println(temp.peek());
        System.out.println("<--------------- beofre---------->");
        System.out.println(temp);
        int c=0;
        for(int i=0;i<pq.size();i++){
            c= temp.poll();
            
            System.out.println(c+1+" ");
        }
        temp.add(c);
        
        
        System.out.println("<---------------After---------->");

        System.out.println(temp);

    }



    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        pq.add(20);
        pq.add(10);
        pq.add(4);
        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(6);

        System.out.println("values from treeHeap");
        System.out.println(pq);
        System.out.println();
        printvalues_ascending(pq);

        System.out.println();
        printvalues_descending(pq);

        System.out.println("=============");
        funcs(pq);

        
    }
}