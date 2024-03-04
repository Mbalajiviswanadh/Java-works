import java.util.*;


class Add_DElete_inList{
   static Node head;

   class Node{
    String data;
    Node next;

    Node(String data){
        this.data=data;
        this.next=null;
    }

   }    

   public void addFirst(String data){

        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;

   }

   public void printout(){

    if(head==null){
        System.out.println("List is Empty");
        return;
    }

    Node curr_node=head;
    while(curr_node!=null){
        System.out.print(curr_node.data+" -> ");
        // helps in itrating
        curr_node=curr_node.next;

    }
    System.out.print("NUll");
   }

   public static void main(String[] args) {
    Add_DElete_inList list=new Add_DElete_inList();

    list.addFirst("name");
    list.printout();
    
   }

}