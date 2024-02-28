package UNI_STS.Linked_List;
import java.util.*;
public class seggregating {

    static class Node {
        int data;
        Node next;
        Node(int d){
            data =d;
            next = null;
        } 
    }

    

    class LL{
        static Node head = null, tail=null;

        void insert(int d){
            Node new_node=new Node(d);
            if(head==null){
                head=new_node;
                tail=new_node;
            }else{
                tail.next=new_node;
                tail=new_node;
            }
        }

        static void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data+" -> ");
                temp=temp.next;
            }
        }

        static void segregate(){
            Node evenHead=null,evenTail=null,oddHead=null,oddTail=null,temp=head;
            while(temp!=null){
                Node n=new Node(temp.data);
                if(temp.data % 2==0){
                    if(evenHead==null){
                        evenHead=n;
                        evenTail=n;
                    }
                    evenTail.next=n;
                    evenTail=n;
                }
                else{
                    if(oddHead==null){
                        oddHead=n;
                        oddTail=n;
                    }
                    oddTail.next=n;
                    oddTail=n;
                }
                temp=temp.next;
            }

            if (evenHead !=null) {
                evenTail.next=oddHead;
                head=evenHead;
                tail=oddTail;
            }else{
                head= oddHead;
                tail=oddTail;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
