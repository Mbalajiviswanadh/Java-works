package General_Practice;

import java.util.*;


class NoOf_elemmentsIn_LinkedList{
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    
     Node head;
    public void push(int new_data){

        Node new_node= new Node(new_data);

        new_node.next=head;
        head=new_node;
    }
    public int getcount(){

        Node temp=head;
        int count=0;
        while(temp!=null){
           count++;
           temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the list:");
        // int n = sc.nextInt();
        // LinkedList ls= new LinkedList<n>();
        // ls.push(sc.nextInt());

        NoOf_elemmentsIn_LinkedList ls = new  NoOf_elemmentsIn_LinkedList();
        ls.push(1);
        ls.push(3);
        ls.push(1);
        ls.push(2);
        ls.push(1);

        System.out.println("Count of Node is: "+ ls.getcount());
    }
}