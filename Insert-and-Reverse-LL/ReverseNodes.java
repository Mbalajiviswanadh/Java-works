// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static Node head=null;
    static class Node{
        Node next;
        int data;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static void insertValue(int n){
        Node newNode = new Node(n);
        
        
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        
    }
    
    public static void printValues(){
        
        if(head==null)
        System.out.print("NULL");
        
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("NULL");
    }
    
    public static void reverseValues(){
        
        if(head==null)
        System.out.print("NULL");
        
        Node prevNode=head;
        Node curr=head.next;
        
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next=prevNode;
            
            prevNode=curr;
            curr=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insertValue(data);
        }
        
        printValues();
        reverseValues();
        System.out.println();
        printValues();
    }
}