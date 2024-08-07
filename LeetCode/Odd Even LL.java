/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
class Solution {
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null)
        return head;
        
        ListNode od=head;
        ListNode ev=head.next;

        ListNode evenhead=ev;

        while(ev!=null && ev.next!=null){
            od.next=ev.next;
            od=od.next;
            ev.next=od.next;
            ev=ev.next;
        }
        od.next=evenhead;
        return head;
    }
}