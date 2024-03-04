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
    //  adding at the first
   public void addFirst(String data){

        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;

   }

//    adding at the last
   public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node curr_node=head;
        while(curr_node.next!=null){
            curr_node=curr_node.next;
        }
        curr_node.next=newNode;
    }
    // printing the list

   public void printout(){
    Node curr_node=head;
    if(head==null){
        System.out.println("List is Empty");
        return;
    }

    while(curr_node!=null){
        System.out.print(curr_node.data+" -> ");
        // helps in itrating
        curr_node=curr_node.next;

    }
    System.out.println("NUll");
}

   public static void main(String[] args) {
    Add_DElete_inList list=new Add_DElete_inList();

    list.addFirst("name");
    list.addFirst("my");
    list.printout();

    list.addLast("is");
    list.printout();

    list.addLast("vissy");
    list.printout();
    
   }

}