import java.util.*;
class Reversing_LinkedList{

   static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // insert

    public static void insert(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }

    // reversing

    public static void reversing(){
        if(head==null || head.next==null){

            return;
        }

        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;


            // updationg
            prev=curr;
            curr=nextNode;
        }
        head.next=null;
        head=prev;

    }

    // displaying

    public static void displayValues(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Reversing_LinkedList rl=new Reversing_LinkedList();
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        System.out.println("Enetr the values inside:");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            rl.insert(data);
        }

        System.out.println("Result before reversing:");
        rl.displayValues();

        rl.reversing();

        System.out.println("Result after reversing:");
        rl.displayValues();
    }



}