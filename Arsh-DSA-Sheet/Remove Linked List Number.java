import java.util.*;

class RemoveLinkedListNumber {
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
