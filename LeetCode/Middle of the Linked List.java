// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
import java.util.*;
class Solution {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
            
        }
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast =head;
         while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next;  
        }
        
        return slow;
    }
}