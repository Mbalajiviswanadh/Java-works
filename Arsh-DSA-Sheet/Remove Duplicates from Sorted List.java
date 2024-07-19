
import java.util.*;
class RemoveDuplicatesfromSortedList {
    
    static class ListNode {
        ListNode next;
        int data;
        ListNode(int data){
            this.next=null;
            this.data=data;
        }
    }

    public static ListNode solve(ListNode head){
        ListNode curr=head;

        while(curr!=null && curr.next!=null){
            if(curr.data!=curr.next.data)
            curr=curr.next;
            else
            curr.next=curr.next.next;
        }
        return head;
    }
}
