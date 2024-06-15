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
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public ListNode partition(ListNode head, int x) {
        // List<Integer> list1= new ArrayList<>();
        // List<Integer> list2= new ArrayList<>();

        // ListNode curr= head;

        // while(curr!=null){
        //     if(curr.val<x)
        //     list1.add(curr.val);
        //     else
        //     list2.add(curr.val);
            
        //     curr=curr.next;
        // }

        // curr= head;
        // int i=0;
        // int j=0;
        // while(curr!=null){
        //     if(i<list1.size()){
        //         curr.val=list1.get(i);
        //         i++;
        //     }
        //     else if(j<list2.size()){
        //         curr.val=list2.get(j);
        //         j++;
        //     }

        //     curr= curr.next;

        // }
        // return head;
        // Dummy nodes to hold the heads of partitions
        ListNode beforeHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode afterHead = new ListNode(0);
        ListNode after = afterHead;
        
        ListNode curr = head;
        
        // Traverse the original list
        while (curr != null) {
            if (curr.val < x) {
                // Append node to before partition
                before.next = curr;
                before = before.next;
            } else {
                // Append node to after partition
                after.next = curr;
                after = after.next;
            }
            curr = curr.next;
        }
        
        // Connect the end of before partition to the start of after partition
        after.next = null;
        before.next = afterHead.next;
        
        // Return the head of the partitioned list
        return beforeHead.next;
    }
}