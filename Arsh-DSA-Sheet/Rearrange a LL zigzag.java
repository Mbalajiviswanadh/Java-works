
import java.util.*;

class Solution {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node zigZag(Node head) {
        // add code here.
        
        if(head==null || head.next==null)
        return head;
        
        Node res =new Node (0);
        Node temp=res;
        
        boolean flag=true;
        
        Node curr=head;
        
        while(curr!=null && curr.next!=null){
            
            if(flag){
                
                if(curr.data < curr.next.data){
                    temp.next=curr;
                    curr=curr.next;
                }
                else{
                    temp.next=curr.next;
                    curr.next=curr.next.next;
                }
            }
            else{
                if(curr.data > curr.next.data){
                    temp.next=curr;
                    curr=curr.next;
                }
                else{
                    temp.next=curr.next;
                    curr.next=curr.next.next;
                }
            }
            
            temp=temp.next;
            flag =!flag;

        }
        
        if(curr!=null)
        temp.next=curr;
        
        return res.next;

    }
}