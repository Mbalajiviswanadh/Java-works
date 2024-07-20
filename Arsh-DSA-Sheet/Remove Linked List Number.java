import java.util.*;

class RemoveLinkedListNumber {
    
    static class ListNode {
        ListNode next;
        int val;
        ListNode(int data){
            this.next=null;
            this.val=val;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy= new ListNode(0);
        dummy.next=head;

        ListNode prev=dummy;
        ListNode curr=head;

        while(curr!=null){
            if(curr.val != val)
            prev=curr;
            else
            prev.next=curr.next;

            curr=curr.next;
        }
        return dummy.next;
    }
}
