import java.util.*;
class Remove_LL_elements{
    static ListNode head;

    static class ListNode {
        ListNode next;
        int val;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public ListNode removeElements(ListNode head, int val) {

        ListNode newHead = new ListNode(0);

        newHead.next=head;
        ListNode curr = newHead;


        while(curr.next!=null){
            if(curr.next.val==val)
            curr.next = curr.next.next;
            else
            curr=curr.next;
        }
        return newHead.next;
    }
    public static void main(String[] args) {
        
    }
}