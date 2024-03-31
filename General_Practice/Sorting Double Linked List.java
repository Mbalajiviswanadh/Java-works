import java.util.*;
class Sorting_DLL{
    static Node head=null;
    static Node tail=null;

    static class Node {
        Node next;
        Node prev;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public  void insertValue(int data){
        Node newNode = new Node(data);
        if(head ==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    public static void sorting() {
        if (head == null || head.next == null)
            return;

        Node current = head.next;
        while (current != null) {
            int value = current.data;
            Node temp = current.prev;
            while (temp != null && temp.data > value) {
                temp.next.data = temp.data;
                temp = temp.prev;
            }
            if (temp == null)
                head.data = value;
            else
                temp.next.data = value;
            current = current.next;
        }
    }


    public static void displayValues(){
        if(head==null){
            System.out.println("EMpty");
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sorting_DLL sortingDLL=new Sorting_DLL();
        System.out.println("Enter the sizxe :");
        int n=sc.nextInt();
        System.out.println("Enter the values inside:");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            sortingDLL.insertValue(data);
        }
        System.out.println("values entered ");
        displayValues();
        
        sortingDLL.sorting();
        displayValues();
    }
}