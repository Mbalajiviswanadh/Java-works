import java.util.*;

class Solution {
    
    static class Node{
        Node next;
        int data;

        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    
    public Node reverseRight(Node rightpart){
        
        Node prev=null;
        Node curr=rightpart;
        while(curr!=null){
            Node newNode = curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=newNode;
        }

        
        return prev;
    }
    
    public void solve(Node leftpart, Node reverse){
        
        Node res= new Node(0);
        Node curr=res;
        while(leftpart != null && reverse !=null){
            curr.next = leftpart;
            leftpart=leftpart.next;
            curr=curr.next;
            curr.next = reverse;
            reverse=reverse.next;
            curr=curr.next;
        }
        
        if(leftpart != null){
            curr.next = leftpart;
        }
    }
    
    public Node mid(Node head){
        Node fast = head;
        Node slow = head;
        
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    
    
    void reorderlist(Node head) {
        // Your code here
        
        if(head==null || head.next == null)
        return ;
        
        Node midval=mid(head);
        
        Node right=midval.next;
        midval.next=null;
        
        // Node leftpart= reorderlist(head);

        Node reverseNode=reverseRight(right);
        
        solve(head,reverseNode);
        
        
    }
}