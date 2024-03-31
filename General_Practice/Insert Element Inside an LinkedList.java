import java.util.*;

class InsertElemevt{
    static Node head;
    static class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void insertEle(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node curr = head;
        while (curr.next!=null) {
            curr=curr.next;
        }
        curr.next=newNode;
    }

    

    public static void displayValues(){

        if(head==null){
            System.out.println("List is empty ");
            
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        InsertElemevt CInsertVal=new InsertElemevt();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of an array :");
        int n =sc.nextInt();
        System.out.println("ENetr the values inside :");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            CInsertVal.insertEle(data);
        }

        System.out.println("Inserted Values :");
        CInsertVal.displayValues();
    }
}