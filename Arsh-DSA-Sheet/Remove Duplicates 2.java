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
    static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.next=null;
            this.val=val;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        return head;

        ListNode res = new ListNode(0);
        res.next=head;
        ListNode prev=res;

        ListNode curr=head;

        while(curr!=null){

            while(curr.next!=null && curr.val==curr.next.val){
                curr=curr.next;
            }
            if(prev.next==curr)
            prev=prev.next;
            else
            prev.next=curr.next;

            curr=curr.next;
        }
        return res.next;

        
        // Map<Integer,Integer> map = new HashMap<>();

        // ListNode curr=head;

        // while(curr!=null){
        //     int i=curr.val;
        //     map.put(i, map.getOrDefault(i,0)+1);
        //     curr=curr.next;
        // }
        
        // ListNode res = new ListNode(0);
        // ListNode temp=res;
        // for(Map.Entry<Integer,Integer> i : map.entrySet()){
        //     if(i.getValue()<2){
        //         ListNode newNode = new ListNode(i.getKey());
        //         temp.next=newNode;
        //         temp=temp.next;
        //     }
        // }

        // return res.next;
    }
}