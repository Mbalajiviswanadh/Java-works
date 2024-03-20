package UNI_STS.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class queuePerm {

    public static boolean isStackPerm(Queue<Integer> input_q,Queue<Integer> output_q){

        Stack<Integer> st = new Stack<>();

        while(! input_q.isEmpty()){
            int curr=input_q.poll();
            while (!st.isEmpty() && st.peek() == output_q.peek()) {
                st.pop();
                output_q.poll();
            }
        }
        if(st.isEmpty() && output_q.isEmpty()){
            return true;
        }
        return false;
    }
    public static void display(Queue<Integer>input_q, Queue<Integer> output_q,int n ){

        System.out.println("INput Queue :");
        for(int i=0;i<n;i++){
            int curr=input_q.poll();
            System.out.print(curr+" ");
            input_q.offer(curr);
        }
        System.out.println();
        System.out.println("Output Queue :");
        for(int i=0;i<n;i++){
            int curr=output_q.poll();
            System.out.print(curr+" ");
            output_q.offer(curr);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> input_q=new LinkedList<>();
        Queue<Integer> output_q=new LinkedList<>();

        System.out.println("Enter the size :");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("ENter the values inside the input_queue : ");
        for(int i =0;i<n;i++){
            input_q.offer(sc.nextInt());
        }
        System.out.println("ENter the values inside the output_queue : ");
        for(int i =0;i<n;i++){
            output_q.offer(sc.nextInt());
        }

        System.out.println("-----------------------Taken Queues-----------------");
        display(input_q, output_q, n);

        System.out.println("Result : "+ isStackPerm(input_q, output_q) );
    }
}
