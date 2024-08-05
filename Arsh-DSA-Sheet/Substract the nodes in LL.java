
import java.util.*;
class SubstartcTheLL {

    static class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public int getsize(Node head){
        int size=0;
        
        while(head!=null){
            head=head.next;
            size++;
        }
        return size;
       
    }
    public Node reverse(Node h){
        
        Node prev=null;
        
        Node curr=h;
        while(curr!=null){
            Node newNode = curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=newNode;
        }
        return prev;
    }
    
    public Node subLinkedList(Node h1, Node h2) {
        // code here
        // removing the starting zeros
        
        while(h1 != null && h1.data==0)
        h1=h1.next;
        
        while(h2!=null && h2.data==0)
        h2=h2.next;
        
       
        
        int s1=getsize(h1);
        int s2=getsize(h2);
        if(s1==0 && s2==0) return new Node(0);
        
        if(s2>s1){
            Node temp=h1;
            h1=h2;
            h2=temp;
        }
        
        if(s1==s2){
            
            Node curr1=h1;
            Node curr2=h2;
            while(curr1.data==curr2.data){
                curr1=curr1.next;
                curr2=curr2.next;
                
                
                if(curr1==null)
                return new Node(0); 
            }
            
            if(curr2.data>curr1.data){
                Node temp=h1;
                h1=h2;
                h2=temp;
            }
            
        }
        
        h1=reverse(h1);
        h2=reverse(h2);
        
        Node res = null;
        
        while(h1!=null){
            int n1=h1.data;
            int n2=0;
            if(h2!=null)
            n2=h2.data;
            
            if(n2>n1){
                
                if(h1.next!=null)
                h1.next.data-=1;
                
                n1+=10;
            }
            Node curr=new Node(n1-n2);
            curr.next=res;
            res=curr;
            
            h1=h1.next;
            if(h2!=null)
            h2=h2.next;
        }
        
        
        while(res!=null && res.next!=null){
            if(res.data==0)
            res=res.next;
            else
            break;
        }
        
        return res;
        
        
        
    }
}
       