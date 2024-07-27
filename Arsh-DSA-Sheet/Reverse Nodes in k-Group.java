import java.util.*;
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
class Solution {

    static class ListNode {
        ListNode nex;
        int val;

        ListNode (int val){
            this.next=null;
            this.val=val;
        }
    }
    public ListNode reverse(ListNode head, int k){
        ListNode prev=null;
        ListNode curr=head;

        int count=0;

        while(curr!=null && count<k){
            ListNode newNode = curr.next;
            curr.next=prev;

            prev=curr;
            curr=newNode;
            count++;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        int count=0;
        ListNode curr=head;
        while(curr!=null && count<k){
            curr=curr.next;
            count++;
        }

        if(count==k){
            ListNode reverseHead=reverse(head,k);

            head.next=reverseKGroup(curr,k);

            return reverseHead;
        }
        return head;
    }
}