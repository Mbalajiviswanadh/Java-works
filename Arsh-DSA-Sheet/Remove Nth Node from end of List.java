import java.util.*;

class RemoveNth_Node_fromEndofList{

    static ListNode head;
    static class ListNode{
        ListNode next;
        int data;

        ListNode(int data){
            this.next=null;
            this.data=data;
        }
    }


    public static ListNode removeElement(ListNode head, int n){

        if(head.next==null)
        return null;

        int size=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }

        if(n==size)
        return head.next;

        int prev_pos=size-n;

        ListNode prevnode = head;
        int i=1;
        while(i<prev_pos){
            prevnode=prevnode.next;
            i++;
        }
        prevnode.next=prevnode.next.next;
        return head;
    }
}