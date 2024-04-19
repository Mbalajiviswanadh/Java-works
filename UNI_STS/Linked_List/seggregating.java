package UNI_STS.Linked_List;
import java.util.*;
class Segregate
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void segregateEvenOdd()
    
    {
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node currentNode = head;
       
        while(currentNode != null) {
            int element = currentNode.data;
           

            if(element % 2 == 0) {
               
                if(evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }
               
            } else {
               
                if(oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }
            }
            currentNode =  currentNode.next;
        }
        if(oddStart == null || evenStart == null) {
            return;
        }
       
        evenEnd.next = oddStart;
        oddEnd.next = null;
        head=evenStart;
    }
    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
   
    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Segregate llist = new Segregate();
        llist.push(3);
        llist.push(2);
        llist.push(1);
        llist.push(4);
        llist.push(5);
       
        System.out.println("Original Linked List");
        llist.printList();


        llist.segregateEvenOdd();


        System.out.println("Modified Linked List");
        llist.printList();
    }
}


// public class seggregating {

//     static class Node {
//         int data;
//         Node next;
//         Node(int d){
//             data =d;
//             next = null;
//         } 
//     }

    

//     class LL{
//         static Node head = null, tail=null;

//         void insert(int d){
//             Node new_node=new Node(d);
//             if(head==null){
//                 head=new_node;
//                 tail=new_node;
//             }else{
//                 tail.next=new_node;
//                 tail=new_node;
//             }
//         }

//         static void display(){
//             Node temp = head;
//             while(temp!=null){
//                 System.out.println(temp.data+" -> ");
//                 temp=temp.next;
//             }
//         }

//         static void segregate(){
//             Node evenHead=null,evenTail=null,oddHead=null,oddTail=null,temp=head;
//             while(temp!=null){
//                 Node n=new Node(temp.data);
//                 if(temp.data % 2==0){
//                     if(evenHead==null){
//                         evenHead=n;
//                         evenTail=n;
//                     }
//                     evenTail.next=n;
//                     evenTail=n;
//                 }
//                 else{
//                     if(oddHead==null){
//                         oddHead=n;
//                         oddTail=n;
//                     }
//                     oddTail.next=n;
//                     oddTail=n;
//                 }
//                 temp=temp.next;
//             }

//             if (evenHead !=null) {
//                 evenTail.next=oddHead;
//                 head=evenHead;
//                 tail=oddTail;
//             }else{
//                 head= oddHead;
//                 tail=oddTail;
//             }
//         }
//     }
//     public static void main(String[] args) {
        
//     }
// }
