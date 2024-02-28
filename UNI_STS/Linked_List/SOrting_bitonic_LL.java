package UNI_STS.Linked_List;

public class SOrting_bitonic_LL {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }

    class DLL{
        Node head=null, tail=null;

        void insert(int d){
            Node new_node= new Node(d);

            if(head==null){
                head=new_node;
                tail=new_node;
            }else{
            tail.next=new_node;
            new_node.prev=tail;
            tail=new_node;
            }
        }

        void display(){
            Node temp=head;
            while(temp!=head){
                System.out.println(temp.data+"<->");
                temp=temp.next;
            }
        }

        DLL sort(){
            Node p1=head,p2=tail;
            DLL result = new DLL();
            if(p1.data <=p2.data){
                result.insert(p1.data);
                p1=p1.next;
            }
            else{
                result.insert(p2.data);
                p2=p2.next;
            }
            result.insert(p1.data);
            return result;    
        }


    }

    public static void main(String[] args) {
        
    }
}
